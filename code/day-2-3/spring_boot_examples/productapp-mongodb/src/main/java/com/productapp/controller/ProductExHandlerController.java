package com.productapp.controller;

import com.productapp.dto.ErrorMessage;
import com.productapp.exceptions.ProductNotFoundException;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

//AOP to handle the exceptions
@RestControllerAdvice //aop
public class ProductExHandlerController {

    //MethodArgumentNotValidException
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorMessage> handle400Exception(MethodArgumentNotValidException ex){
        //i wnat to find actual cause why data is invalid
        String errorString = ex.getBindingResult()
                .getAllErrors()
                .stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.joining(" ,"));

        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setError(errorString);
        errorMessage.setStatusCode("400");
        errorMessage.setTimestamp(java.time.LocalDateTime.now());
        errorMessage.setToContact("contact us at rgupta.mtech@gmail.com");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }

//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ErrorMessage> handle500Exception(Exception ex){
//        ErrorMessage errorMessage = new ErrorMessage();
//        errorMessage.setError("Pls try after some time");
//        errorMessage.setStatusCode("500");
//        errorMessage.setTimestamp(java.time.LocalDateTime.now());
//        errorMessage.setToContact("contact us at rgupta.mtech@gmail.com");
//
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
//    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorMessage> handleProductNotFoundException(ProductNotFoundException ex){
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setError(ex.getMessage());
        errorMessage.setStatusCode("404");
        errorMessage.setTimestamp(java.time.LocalDateTime.now());
        errorMessage.setToContact("contact us at rgupta.mtech@gmail.com");

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }
}
