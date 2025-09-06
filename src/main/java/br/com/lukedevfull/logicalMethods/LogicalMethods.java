package br.com.lukedevfull.logicalMethods;

import br.com.lukedevfull.exeptions.UnsupportedMathOperation;

public class LogicalMethods {
    
    protected LogicalMethods() {
        // Construtor protegido para forçar herança controlada
    }
    
    protected Double convertToDouble(String strNumber) {
        if (strNumber == null || strNumber.isEmpty())
            throw new UnsupportedMathOperation("Please enter a numeric value!");

        String number = strNumber.replaceAll(",", ".");
        return Double.parseDouble(number);
    }

    protected boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
