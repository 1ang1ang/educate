public class Task implements Runnable {  
    private int count = 0;  
      
    public void run() {  
        for(int i = 0 ; i < 5 ; i++){  
            this.reset();  
            this.add();  
        }  
    }  
      
    public synchronized void reset(){  
        if(count == 5){  
            count = 0;  
            System.out.println(Thread.currentThread().getName()  
                    + "[count reset]");  
        }  
    }  
      
    public synchronized void add(){  
        count++;  
        System.out.println(Thread.currentThread().getName()  
                + "[count:" + count + "]");  
    }  
      
    public static void main(String[] args){  
        Task t = new Task();  
        Thread t1 = new Thread(t);  
        Thread t2 = new Thread(t);  
        t1.start();  
        t2.start();  
    }  
}   