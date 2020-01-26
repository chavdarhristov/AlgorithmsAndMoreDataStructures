package ex2point1;

public class Test
{

   public static <T> void main(String[] args)
   {
      QueueADT queue=new QueueWithLinkedList<>();
      queue.enqueue( "opaa" );
      System.out.println(queue.toString());
   }

}
