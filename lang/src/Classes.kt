class CarClass constructor(make: String, model: String) {
    val make = make
    val model = model
}

fun main1(args: Array<String>) {
    val car = CarClass("Toyota", "Avalon")
    println(car.make)
    println(car.model)
}

//class Car(val make: String, val model: String, var color: String) {
//    fun accelerate() {
//        println("vroom vroom")
//    }
//
//    fun details() {
//        println("This is a $color $make $model")
//    }
//}
//
//class Truck(val make: String, val model: String, val towingCapacity: Int) {
//    fun tow() {
//        println("taking the horses to the rodeo")
//    }
//s
//    fun details() {
//        println("The $make $model has a towing capacity of $towingCapacity lbs")
//    }
//}

open class Vehicle(val make: String, val model: String) {
    open fun accelerate() {
        println("vroom vroom")
    }

    fun park() {
        println("parking the vehicle")
    }

    fun brake() {
        println("STOP")
    }
}

class Car(make: String, model: String, var color: String) : Vehicle(make, model) {
    override fun accelerate() {
        println("We are going ludicrous model!")
    }
}

class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model) {
    fun tow() {
        println("Headed out to the mountains!")
    }
}


fun main(args: Array<String>) {

    val tesla = Car("Tesla", "ModelS", "Red")
    tesla.accelerate()

    val truck = Truck("Ford", "F-150", 10000)
    truck.tow()

//    val car = Car("Toyota", "Avalon", "Red")
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//    car.details()
//
//    val truck = Truck("Ford", "F-150", 10000)
//
//    truck.tow()
//    truck.truckdetails()
}