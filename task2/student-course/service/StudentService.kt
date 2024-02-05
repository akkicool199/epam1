package com.epam.assessment.studentcourseservice.service

import com.epam.assessment.studentcourseservice.dto.StudentDto

interface StudentService {
    fun addStudent(studentDto: StudentDto?): StudentDto?
}