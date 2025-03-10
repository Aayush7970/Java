class after4{
	public int sum(int ... args){
		System.out.println("No. of argument : "+args.length);
		int sum=0;
		for(int i:args){
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String args[]){
		after4 a=new after4();
		System.out.println("Sum : "+a.sum(2,3));
		System.out.println("Sum : "+a.sum(2,3,5));
	}
}