object Listas07 {
  def main(args: Array[String]): Unit = {
    def fPalindroma(lista:List[String]):Unit = {
      for (x <- lista){
        if (x.equals(x.reverse)){
          print(x + ", ")
        }
      }
    }

    val listaPalabras = List("oso","cawama","bocina","oro","rallar","salas","ana")

    println("Palabras: \n" + listaPalabras)
    println("Las palabras palíndromas son: ")
    fPalindroma(listaPalabras)

  }

}
