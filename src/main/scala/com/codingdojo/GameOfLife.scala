package com.codingdojo

object GameOfLife {

  sealed abstract class State(val state: Char)

  case object ALIVE extends State('*')

  case object DEAD extends State('.')

  case class Cell(x: Int, y: Int, state: Char)

  def generation1(): Array[String] = Array("........", "....*...", "...**...", "........")


  def nextGeneration(currentGen: Array[String]): Array[String] = {

    val X_MAX = currentGen(0).length
    val Y_MAX = currentGen.length

    def neighbours(cell: Cell): Int = {

      val cells = for {
        x <- Math.max(cell.x - 1, 0) to Math.min(X_MAX - 1, cell.x + 1)
        y <- Math.max(cell.y - 1, 0) to Math.min(Y_MAX - 1, cell.y + 1)
      } yield Cell(x, y, currentGen(y)(x))


      cells.count(c => (c.x != cell.x || c.y != cell.y) && c.state == ALIVE.state)

    }

    def nextCell(cell: Cell): Char = cell.state match {

      case ALIVE.state =>
        val aliveN = neighbours(cell)
        if (aliveN == 2 || aliveN == 3) ALIVE.state
        else DEAD.state

      case DEAD.state =>
        if (neighbours(cell) == 3) ALIVE.state
        else DEAD.state
    }

    def nextLine(line: String): String = {
      line.zipWithIndex.
        map { case (cell, index) => nextCell(Cell(index, currentGen.indexOf(line), cell)) }.
        mkString

    }


    currentGen.map(nextLine)


  }


}
