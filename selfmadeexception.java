class ownexception extends Exception{
	ownexception(String s){
		super(s);
	}
}

class selfmadeexception{
	public static void main(String args[]){
		try{
			throw new ownexception("user defined exception are also called custom exception");
		}
		catch(ownexception e){
			System.out.println(e);
		}
	}
}
/*
What is finalization in java ?
-> Just before destroying any object the garbage collector always calls finalize()
   method to perform clean-up activities on that object. This process is known as 
   Finalization in Java