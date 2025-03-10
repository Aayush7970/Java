// class table{
// 	public static void display(int a){
// 		synchronized(table.class){
// 			for(int i=1;i<=10;i++){
// 				System.out.println(i*a+" "+Thread.currentThread().getName());
// 			}
// 		}
// 	}
// }

// class thread1 implements Runnable{
// 	thread1(){
// 		Thread t=new Thread(this);
// 		t.start();
// 	}
// 	public void run(){
// 		table.display(2);
// 	}
// }

// class thread2 extends Thread{
// 	public void run(){
// 		table.display(3);
// 	}
// }


// class staticsyn{
// 	public static void main(String args[]){
// 		thread1 th1=new thread1();
// 		thread2 th2=new thread2();
// 		th2.start();
// 	}
// }
// Critical section : the resource which is used by more than 1 block of code.

class thread1 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
}

class staticsyn{
	public static void main(String args[]){
		thread1 t=new thread1();
		t.start();
		for(int i=0;i<=5;i++){
			System.out.println("Yes");
		}
	}
}