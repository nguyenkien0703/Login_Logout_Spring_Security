package com.example.springsecurityexample.repository;

import com.example.springsecurityexample.entity.AppUser;
import com.example.springsecurityexample.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository  extends JpaRepository<UserRole,Long> {
    List<UserRole> findByAppUser(AppUser appUser);

}
