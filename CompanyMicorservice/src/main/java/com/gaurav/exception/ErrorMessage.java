package com.gaurav.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;
@Data
public class ErrorMessage {
private String message;
public int statusCode;
private LocalDateTime localDate;
}
