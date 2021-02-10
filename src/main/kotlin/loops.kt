fun main() {

    for(i in 1..4){
        println(i)
        if(i ==2)
            break
    }

    var i=1
    while (i<5){
        println(i)
        i++
    }

    do{
        println(i)
    }while (i<5);

    loop@ for(i in 1..4){
        for(j in 1..4){
            if(j%2 ==0)
                break@loop
            println(i)
        }
    }

    for(i in 1..5){
        if(i==5)
            continue
        println(5)
    }



}