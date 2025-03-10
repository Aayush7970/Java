// thread is the smallest execution unit.
// New/Born state -> First state of Thread. When constructor of Thread is called.
// Runnable state -> Second state of Thread. When start method of Thread is called.
// Running state  -> When Thread scheduler schedule thread over CPU.Execution of run method of Thread is called.
// Timed waiting state -> When sleep(args) and join(args) method has been called.
// Waiting state -> When wait() or join() is called.
// Terminated state -> When execution of run() method has been finished.
// Blocked state -> Thread waits to acquire lock.
class Mythread extends Thread{
	public void run(){
		Thread m1=Thread.currentThread(); //Thread.currentThread -> returns the object of the current thread which consists of getName_function.
		String s1=m1.getName(); //it returns the name of the current thread.
		for(int i=1;i<=5;i++){
			System.out.println(i+"  "+s1);
			try{
				Thread.sleep(501);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
class thread{
	public static void main(String args[])throws Exception{
		Mythread t1=new Mythread();
		Mythread t2=new Mythread();
		t1.start();
		//t1.start();
		t1.join(); //by join , first t1 object will run fully then it goes to the next line of t1.join().
		//t2.start();
		// Thread m1=Thread.currentThread();
		String s1=Thread.currentThread().getName(); 
		for(int i=0;i<=5;i++){
			System.out.println(i+"  "+s1);
			//Thread.sleep(500);     -> this is check Exception which is capture by the compiler
			try{
				Thread.sleep(500);
			}
			catch(Exception e){
				System.out.println("e");
			}
		}
		
		System.out.println("Start Executed");
	}
}
/*
When we execute a program then a main thread is call automatically with some thread name (most probabily Thread0 and it is executing.
-> And it is scheduled on the CPU and main thread is provided with a call stack.
	-> Then in the call stack all the Activation records like local variable are listed.
		-> If we call the start method of the given thread which is inheriting the thread class in it.
			-> Then another thread will formed with some thread name (most probabily Thread1) 
				-> And the Thread1 is provided with a unique call stack.
					-> Then in the call stack all the Activation records of that method are listed in it.
		-> If we call the run methond of the given class/thread.
			-> Then no any external thread is called,
				-> And the activation records of the given class is made in the privious main thread called Thread0.
					-> Then in the call stack of the main Thread0, all the Activation records are listed. 
*/