fun main() {
    println(MyClass.count);
    println(MyClass.typeOfCustomers());
}

class MyClass{
    companion object CustomersData{

        var count:Int = -1

        @JvmStatic
        fun typeOfCustomers():String{
            return "Indian"
        }

    }
}