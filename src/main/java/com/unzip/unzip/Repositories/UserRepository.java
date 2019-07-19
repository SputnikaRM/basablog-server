package com.unzip.unzip.Repositories;

import com.unzip.unzip.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
    List<User> findByUsernameAndPassword(String username, String password);
}
