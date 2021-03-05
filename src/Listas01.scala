

object Listas01 {

  def main(args: Array[String]): Unit = {
    var j=0
    println("ingresa la cantidad de palabras")
    j=scala.io.StdIn.readInt()

    var pal= List("teclado","cawama","cawama","bocina","cargador","pantalla","monitor","cawama","cinta","monitor")


    var count=0

    for (x<-pal)
      if(x=="cawama")
        count+=1
    println("la palabra aprece "+count +" veces")

  }

}
