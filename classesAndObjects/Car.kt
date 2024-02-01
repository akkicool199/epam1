package assessment_1.classesAndObjects


 //Define a `Car` class with properties for `make`, `model`, and `year`.
class Car(
    private var make: String,
    private var model:String,
    private var year: Int
) {

    fun printDetails()= println("make:$make ,model:$model ,year:$year")
}