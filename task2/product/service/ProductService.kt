package com.epam.assessment.product.service

import com.epam.assessment.product.repo.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductService @Autowired constructor(
        val repo:ProductRepository
) {

    fun fetchProducts(price: Int)=repo.findByPriceGreaterThan(price)
}