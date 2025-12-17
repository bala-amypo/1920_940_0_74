  package com.example.demo.entity;

@entity
@Table(name = "Students")
import java.time.LocalDate;
public class Student {
    @id
    @GeneratedValue(Strategy= GeneratedType.IDENITY)
    private Long id;
    private String name;
    private String email;
    
    public int getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Student(Long id, String name, String email, LocalDate dob, float cgpa) {
        this.id = id;
        this.name = name;
        this.email = email;
        
    }
    public Student() {
    }

}