package com.dailycodebuffer.department.repository;

import com.dailycodebuffer.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Iabur on July 06, 2021.
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department getDepartmentById(Long id);
}
