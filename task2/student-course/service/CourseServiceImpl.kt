package com.epam.assessment.studentcourseservice.service

import com.epam.assessment.studentcourseservice.entity.Course
import com.epam.assessment.studentcourseservice.entity.Student
import com.epam.assessment.studentcourseservice.repository.CourseRepo
import com.epam.assessment.studentcourseservice.repository.StudentRepo
import org.springframework.transaction.annotation.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class CourseServiceImpl: CourseService {
    @Autowired
    lateinit var courseRepo: CourseRepo

    @Autowired
    lateinit var studentRepo: StudentRepo

    @Autowired
    lateinit var studentServiceImpl: StudentServiceImpl

    @Transactional
    override fun enrollStudentInCourse(studentId: Long,studentName:String, courseName: String) {
        //check if students already exist
        val studentOptional: Optional<Student> = studentRepo.findById(studentId)
        val student: Student?
        val course = courseRepo.findByCourseName(courseName) ?: Course(courseName = courseName)
        if(studentOptional.isEmpty) {
            val courses: MutableSet<Course> = mutableSetOf(course)
            val studentObj=Student(0,studentName, courses)
            student=studentRepo.save(studentObj)
            course.students.add(student)
        }else
        course.students.add(studentOptional.get())
        courseRepo.save(course)
    }

    @Transactional(readOnly = true)
    override fun fetchStudentsWithCourse(courseName: String): List<Student> {
        val course = courseRepo.findByCourseName(courseName)
        return course?.students?.toList() ?: emptyList()
    }
}