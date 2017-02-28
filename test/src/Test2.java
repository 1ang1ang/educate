/**
 * 
 */

/**
 * @author andy
 *
 */
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T t = new T();
		Thread t1 = new Thread(new Run(t));
		Thread t2 = new Thread(new Run(t));
		
		while(true) {
			t1.start();
			t2.start();
		}
	}
}

class Run implements Runnable {

	public Run(T t) {
		this.t = t;
	}
	T t;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.one();
		t.two();
	}
	
	
}

class T {
	static int i = 0, j = 0;
	static void one() { i++; j++; }
	static void two() {
	System.out.println("i=" + i + " j=" + j);
	}
	}   