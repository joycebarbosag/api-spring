package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

  @Autowired
  UserService userService;

  // Método POST: Criar um novo usuário
  @PostMapping("/newUser")
  public UserModel createNewUser(@RequestBody UserModel entity) {
    return userService.createUser(entity);
  }

  // Método GET: Obter um usuário pelo ID
  @GetMapping("/user/{id}")
  public UserModel getUserById(@PathVariable Long id) {
    return userService.getUserById(id);
  }

  // Método GET: Obter todos os usuários
  @GetMapping("/users")
  public List<UserModel> getAllUsers() {
    return userService.getAllUsers();
  }

  // Método PUT: Atualizar um usuário existente
  @PutMapping("/user/{id}")
  public UserModel updateUser(@PathVariable Long id, @RequestBody UserModel updatedUser) {
    return userService.updateUser(id, updatedUser);
  }

  // Método DELETE: Deletar um usuário
  @DeleteMapping("/user/{id}")
  public void deleteUser(@PathVariable Long id) {
    userService.deleteUser(id);
  }
}

