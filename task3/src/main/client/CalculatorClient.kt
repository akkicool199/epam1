package client

import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder

val PORT_NO: Int=50051

suspend fun main() {

    val channel : ManagedChannel =
        ManagedChannelBuilder.forAddress("localhost" , PORT_NO)
            .usePlaintext().build()

    val calculatorServiceClient : CalculatorServiceClient = CalculatorServiceClient(channel)

    //CalculatorServiceClient method calling
    calculatorServiceClient.addition(4.0, 2.0)

    calculatorServiceClient.subtraction(4.0, 2.0)

    calculatorServiceClient.multiplication(4.0, 2.0)

    calculatorServiceClient.division(4.0, 2.0)
}