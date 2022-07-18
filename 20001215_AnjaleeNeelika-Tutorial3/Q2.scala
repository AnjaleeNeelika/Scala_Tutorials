object tempConvertion {
    def convertToFah(celc: Double):Double = {
        celc * 1.8 + 32;
    }

    def main(args: Array[String]): Unit = {
        println("Celcius 35 in Fahrenheit is " + convertToFah(35));
    }
}