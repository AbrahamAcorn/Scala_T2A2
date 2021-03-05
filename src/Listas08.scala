object Listas08 {
  def main(args: Array[String]): Unit = {
    def fCapicuo(x: Int): Boolean = {
      var n = x
      if (n < 0) return false
      var div = 1
      while ( {
        n / div >= 10
      }) div *= 10
      while ( {
        n != 0
      }) {
        val l = n / div
        val r = n % 10
        if (l != r) return false
        n = (n % div) / 10
        div /= 100
      }
      true
    }

    def fCapicuas(lista:List[Int]):List[Int] = {
      lista.filter(x => fCapicuo(x))
    }
    var lista = List(101,404,11,345,123,765,898,2332)
    println("Lista de numeros: "+ lista)
    println("Lista de numeros capicuas"+fCapicuas(lista))
  }

}
