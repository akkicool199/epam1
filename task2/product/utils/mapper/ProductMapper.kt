package com.epam.assessment.product.utils.mapper

import com.epam.assessment.product.dto.ProductDto
import com.epam.assessment.product.entity.Product

class ProductMapper: Mapper<ProductDto,Product> {
    override fun fromEntity(entity: Product): ProductDto=ProductDto (
        entity.productId,
        entity.name,
        entity.price
    )

    override fun toEntity(domain: ProductDto): Product= Product(
        domain.productId,
        domain.name,
        domain.price
    )
}