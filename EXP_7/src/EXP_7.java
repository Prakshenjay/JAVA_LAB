// 7.	Write a multi-threaded java program to illustrate producer consumer problem.

import java.util.LinkedList;

public class EXP_7 {

    public static class PC
    {
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;

        public void produce() throws InterruptedException
        {
            int value = 0;
            while(true)
            {
                synchronized(this)
                {
                    while(list.size() == capacity)
                    {
                        wait();
                    }
                    System.out.println("Producer produced : " + value);
                    list.add(value++);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }

        public void consume() throws InterruptedException
        {
            while(true)
            {
                synchronized(this)
                {
                    while(list.size() == 0)
                    {
                        wait();
                    }
                    int value = list.removeFirst();
                    System.out.println("Consumer consumed : " + value);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException
	{
		PC pc = new PC();

        Thread T1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try
                {
                    pc.produce();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });

        Thread T2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try
                {
                    pc.consume();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });

        T1.start();
        T2.start();

        T1.join();
        T2.join();
	}
}
