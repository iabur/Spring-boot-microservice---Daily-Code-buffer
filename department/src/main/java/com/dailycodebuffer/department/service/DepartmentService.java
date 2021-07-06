package com.dailycodebuffer.department.service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Iabur on July 06, 2021.
 */

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside SaveDepartment of department service");
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long id) {
        log.info("Inside getDepartmentById method of department service");
        return departmentRepository.getDepartmentById(id);
    }
}
