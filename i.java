class s{

		public int s;
		s(int s){
			this.s=s;
		}
}

class x extends s{
	x(int n){
		super(n);
	}

}
class i{
	public static void main(String args[]){
		x y=new x(5);
		System.out.println(y.s);
	}
}