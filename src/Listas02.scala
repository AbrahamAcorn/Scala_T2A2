import scala.collection.mutable.ListBuffer

object Listas02 {

  def main(args: Array[String]): Unit = {
    var j=0
    println("ingresa la cantidad de palabras")
    j=scala.io.StdIn.readInt()
    var pal=new ListBuffer  [StringBuilder]()
    for(i<- 0 until j) {
      println("Ingresa  la palabra "+i+":")
      pal+=new StringBuilder(scala.io.StdIn.readLine())
    }

    pal+=(new StringBuilder("teclado"),new StringBuilder("cawama"),new StringBuilder("cawama"),new StringBuilder("bocina"),new StringBuilder("cargador"),new StringBuilder("pantalla"),new StringBuilder("monitor"),new StringBuilder("cawama"),new StringBuilder("cinta"),new StringBuilder("monitor"))
    println(pal)
    println("ingresa la palabra a sustituir")
    val o2= new StringBuilder(scala.io.StdIn.readInt())

    println("ingresa la cantidad de palabras")
    val p=new StringBuilder(scala.io.StdIn.readInt())

    for(x<-1 to pal.size)
      if(pal(x-1)==o2) {
        println("cambiado")
       pal(x-1)=p
      }
    println(pal)


  }

}
