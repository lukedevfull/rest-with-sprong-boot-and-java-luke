package br.com.lukedevfull.exeptions.handler;

import br.com.lukedevfull.exeptions.ResponseExeptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
public class CustomEntityResponseHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ResponseExeptions> handlerAllExeptions(Exception ex, WebRequest request) {
    ResponseExeptions response = new ResponseExeptions(
            new Date(),
            ex.getMessage(),
            request.getDescription(false));
    return
            new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }@ExceptionHandler(UnsupportedOperationException.class)
    public final ResponseEntity<ResponseExeptions> handlerBadRequestExeptions(Exception ex, WebRequest request) {
    ResponseExeptions response = new ResponseExeptions(
            new Date(),
            ex.getMessage(),
            request.getDescription(false));
    return
            new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}