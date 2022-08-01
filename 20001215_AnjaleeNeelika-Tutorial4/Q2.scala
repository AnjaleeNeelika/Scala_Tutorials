object PatternMatching {
    def PatternMatching(n: Int): String = n match {
        case x if x<=0 => "Negative/ZERO"
        case x if x%2 == 0 => "Even number"
        case _ => "Odd number"
    }  

    def main(args: Array[String]): Unit = {
        import scala.io.StdIn._

        println("Enter a number: ")
        var input = readInt()
        println(PatternMatching(input))
    } 
}