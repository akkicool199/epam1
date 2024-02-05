package com.epam.assessment.itindustry.entity

import jakarta.persistence.*

@Entity
@Table(name = "projects")
class Project (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    val projectId: Long? = null,

    @Column(name = "project_name")
    val projectName: String,

    @ManyToMany(mappedBy = "projects")
    val employees: MutableSet<Employee> = mutableSetOf()
)