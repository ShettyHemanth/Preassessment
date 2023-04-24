package com.hemanth.SpringBootMapping.service;


import com.hemanth.SpringBootMapping.MapperClass.StudentMapper;
import com.hemanth.SpringBootMapping.dto.StudentDto;
import com.hemanth.SpringBootMapping.exception.StudentIdNotFoundException;
import com.hemanth.SpringBootMapping.model.Student;
import com.hemanth.SpringBootMapping.model.University;
import com.hemanth.SpringBootMapping.repository.StudentRepository;
import com.hemanth.SpringBootMapping.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService
{


    @Autowired
    StudentRepository sr;



    public StudentDto addStudents(StudentDto student)
    {

        Student s= StudentMapper.dtoToStudentMapping(student);
        Student snew=sr.save(s);

        StudentDto newResult=StudentMapper.studentToDto(snew);
        return newResult;

    }

    public List<StudentDto> getStudent()
    {
        List<Student> result=sr.findAll();

        List<StudentDto> newResult=new ArrayList<>();

        for(Student i:result)
        {
            StudentDto n=StudentMapper.studentToDto(i);
            newResult.add(n);
        }

        return newResult;

    }


    public String updateStudent(StudentDto st)
    {
        Student result=StudentMapper.dtoToStudentMapping(st);
        sr.save(result);
        return "Updated Student Details Successfully";

    }

    public String deleteStudent()
    {
        sr.deleteAll();
        return "All Students Deleted Successfully";
    }


    public void deleteStudentById(int id)
    {
        if(id<0)
            throw new StudentIdNotFoundException("Id Entered is Invalid");
        sr.deleteById(id);
        System.out.println("Deleted the students with the id"+id);

    }



}
