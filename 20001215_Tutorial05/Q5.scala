import scala.io.StdIn._

object evenSum extends App {
    var x:Int = 0

    def sumOfEven(n:Int):Int = {
        if(n<0) {
            return x
        }

        if(n%2 == 0) {
            x = x + n
        }

        sumOfEven(n-1)
    }

    print("Enter the number: ")
    var num = readInt()

    println(sumOfEven(num))
}