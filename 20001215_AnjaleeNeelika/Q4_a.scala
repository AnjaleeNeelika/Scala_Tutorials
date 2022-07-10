object program4 {
  def normalPay(hours:Int):Int = hours * 250;

  def otPay(hours:Int):Int =  hours * 85;

  def income(normal:Int, ot:Int):Int =  normalPay(normal) + otPay(ot);

  def tax(income:Int):Double =  income *  0.12;

  def takeHome(normal:Int, ot:Int):Double = income(normal, ot) - tax (income(normal, ot));

  def main(args:Array[String]) {
    import scala.io.StdIn._;

    println("Enter the number of normal working hours => ");
    var h1 = readInt();

    println("Enter the number of OT hours => ");
    var h2 = readInt();

    println("The take home salary => " + takeHome(h1, h2));
  }
}
