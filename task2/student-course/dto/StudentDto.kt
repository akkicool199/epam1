package com.epam.assessment.studentcourseservice.dto

import com.epam.assessment.studentcourseservice.entity.Course

class StudentDto (
    var id: Long?=null,
    var name: String,
    var courses: MutableSet<Course>
){


}