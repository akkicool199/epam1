package com.epam.assessment.studentcourseservice.dto

import com.epam.assessment.studentcourseservice.entity.Student

class CourseDto(
    var id: Long?=null,
    var name: String,
    var students: MutableSet<Student>
){


}