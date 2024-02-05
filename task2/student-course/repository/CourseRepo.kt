package com.epam.assessment.studentcourseservice.repository

import com.epam.assessment.studentcourseservice.entity.Course
import org.springframework.data.jpa.repository.JpaRepository

interface CourseRepo: JpaRepository<Course,Long> {
     fun findByCourseName(courseName: String): Course?
}