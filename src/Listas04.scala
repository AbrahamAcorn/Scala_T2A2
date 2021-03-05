import scala.collection.mutable.ListBuffer

object Listas04 {
  def main(args: Array[String]): Unit = {
    var pal =new ListBuffer[String]()
    pal+=("teclado","vaso","cawama","bocina","cargador","pantalla","monitor","botella","cinta","monitor")
    println(pal)
    var pal2 =new ListBuffer[String]()
    pal2+=("teclado","cawama")

    pal2.foreach(pal-= _)

    println(pal)
  }


}
