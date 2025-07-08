package com.itssintern.spring_boot_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itssintern.spring_boot_project.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long>{

}
