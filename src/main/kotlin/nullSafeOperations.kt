

fun main(args:Array<String>) {

//  1. Safe Call ?.
//  Returns length if 'name' is not null else return NULL
    var name:String? = null
//  nullable datatype  -> ?
    print(name?.length)
//  2. Safe Call with Let ?.let
//  It executes the block ONLY IF name is NOT NULL
    name?.let{
        println(name.length)
    }
//  3. Elvis Operator
    var len = if(name != null)
                 name.length
              else
                  -1
    val length = name?.length ?: -1
// 4. Not Null Assertion Operator
//    Use it when we're 100% sure that the value is not null

    print("a"!!.length)

}