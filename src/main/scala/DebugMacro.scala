import scala.quoted.*

object DebugMacro {
  
  inline def debug(inline expr: Any): Any = {
    ${ debugImpl('expr) }
  }

  def debugImpl(expr: Expr[Any])(using Quotes): Expr[Any] = {
    val code = Expr(expr.show)
    '{
      val value = $expr
      println($code + " = " + value)
      value
    }
  }
}


