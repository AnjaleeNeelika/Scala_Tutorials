object runningTime {
    def easyPhase(n: Int): Int = n * 8;

    def tempo(n:Int): Int = n * 7;

    def main(args: Array[String]): Unit = {
        println("Total running time: " + (easyPhase(2) + tempo(3) + easyPhase(2)) + "min");
    }
}
