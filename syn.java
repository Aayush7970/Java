class table{
	public synchronized void display(int a){
		for(int i=1;i<=10;i++){
			System.out.println(i*a+" "+Thread.currentThread().getName());
		}
	}
}

class thread1 implements Runnable{
	table t;
	thread1(table t){
		this.t=t;
	}
	public void run(){
		t.display(10);
	}
}

class thread2 extends Thread{
	table t;
	thread2(table t){
		this.t=t;
	}
	public void run(){
		t.display(5);
	}
}

class syn{
	public static void main(String args[]){
		table t=new table();



		thread1 th1=new thread1(t);
		thread2 th2=new thread2(t);

		Thread tr=new Thread(th1);

		tr.start();
		th2.start();
	}
}