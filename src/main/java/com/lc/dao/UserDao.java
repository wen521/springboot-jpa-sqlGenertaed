package com.lc.dao;

import com.lc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao extends JpaRepository<User, Long> {
    @Override
    List<User> findAllById(Iterable<Long> iterable);

    @Override
    List<User> findAll();
}
