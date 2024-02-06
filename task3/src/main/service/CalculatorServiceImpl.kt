package service

import com.example.services.CalculationRequest
import com.example.services.CalculationResponse
import com.example.services.CalculatorServiceGrpcKt

class CalculatorServiceImpl : CalculatorServiceGrpcKt.CalculatorServiceCoroutineImplBase() {

    override suspend fun addition(request: CalculationRequest): CalculationResponse {
        return CalculationResponse.newBuilder()
            .setResult(request.val1 + request.val2)
            .build();
    }

    override suspend fun subtraction(request: CalculationRequest): CalculationResponse {
        return CalculationResponse.newBuilder()
            .setResult(request.val1 - request.val2)
            .build();
    }

    override suspend fun multiplication(request: CalculationRequest): CalculationResponse {
        return CalculationResponse.newBuilder()
            .setResult(request.val1 * request.val2)
            .build();
    }

    override suspend fun division(request: CalculationRequest): CalculationResponse {

        if(request.val2==0.0)
            throw RuntimeException("val2 which is denominator cannot be zero")

        return CalculationResponse.newBuilder()
            .setResult(request.val1 / request.val2)
            .build();
    }


}