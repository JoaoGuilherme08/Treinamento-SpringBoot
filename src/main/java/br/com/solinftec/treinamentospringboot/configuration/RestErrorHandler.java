package br.com.solinftec.treinamentospringboot.configuration;

import org.apache.logging.log4j.spi.ObjectThreadContextMap;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class RestErrorHandler extends DefaultErrorAttributes {

    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public Map<String, Object> processValidationError(MethodArgumentNotValidException ex) throws Exception{
        Map<String, Object> response = new HashMap<>();

        response.put("status", HttpStatus.BAD_REQUEST);
        response.put("message", ex.getBindingResult().getAllErrors().stream().findFirst()
                .orElseThrow(() -> new Exception("UNKNOW_ERROR")).getDefaultMessage());
        return response;
    }
}

