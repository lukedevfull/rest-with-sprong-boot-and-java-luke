package br.com.lukedevfull.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
    //TODO: Implementar métodos de matemática
    //localhost:8080/math/sum/x/y
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Long sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        return Long.parseLong(numberOne) + Long.parseLong(numberTwo);
    }
    //localhost:8080/math/subtract/x/y
    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Long subtract(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        return Long.parseLong(numberOne) - Long.parseLong(numberTwo);
    }
    //localhost:8080/math/multiply/x/y
    @RequestMapping("/mult/{numberOne}/{numberTwo}")
    public Long multiply(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        return Long.parseLong(numberOne) * Long.parseLong(numberTwo);
    }
    //localhost:8080/math/divide/x/y
    //localhost:8080/math/average/x/y
}
