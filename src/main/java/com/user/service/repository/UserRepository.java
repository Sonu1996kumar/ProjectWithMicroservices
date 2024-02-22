package com.user.service.repository;

import com.user.service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String > {
    //if we required then we can create own custom method and query
}
