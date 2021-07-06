package com.dailycodebuffer.department.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Iabur on July 06, 2021.
 */
@Table(name = "Department")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Department {
    @Column(nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String departmentName;
    private String departmentDescription;
    private String departmentCode;

}
