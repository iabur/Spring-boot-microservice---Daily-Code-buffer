package com.dailycodebuffer.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Iabur on July 06, 2021.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Long id;
    private String departmentName;
    private String departmentDescription;
    private String departmentCode;
}
