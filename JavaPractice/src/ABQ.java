import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable{
	private ArrayBlockingQueue<Integer> queue;
	public Producer (ArrayBlockingQueue<Integer> queue){
	this.queue = queue;
}

public void run(){
while(true){
try{
Thread.sleep(100);
queue.put(ABQ.counter++);
System.out.println("Value added in the queue: "+ABQ.counter);
}
catch(InterruptedException e){
e.printStackTrace();
}
}
}
}
class Consumer implements Runnable {
private ArrayBlockingQueue<Integer> queue;
public Consumer (ArrayBlockingQueue<Integer> queue){
	this.queue = queue;
}

public void run(){
while(true){
try{
Thread.sleep(1000);
queue.take();
ABQ.counter--;
System.out.println("Value removed in the queue: "+ABQ.counter);
}
catch(InterruptedException e){
e.printStackTrace();
}
}
}
}

public class ABQ{
static int counter =1;
public static void main(String args[])
{
ArrayBlockingQueue<Integer> queue =  new ArrayBlockingQueue<> (10);
Producer produce = new Producer (queue);
Thread producerThread = new Thread (produce);
producerThread.start();

Consumer consume = new Consumer(queue);
Thread consumeThread = new Thread(consume);
consumeThread.start();
}
}