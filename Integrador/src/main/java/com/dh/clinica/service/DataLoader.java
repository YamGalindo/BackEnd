package com.dh.clinica.service;

import com.dh.clinica.model.AppUser;
import com.dh.clinica.model.AppUserRole;
import com.dh.clinica.repository.impl.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private UserRepository userRepository;

    @Autowired
    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void run(ApplicationArguments args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode("admin");
        BCryptPasswordEncoder passwordEncoder1 = new BCryptPasswordEncoder();
        String hashedPassword1 = passwordEncoder1.encode("pass123");
        userRepository.save(new AppUser("Admin", "Admin", "admin@digital.com", hashedPassword, AppUserRole.ADMIN));
        userRepository.save(new AppUser("Yam", "yam", "yam@digital.com", hashedPassword1, AppUserRole.USER));
    }
}
