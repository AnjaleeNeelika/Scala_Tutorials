import scala.io.StdIn._

object primeSeq extends App {
    def GCD(a:Int, b:Int):Int = b match {
        case 0 => a 
        case x if x>a => GCD(x, a)
        case x => GCD(x, a%x)
    }

    def prime(p:Int, n:Int = 2):Boolean = n match {
        case x if(x==p) => true
        case x if GCD(p, x) > 1 => false
        case x => prime(p, x+1)
    }

    def primeSeq(n:Int):Unit = {
        if(n>1) {
            primeSeq(n-1)
            if(prime(n)) println(n)
        }

        
    }

    print("Enter the number : ")
    var num = readInt()

    primeSeq(num)
}