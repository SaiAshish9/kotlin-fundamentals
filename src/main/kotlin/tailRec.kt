import java.math.BigInteger

fun main() {
    println(getFibonacciNumber(10000, BigInteger("1"),BigInteger("2")))
}

// tailrec fn executes internally w/o affecting stack memory.

tailrec fun getFibonacciNumber(n:Int,a:BigInteger,b:BigInteger):BigInteger{
    if (n==0)
        return b
    else
        return getFibonacciNumber(n-1,a+b,a)
}

// uses recursion in optimised way
// prevents stack overflow exception
// prefix of tailrec is used
