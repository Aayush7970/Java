class check{

	static void abc() throws IllegalAccessException{
		throw new IllegalAaccessException("Something Happened");
	}
	public static void main(String args[]){
		try{
			abc();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}