//Creating a thread by extending the Thread class.

public class MyThread extends Thread{
    @Override
    public void run(){
    for (int i = 0; i < 6; i++) {
        System.out.println(Thread.currentThread());
    }

    }
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();
    }
}
