package br.com.lukedevfull.logicalMethods;

import org.springframework.stereotype.Component;

@Component
public class LogicalHandler extends LogicalMethods {
    
    public LogicalHandler() {
        // Spring will manage this bean's lifecycle
    }
    
    public Double parseToDouble(String number) {
        return convertToDouble(number);
    }
    
    public boolean checkIfNumeric(String number) {
        return isNumeric(number);
    }
}
