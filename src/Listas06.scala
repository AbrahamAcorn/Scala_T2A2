object Listas06 {
  def main(args: Array[String]): Unit = {
    def sumaAc[A](xs: Seq[A])(implicit num: Numeric[A]): Seq[A] = {
      xs.tail.scanLeft(xs.head)(num.plus)
    }

    val lista = List(1,2,3,4,5,6,7,8,9)
    println(lista)
    println("Sumando....")
    println(sumaAc(lista))

  }
}
