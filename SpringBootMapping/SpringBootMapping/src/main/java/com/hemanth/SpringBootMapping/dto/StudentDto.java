package com.hemanth.SpringBootMapping.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hemanth.SpringBootMapping.model.University;
import lombok.*;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto
{
    int usn;

    String name;

    String branch;

    String email;

    @JsonBackReference
    University university;

    private Date createdDate;

    private Date lastModifiedDate;

    private String createdBy;


    private String modifiedBy;

}
