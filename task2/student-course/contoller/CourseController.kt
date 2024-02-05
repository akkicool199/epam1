package com.epam.assessment.studentcourseservice.contoller

import com.epam.assessment.studentcourseservice.dto.StudentDto
import com.epam.assessment.studentcourseservice.entity.Student
import com.epam.assessment.studentcourseservice.mapper.CourseMapper
import com.epam.assessment.studentcourseservice.service.CourseService
import com.epam.assessment.studentcourseservice.service.StudentServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/course")
class CourseController {

    @Autowired
    lateinit var courseService: CourseService

    @PostMapping("/enrollStudentInCourse")
    fun enrollStudentInCourse(@RequestParam studentId: Long,
                              @RequestParam studentName: String,
                   @RequestParam courseName: String): String{
        courseService.enrollStudentInCourse(studentId,studentName,courseName)
        val successMsg="student with id: $studentId enrolled in $courseName"
        return successMsg
    }

    @GetMapping("/fetchStudentsWithCourse/{courseName}")
    fun fetchStudentsWithCourse(@PathVariable courseName: String): List<Student> {
        return courseService.fetchStudentsWithCourse(courseName)
    }

}