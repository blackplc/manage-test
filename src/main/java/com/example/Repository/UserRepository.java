package com.example.Repository;

import com.example.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by byhieg on 16-8-17.
 */
public interface UserRepository extends JpaRepository<User,Long>{
}
