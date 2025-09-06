package br.com.lukedevfull.controllers;

import br.com.lukedevfull.logicalMethods.mathMethods.MathMethods;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
    private MathMethods mathMethods;

    public MathController(MathMethods mathMethods) {
        this.mathMethods = mathMethods;
    }

    //TODO: Implementar métodos de matemática: check
    //localhost:8080/math/sum/x/y
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        return this.mathMethods.sum(numberOne, numberTwo);
    }

    //localhost:8080/math/sub/x/y
    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Double subtract(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        return this.mathMethods.subtract(numberOne, numberTwo);
    }
    //localhost:8080/math/multiply/x/y
    @RequestMapping("/mult/{numberOne}/{numberTwo}")
    public Double multiply(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        return this.mathMethods.multiply(numberOne, numberTwo);
    }
    //localhost:8080/math/divide/x/y
    @RequestMapping("/div/{numberOne}/{numberTwo}")
    public Double divide(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        return this.mathMethods.divide(numberOne, numberTwo);
    }

    //localhost:8080/math/percentage/x/y
    @RequestMapping("/percentage/{numberOne}/{numberTwo}")
    public Double percentage(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        return this.mathMethods.percentage(numberOne, numberTwo);
    }
}
