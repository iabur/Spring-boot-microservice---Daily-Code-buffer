package com.dailycodebuffer.user.repository;

import com.dailycodebuffer.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Iabur on July 06, 2021.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User getByUserId(Long id);
}
