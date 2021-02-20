import java.io.FileReader
import java.io.FileWriter

fun main() {
//    write(readLine().toString())
    read()
}

fun write(str:String){
    try{
        var w= FileWriter("a.txt",true)
        w.write(str+"\n")
        w.close()
    }catch (ex:Exception){ }
}

fun read(){
    try {
        var r =FileReader("a.txt")
        var c:Int?
        do{
            c=r.read()
            print(c.toChar())
        }while (c!=-1)
    }catch (ex:Exception){}
}

