package com.epam.assessment.orderservice.repository

import com.epam.assessment.orderservice.OrderDto
import com.epam.assessment.orderservice.dto.Response
import com.epam.assessment.orderservice.entity.Orders
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface OrderRepository: JpaRepository <Orders,Long>{

    @Query("SELECT customer_id as customerId, Count(DISTINCT O.order_id) AS totalOrders\n" +
            "    FROM orders O\n" +
            "    GROUP BY customer_id\n" +
            "    Order BY Count(DISTINCT O.order_id) DESC", nativeQuery = true)
    fun fetchOrderCountForEachCustomer(): List<Any>

}