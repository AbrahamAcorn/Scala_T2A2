

object Listas05 {
  def main(args: Array[String]): Unit = {

    println("\n\t\t *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* LISTADO DE PALABRAS *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*")

    val pal1 = List("teclado","vaso","cawama","bocina","cargador","pantalla","monitor","botella","cinta","monitor")

    val pal2 = List("cargador","pantalla","monitor","botella","cinta","monitor","agua","tecla", "raton", "tequila", "microfono","lapiz","cable", "arduino")

    println("Lista de Palabras 1: \n" + pal1)
    println("Lista de Palabras 2: \n" + pal2)

    println("Intersección de Palabras en las Listas")
    val listaInterseccion = pal1.intersect(pal2)
    println(listaInterseccion)

    println("Palabras que aparecen en la primera lista, pero no en la segunda: ")
    val listPalabras1 = pal1.diff(pal2)
    println(listPalabras1)

    println("\n\n Palabras que aparecen en la segunda lista, pero no en la primera: ")
    val listPalabras2 = pal2.diff(pal1)
    println(listPalabras2)

    println("\n\n Unión de las palabras en las listas: ")
    val listaUnion = pal1.union(pal2)
    println(listaUnion)

  }
}
