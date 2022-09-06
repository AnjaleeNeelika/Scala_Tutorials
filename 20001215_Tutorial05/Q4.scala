import scala.io.StdIn._

object evenOrOdd extends App {
    def isEven(n:Int):Boolean = n match {
        case 0 => true
        case _ => isOdd(n-1)
    }

    def isOdd(n:Int):Boolean = !(isEven(n))

    print("Enter the number: ")
    var num = readInt()

    print(num)
    if(isEven(num)) {
        println(" is an even number")
    } 
    
    if(isOdd(num)) {
        println(" is an odd number")
    }
}