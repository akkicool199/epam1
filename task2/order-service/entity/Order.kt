package com.epam.assessment.orderservice.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.validation.constraints.NotBlank
import java.time.LocalDate

@Entity
class Orders (
    @Id
    @GeneratedValue
    val orderId: Long=0,

    @NotBlank
    @Column(name = "customer_id", nullable = false)
    val customerId: Long,

    @NotBlank
    @Column(name = "order_date", nullable = false)
    var orderDate: LocalDate=LocalDate.now()
){

}