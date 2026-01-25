object Main {

  def main(args: Array[String]): Unit = {
    val a = 10
    val b = 20
    DebugMacro.debug(a + b * 2)

    val x = PositiveMacro.positive(5)
    println(x)

    
     //val y = PositiveMacro.positive(-3)

  }
}