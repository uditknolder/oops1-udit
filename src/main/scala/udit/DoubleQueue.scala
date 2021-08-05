package udit
import scala.collection.immutable.Queue

private class  DoubleQueue extends Quu
{
  override def enque(): Unit =
  {
    println("elements in the queue:");
    var queue = Queue(10, 20, 30, 40, 50);
    queue.foreach{(element:Int) => print((element) + " ")}
    println();
    println("Enqueues the Element After Doubling Them:");
    queue.foreach{(element:Int) => print((element*2) + " ")}
    println();
    println("First Element  after Enqueuing is: " + (queue.front)*2);
    var dq = queue.dequeue;
    println("Dequeued First Element From Queue: " + dq)

  }


}
