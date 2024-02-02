package com.epam.assessment.product.controller

import com.epam.assessment.product.entity.Product
import com.epam.assessment.product.repo.ProductRepository
import com.epam.assessment.product.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


//Depicted multiple ways of auto-wiring

@RestController
@RequestMapping("product")
class ProductController @Autowired constructor(
        val productService: ProductService
){

    @Autowired
    lateinit var productRepository: ProductRepository


    @GetMapping("/fetch/{price}")
    fun fetchProductsGreaterThanPrice
            (@PathVariable price: Int)=productService.fetchProducts(price)


    @PostMapping("/save")
    fun saveProduct(@RequestBody product: Product): String{
        productRepository.save(product)
        val msg: String="product saved"
        println(msg)
        return msg
    }

    @GetMapping("/fetchAll")
    fun fetchAllProduct(): List<Product> = productRepository.findAll()


}