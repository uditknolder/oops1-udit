package udit

import java.lang.System.in
import java.util.Scanner;

object Main {
  def main(args: Array[String]): Unit = {
    println("Enter your choice: ")
    println("1 For SquareQueue:");
    println("2 For DoubleQueue:");
    val sc = new Scanner(in);
    val choice = sc.nextInt();
    choice match {
      case 1 =>
        var o1 = new SquareQueue();
        o1.enque();

      case 2 =>
        var o2 = new DoubleQueue();
        o2.enque();

    }
  }
}

