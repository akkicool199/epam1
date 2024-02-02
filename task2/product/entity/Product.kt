package com.epam.assessment.product.entity

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank

@Entity
class Product(

        @Id
        @GeneratedValue
        var productId: Long=0,

        @NotBlank
        @Column(name = "name", nullable = false, unique = true)
        var name: String,

        @NotBlank
        @Column(name = "price", nullable = false, unique = true)
        var price: Int

) {
}