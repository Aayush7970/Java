//Runnable is an interface which is implemented into the Thread class.
class mythread implements Runnable{
	//mythread(){
	//	new Thread(this).start();     --> we can also write these three lines instead of 18 and 19 lines in main.
	//}
	public void run(){
		for(int i=1;i<5;i++){
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
}

class runnable{
	public static void main(String args[]){
		mythread th=new mythread();
		//th.run() it ends the concept of multithreading. So, we not use it.
		//th.start() there is no start method in mythread bcz it implements Runnable interface but not Thread class and start() method is whithin Thread class
		Thread t1=new Thread(th); // it calls the constructor of thread which accept the object so that run function in thread becomes same as the run funtion in mythread.
		t1.start();
	}
}