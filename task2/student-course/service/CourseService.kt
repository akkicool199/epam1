package com.epam.assessment.studentcourseservice.service

import com.epam.assessment.studentcourseservice.entity.Student

interface CourseService {
    fun enrollStudentInCourse(studentId: Long,studentName: String, courseName: String)
    fun fetchStudentsWithCourse(courseName: String) : List<Student>
}