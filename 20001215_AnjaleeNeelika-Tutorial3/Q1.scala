object calculateArea {
    def diskArea(r: Int): Double = {
        math.Pi * r * r
    }

    def main(args: Array[String]): Unit = {
        println("Area of a disk with radius 5 = " + diskArea(5));
    }
}
