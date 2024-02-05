package com.epam.assessment.studentcourseservice.repository

import com.epam.assessment.studentcourseservice.entity.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface StudentRepo: JpaRepository<Student,Long> {

    @Query("SELECT s.studentName, c.courseName FROM Student s LEFT JOIN FETCH s.courses c")
    fun getStudentsAndCourses(): List<Array<Any>>
}