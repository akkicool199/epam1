package com.epam.assessment.studentcourseservice.mapper

import com.epam.assessment.studentcourseservice.dto.CourseDto
import com.epam.assessment.studentcourseservice.entity.Course

interface Mapper<Domain,Entity> {
    fun fromEntity(entity: Entity): Domain
    fun toEntity(domain: Domain): Entity
}