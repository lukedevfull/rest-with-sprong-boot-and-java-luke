package br.com.lukedevfull.logicalMethods.mathMethods;

import br.com.lukedevfull.exeptions.UnsupportedMathOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.lukedevfull.logicalMethods.LogicalHandler;

@Component
public class MathMethods {
    
    private final LogicalHandler logicalHandler;
    
    @Autowired
    public MathMethods(LogicalHandler logicalHandler) {
        this.logicalHandler = logicalHandler;
    }
    
    public Double subtract(
            String numberOne,
            String numberTwo
    ) {
        // Check if both numbers are numeric using the logical handler
        if (!this.logicalHandler.checkIfNumeric(numberOne) || !this.logicalHandler.checkIfNumeric(numberTwo)) {
            throw new UnsupportedMathOperation("Please enter a numeric value!");
        }
        
        Double num1 = logicalHandler.parseToDouble(numberOne);
        Double num2 = logicalHandler.parseToDouble(numberTwo);
        
        return num1 - num2;
    }
    //Sum
    public Double sum(String numberOne, String numberTwo) {
        if (!this.logicalHandler.checkIfNumeric(numberOne) || !this.logicalHandler.checkIfNumeric(numberTwo)) {
            throw new UnsupportedMathOperation("Please enter a numeric value!");
        }

        Double num1 = logicalHandler.parseToDouble(numberOne);
        Double num2 = logicalHandler.parseToDouble(numberTwo);

        return num1 + num2;
    }
    //Multiply
    public Double multiply(String numberOne, String numberTwo) {
        if (!this.logicalHandler.checkIfNumeric(numberOne) || !this.logicalHandler.checkIfNumeric(numberTwo)) {
            throw new UnsupportedMathOperation("Please enter a numeric value!");
        }

        Double num1 = logicalHandler.parseToDouble(numberOne);
        Double num2 = logicalHandler.parseToDouble(numberTwo);

        return num1 * num2;
    }
    //Divide
    public Double divide(String numberOne, String numberTwo) {
        if (!this.logicalHandler.checkIfNumeric(numberOne) || !this.logicalHandler.checkIfNumeric(numberTwo)) {
            throw new UnsupportedMathOperation("Please enter a numeric value!");
        }

        Double num1 = logicalHandler.parseToDouble(numberOne);
        Double num2 = logicalHandler.parseToDouble(numberTwo);

        return num1 / num2;
    }
    //Percentage
    public Double percentage(String numberOne, String numberTwo) {
        if (!this.logicalHandler.checkIfNumeric(numberOne) || !this.logicalHandler.checkIfNumeric(numberTwo)) {
            throw new UnsupportedMathOperation("Please enter a numeric value!");
        }

        Double num1 = logicalHandler.parseToDouble(numberOne);
        Double num2 = logicalHandler.parseToDouble(numberTwo);

        return (num1 / num2) * 100;
    }
}
