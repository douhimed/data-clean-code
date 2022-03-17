package org.sqli.datacleancode.data.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.sqli.datacleancode.data.utilities.exceptions.ResponseException;
import org.sqli.datacleancode.data.utilities.exceptions.StudentException;

@ControllerAdvice
@RestController
public class CustomResponseExceptionController extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public final ResponseEntity<Object> projectIdExceptionHandler(StudentException ex, WebRequest request) {
        return new ResponseEntity<Object>(new ResponseException(ex.getMessage()), HttpStatus.BAD_REQUEST);
    }

}
