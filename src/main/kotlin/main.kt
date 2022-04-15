fun main(){
    evenList(listOf("Wanjira","Kimmy","World","Marsha","Tiba","Connie","Nderitu","Kimanyi","Bazzney","Vugutsa"))
    println(height(listOf(5.8,4.8,5.3)))

    var niccur1= Person("Kimmy",21,5.8,61)
    var niccur2=Person("Wanji",19,.4,58)
    var both = listOf( niccur1, niccur2,)
    var sort = both.sortedByDescending { person -> person.age  }
    println(sort)

    var niccur3 = Person("Bami", 24, 4.2, 64)
    var niccur4 = Person("Karanja", 18, 5.1, 50)
    var new = mutableListOf(niccur3,niccur4)
    println(new.plus(new))

    var vehicle1 = Car("KCB 224B", 56)
    var vehicle2 = Car("KDA 671F", 34)
    var cars = listOf(vehicle1, vehicle2)
    println(carDetails(cars))

}

fun evenList(names:List<String>):List<String>{
    names.forEachIndexed { index, s ->
        if (index % 2 == 0) {
            println(s)
        }
    }
    return names
}
fun height(values:List<Double>):String {
    var addition = values.sum()
    var averageHeight = values.average()
    var both = "$addition, $averageHeight"

    return both
}

data class Person(var name:String, var age:Int, var height:Double, var weight:Int)
fun createMorePeople(more:List<Any>):List<Any>{
    return listOf()
}

fun carDetails(cars:List<Car>):Int {
    var list = 0
    cars.forEach { car -> car.mileage
        list += car.mileage
    }
    var total = list/cars.count()
    return total
}

data class Car(var registration:String, var mileage:Int)
