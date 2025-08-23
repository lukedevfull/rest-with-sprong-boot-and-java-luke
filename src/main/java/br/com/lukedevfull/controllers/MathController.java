package br.com.lukedevfull.controllers;

import br.com.lukedevfull.personalExeptions.InvalidNumericException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
    //TODO: Implementar métodos de matemática
    //localhost:8080/math/sum/x/y
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception{
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new InvalidNumericException("Por favor, informe um número válido");
        }
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    private Double convertToDouble(String strNumber)
    {
        if (strNumber.isEmpty() || strNumber == null)
            throw new IllegalArgumentException
                    ("Não é possível converter uma string vazia ou nula para um número.");
        
        String number = strNumber
                .replaceAll(",", ".");
        
        return Double.parseDouble(number);
    }

    private boolean isNumeric(String strNumber) {
        if (strNumber.isEmpty() || strNumber == null) return true;
        String number = strNumber
                .replaceAll(",", ".");
        return number
                .matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    //localhost:8080/math/subtract/x/y
    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Double subtract(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }
    //localhost:8080/math/multiply/x/y
    @RequestMapping("/mult/{numberOne}/{numberTwo}")
    public Double multiply(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }
    //localhost:8080/math/divide/x/y
    //localhost:8080/math/average/x/y
}
