package com.hemanth.SpringBootMapping.exception;

public class StudentIdNotFoundException extends RuntimeException
{
    public StudentIdNotFoundException(String msg)
    {
        super(msg);
    }


}
