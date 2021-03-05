import scala.collection.mutable.ListBuffer

object Listas03 {
  def main(args: Array[String]): Unit = {
    var j=0
    println("ingresa la cantidad de palabras")
    j=scala.io.StdIn.readInt()

    var pal =new ListBuffer[String]()
    pal+=("teclado","cawama","cawama","bocina","cargador","pantalla","monitor","cawama","cinta","monitor")
    println(pal)
    /*
    for(i<- 0 until j) {
      println("Ingresa  la palabra "+i+":")
      pal+=scala.io.StdIn.readLine()
    }
    */
    var palabra=""
    println("ingresa la palabra a eliminar")
    palabra=scala.io.StdIn.readLine()

    pal-=palabra

    println(pal)

  }
}
