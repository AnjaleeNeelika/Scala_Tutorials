object Interest {
    def actualInterest(x: Double): Any = {
        var  interest:Double = 0;

        if(x>2000000) {
            interest = x * 6.5/100;
        } else if(x>200000) {
            interest = x * 3.5/100;
        } else if(x>20000) {
            interest = x * 4/100;
        } else {
            interest = x * 2/100;
        }

        return interest;
    }   

    def main(args: Array[String]): Unit = {
        import scala.io.StdIn._;

        println("Enter the depoit amount: ");
        var deposit = readDouble();

        println("The interest for Rs. " + deposit + " is " + actualInterest(deposit));
    } 
}