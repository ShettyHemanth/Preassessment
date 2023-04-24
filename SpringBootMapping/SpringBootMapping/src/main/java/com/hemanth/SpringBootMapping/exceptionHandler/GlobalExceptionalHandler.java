package com.hemanth.SpringBootMapping.exceptionHandler;


import com.hemanth.SpringBootMapping.exception.StudentIdNotFoundException;
import com.hemanth.SpringBootMapping.exception.UniversityIdNotFoundException;
import com.hemanth.SpringBootMapping.messageFormat.MessageFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionalHandler
{

    @ExceptionHandler
    ResponseEntity<MessageFormat> handleException(StudentIdNotFoundException sn)
    {
        MessageFormat messageFormat=new MessageFormat();
        messageFormat.setStatusCode(HttpStatus.NOT_FOUND.value());
        messageFormat.setMessage(sn.getMessage());
        messageFormat.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(messageFormat,HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler
    ResponseEntity<MessageFormat> handleException(UniversityIdNotFoundException un)
    {
        MessageFormat messageFormat=new MessageFormat();
        messageFormat.setStatusCode(HttpStatus.NOT_FOUND.value());
        messageFormat.setMessage(un.getMessage());
        messageFormat.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(messageFormat,HttpStatus.NOT_FOUND);

    }


}
