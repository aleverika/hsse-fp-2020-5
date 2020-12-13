package lab_1

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) return 1
    pascal(c-1, r-1) + pascal(c, r-1)
  }

  def balance(chars: List[Char]): Boolean = {
    @tailrec
    def balanceWithCount(chars: List[Char], count: Int): Boolean = (chars, count) match {
      case (_, cnt) if cnt < 0 => false
      case (Nil, cnt) => cnt == 0
      case ('(' :: tail, cnt) => balanceWithCount(tail, cnt + 1)
      case (')' :: tail, cnt) => balanceWithCount(tail, cnt - 1)
      case (_ :: tail, cnt) => balanceWithCount(tail, cnt)
    }

    balanceWithCount(chars, 0)
  }

  def countChange(money: Int, coins: List[Int]): Int = (money, coins) match {
    case (rest, _) if rest == 0 => 1
    case (rest, cash) if rest < 0 || cash.isEmpty => 0
    case _ => countChange(money, coins.tail) + countChange(money - coins.head, coins)
  }
}
