package com.epam.assessment.studentcourseservice.service

import com.epam.assessment.studentcourseservice.dto.StudentDto
import com.epam.assessment.studentcourseservice.entity.Course
import com.epam.assessment.studentcourseservice.entity.Student
import com.epam.assessment.studentcourseservice.repository.CourseRepo
import com.epam.assessment.studentcourseservice.repository.StudentRepo
import jakarta.annotation.Resource
import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import java.util.stream.Collectors
import kotlin.collections.ArrayList
import kotlin.collections.HashSet

@Service
class StudentServiceImpl {

    @Autowired
    lateinit var studentRepo: StudentRepo

    @Transactional
    fun addStudent(studentDto: StudentDto): StudentDto {
        val student = Student(studentDto.id,studentDto.name,studentDto.courses)
        fromEntity(student)
        val savedStudent: Student = studentRepo.save(student)
        return mapEntityToDto(savedStudent)
    }

    fun fromEntity(entity: Student): StudentDto=StudentDto (
        entity.studentId,
        entity.studentName,
        entity.courses
    )

    fun mapEntityToDto(student: Student): StudentDto {
        val responseDto = StudentDto(student.studentId,student.studentName,student.courses)
        responseDto.name = student.studentName
        responseDto.id = student.studentId
        responseDto.courses = student.courses
        return responseDto
    }
}