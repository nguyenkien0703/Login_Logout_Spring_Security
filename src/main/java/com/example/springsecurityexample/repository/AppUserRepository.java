package com.example.springsecurityexample.repository;

import com.example.springsecurityexample.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,Long> {
    AppUser findByUserName(String userName);

}
