package com.epam.assessment.product.repo

import com.epam.assessment.product.entity.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: JpaRepository<Product,Long> {

    //returns List of products having price greater than the price received as arg
    fun findByPriceGreaterThan(price: Int): List<Product>
}