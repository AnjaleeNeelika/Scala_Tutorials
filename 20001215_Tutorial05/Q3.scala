import scala.io.StdIn._

object sum extends App {
    def sum(n:Int):Int = {
        n match {
            case 1 => n
            case _ => n + sum(n-1)
        }
    }

    print("Enter the number: ")
    var num = readInt()

    println(sum(num))
} 