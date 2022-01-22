package com.democode.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.democode.department.entity.Department;
import com.democode.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DepartmentService.class);

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Into saveDepartment - DepartmentService");
		return departmentRepository.save(department);
	}

	
	public Department findDepartmentById(Long departmentId) {
		log.info("Into findDepartmentById - DepartmentService");
		Department department = departmentRepository.findByDepartmentId(departmentId);
		log.info("Into findDepartmentById - DepartmentService getDepartmentAddress ");
		log.info("Into DepartmentAddress : " + department.getDepartmentAddress());
		return department;
	}

}
