package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Models.Calculator;
import com.example.demo.Models.CalculatorRepo;


@Controller
public class CalculatorController {
	
	@Autowired
	CalculatorRepo calculatorRepo;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("operator", "+");
		model.addAttribute("view", "views/calculatorForm");
		return "base-layout";
	}
	
	@PostMapping("/")
	public String index(
			@RequestParam String leftOperand,
			@RequestParam String operator,
			@RequestParam String rightOperand,
			Model model
	) {
		double leftNumber;
		double rightNumber;

		try {
			leftNumber = Double.parseDouble(leftOperand);
		}
		catch (NumberFormatException ex) {
			leftNumber = 0;
		}

		try {
			rightNumber = Double.parseDouble(rightOperand);
		}
		catch (NumberFormatException ex) {
			rightNumber = 0;
		}
		
		Calculator calculator = new Calculator(
				leftNumber,
				rightNumber,
				operator
		);
		
		//double result = calculator.calculateResult();
		
		
		        double result = 0;
		        switch(operator) {
		            case "+":
		                result = leftNumber + rightNumber;
		                break;
		            case "-":
		                result = leftNumber - rightNumber;
		                break;
		            case "*":
		                result = leftNumber * rightNumber;
		                break;
		            case "/":
		                result = leftNumber / rightNumber;
		                break;
		            case "^":
		                result = Math.pow(leftNumber,rightNumber);
		                break;
		            default:
		                    result = 0;
		        }
		
		 Calculator cal = new Calculator();
		 cal.setLeftOperand(leftNumber);
		 cal.setRightOperand(rightNumber);
		 cal.setOperator(operator);
		 cal.setResult(result);
		 Calculator c = calculatorRepo.save(cal);
		model.addAttribute("leftOperand", c.getLeftOperand());
		model.addAttribute("operator", c.getOperator());
		model.addAttribute("rightOperand", c.getRightOperand());
		model.addAttribute("result", c.getResult());

		model.addAttribute("view", "views/calculatorForm");
		return "base-layout";
	}
}
