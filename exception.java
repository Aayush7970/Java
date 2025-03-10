
class exception{
	static void check(int n)throws ArithmeticException // finds the total number of exceptions thrown and follows by the class name.
	{
		if(n<18){
			throw new ArithmeticException("Access Denied, you are under 18"); // throw follows by the object name.
		}
		else{
			System.out.println("Access Granted");
		}

	}
	static void realcheck(){
		
	}
	public static void main(String args[]){
		// try{
		// 	int x=5;
		// 	int y=0;
		// 	int m=x/y;
		// }
		// catch(Exception e){
		// 	System.out.println(e);
		// }

		// catch(Throwable t){
		// 	t.printStackTrace();
		// 	System.out.println("Cause : "+t.getCause());
		// 	System.out.println("Message : "+t.getMessage());
		// }
		// finally{
		// 	System.out.println("After the catch block");
		// }
		// check(17);
		// realcheck();
		try{
			int m[]=new int[5];
			System.out.println(m[10]);
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException occur"+e);
		}
		catch(ArrayIndexOutOfBoundsException e2){
			System.out.println("ArrayIndexOutOfBoundsException occur"+e2);
		}
		catch(Exception elast){
			System.out.println("General Exception occur"+elast);
		}
		// Multiple catch must be written in right order (lower->higher).
	}

}
/* Types of exception :-
-> user defined exception
-> Built-in exception :-
	-> Check exception : Exception known at complie time.
		->ClassNotFoundException
		->InterruptedException
		->IOException
		->instantiationException
		->SQLException
		->FileNotFoundException
	-> Uncheck exception : Exception doesn't know at run time.
		->ArthmeticException
		->ClassCastException
		->NullPointerException
		->ArrayIndexOutOfBoundsException
		->ArrayStoreException
		->IllegalThreadStateException
	-> Error : Unexpected Exception (error occured). 
*/