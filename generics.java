
class Mygen<T1>{
	public int val;
	private T1 t;
	Mygen(int val,T1 t){
		this.val=val;
		this.t=t;
	}
	public int getvalue(){
		return val;
	}
	public T1 gett(){
		return t;
	}
}

class generics{
	public static void main(String args[]){
		// ArrayList<integer> ar=new ArrayList();
		// ar.add(97);
		// ar.add(10);
		// ar.add(53);
		// int a=ar.get(0);
		Mygen<String> ob=new Mygen(5,"String");
		int x=ob.getvalue();
		System.out.println(x);
	}

}