package com.example.lombok_demo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="USERS_TB")

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class User {

    @Id
    @GeneratedValue
    private int userId;
    private int name;
    private int email;
    private int mobile;
    private int age;
    private int gender;
    private int nationality;



}
