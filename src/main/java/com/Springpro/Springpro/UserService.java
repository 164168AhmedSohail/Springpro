package com.Springpro.Springpro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired()
    private UserRepository UserRepository;
    public List<Student> getAllUsers() {
        return UserRepository.findAll();
    }
    public Optional<Student> getUserById(Long id) {
        return UserRepository.findById(id);
    }
    public Student saveUser(Student user) {
        return UserRepository.save(user);
    }
    public void deleteUser(Long id) {
        UserRepository.deleteById(id);
    }
}
