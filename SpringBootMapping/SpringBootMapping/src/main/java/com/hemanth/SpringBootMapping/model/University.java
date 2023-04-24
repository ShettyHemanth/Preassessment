package com.hemanth.SpringBootMapping.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class University
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int uid;

    String name;

    String Address;

//    @JsonIgnore

    @JsonManagedReference
    @OneToMany(mappedBy = "university",cascade = CascadeType.ALL)
    List<Student> stud=new ArrayList<>();
}
