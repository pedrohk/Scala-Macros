import scala.quoted.*

object PositiveMacro {

  inline def positive(inline value: Int): Int = {
    ${ positiveImpl('value) }
  }

  def positiveImpl(value: Expr[Int])(using Quotes): Expr[Int] = {
    value match {
      case Expr(v) if v > 0 =>
        value
      case Expr(_) =>
        quotes.reflect.report.error("Value must be a positive constant")
        '{ 0 }
      case _ =>
        quotes.reflect.report.error("Value must be known at compile time")
        '{ 0 }
    }
  }
}