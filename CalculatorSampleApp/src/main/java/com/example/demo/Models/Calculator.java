package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Calculator")
public class Calculator {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private double leftOperand;
    private double rightOperand;
    private String operator;
    private double result;
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public Calculator()
    {
    	
    }

    public Calculator(double leftOperand, double rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }


    public double getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(double leftOperand) {
        this.leftOperand = leftOperand;
    }

    public double getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(double rightOperand) {
        this.rightOperand = rightOperand;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

	/*
	 * public double calculateResult() { double result = 0; switch(this.operator) {
	 * case "+": result = this.leftOperand + this.rightOperand; break; case "-":
	 * result = this.leftOperand - this.rightOperand; break; case "*": result =
	 * this.leftOperand * this.rightOperand; break; case "/": result =
	 * this.leftOperand / this.rightOperand; break; case "^": result =
	 * Math.pow(this.leftOperand,this.rightOperand); break; default: result = 0; }
	 * 
	 * return result; }
	 */
}
