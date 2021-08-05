package udit
import scala.collection.immutable.Queue


private class SquareQueue extends Quu
{
  override  def enque(): Unit =
  {
    println("Elements in the Queue Are:");
    var queue = Queue(2, 3, 4, 5,6);
    queue.foreach{(element:Int) => print((element) + " ")}
    println();
    println("Enqueues the Element After Squaring Them:");
    queue.foreach{(element:Int) => print((element*element) + " ")}
    println();
    println("First Element after Enqueuing is: " + (queue.front)*(queue.front));
    var dq = queue.dequeue;
    println("Dequeued First Element From Queue: " + dq);
  }

}