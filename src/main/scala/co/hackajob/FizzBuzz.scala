package co.hackajob

object FizzBuzz {

  def run(N: Int, M: Int): String = {

    val sb = new StringBuilder

    for (i <- N to M) {
      if (i % 3 == 0 && i % 5 == 0) {
        sb.append("FizzBuzz,")
      } else if (i % 3 == 0) {
        sb.append("Fizz,")
      } else if (i % 5 == 0) {
        sb.append("Buzz,")
      } else {
        sb.append(i).append(",")
      }
    }

    sb.dropRight(1).toString()

  }


}
