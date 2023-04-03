package com.example.kolekcie.exseption;

import com.example.kolekcie.servis.EmployeeServis;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.BAD_REQUEST)
public class EmployeeAlreadyAddedException extends RuntimeException {
}
