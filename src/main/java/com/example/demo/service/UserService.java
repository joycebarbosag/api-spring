// package com.example.demo.service;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.example.demo.model.UserModel;
// import com.example.demo.repository.UserRepository;

// @Service
// public class UserService {

//     @Autowired
//     UserRepository userRepository;

//     public List<UserModel> getAllUsers(){
//         return userRepository.findAll();
//     }

//     public UserModel getUserById(Long id){
//         UserModel client = userRepository.findById(id).get();
//         return client;
//     }

//     public UserModel createUser(UserModel client){
//         return userRepository.save(client);
//     }

//     public UserModel updateUser(Long id, UserModel product) {
//         if (userRepository.existsById(id)) {
//             product.setId(id);
//             return userRepository.save(product);
//         }
//         return null;
//     }

//     public void deleteUser(Long id){
//         userRepository.deleteById(id);
//     }

// }
package com.example.demo.service;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
 
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    public UserModel getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public UserModel createUser(UserModel user) {
        return userRepository.save(user);
    }

    public UserModel updateUser(Long id, UserModel updatedUser) {
        if (userRepository.existsById(id)) {
            updatedUser.setId(id);
            return userRepository.save(updatedUser);
        }
        return null;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
