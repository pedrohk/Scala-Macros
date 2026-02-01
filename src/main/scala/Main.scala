object Main {

  def main(args: Array[String]): Unit = {


    val x = PositiveMacro.positive(5)
    println(x)

    val z = PositiveMacro.positiveRuntime(-3)
    println(z)

    
     //val y = PositiveMacro.positive(-3)

  }
}