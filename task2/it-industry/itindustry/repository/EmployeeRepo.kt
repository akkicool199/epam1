package com.epam.assessment.itindustry.repository

import com.epam.assessment.itindustry.entity.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface EmployeeRepo: JpaRepository<Employee,Long> {
    @Query("SELECT emp FROM Employee emp JOIN FETCH emp.projects p WHERE p.projectName = :projectName")
    fun findEmployeesByProjectName(@Param("projectName") projectName: String): List<Employee>
}