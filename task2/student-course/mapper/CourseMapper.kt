package com.epam.assessment.studentcourseservice.mapper

import com.epam.assessment.studentcourseservice.dto.CourseDto
import com.epam.assessment.studentcourseservice.entity.Course
import org.springframework.stereotype.Service

@Service
class CourseMapper: Mapper<CourseDto,Course> {
    override fun fromEntity(entity: Course): CourseDto =CourseDto(
        entity.courseId,
        entity.courseName,
        entity.students
        )

    override fun toEntity(domain: CourseDto): Course=Course (
        domain.id,
        domain.name,
        domain.students
        )
}