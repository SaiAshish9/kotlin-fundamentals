fun main() {

    var user1=User("sai",10)
    var user2=User("sai",20)

    println(user1)

//    user1 -> user1.toString() data class

    if(user1==user2){
        println("=")
    }else{
        println("!=")
    }

    var newUser = user1.copy()
    println(newUser)
    newUser=user1.copy(name = "Ashish")
    println(newUser)

}

data class User(var name:String,var id:Int){

}

// purpose of data class is to deal with data not the object

// "Any" class contains functions such as
// equals()
// hashCode()
// toString()


// Kotlin creates a copy() too