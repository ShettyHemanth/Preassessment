package com.hemanth.SpringBootMapping.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.hemanth.SpringBootMapping.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UniversityDto
{

    int uid;

    String name;

    String address;



    List<Student> stud=new ArrayList<>();

}
