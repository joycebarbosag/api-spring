package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserModel{

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private int age;
    
    //setter deve substituir
	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}
       

}