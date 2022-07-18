object wholesaleCost {
    def discount(n: Int): Double = {
        n * 0.40;
    }

    def shippingCost(n: Int): Double = {
        if(n <= 50) 3
        else 3 + (n-50) * 0.75
    }

    def totalWholesaleCost(n: Int): Double = {
        24.95 * n - discount(n) + shippingCost(n);
    }

    def main(args: Array[String]): Unit = {
        println("Total wholesale cost for 60 books: " + totalWholesaleCost(60));
    }
}
