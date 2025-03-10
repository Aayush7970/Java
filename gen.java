
class Mgen<T1>{
	public int val;
	private T1 t;
	Mgen(int val,T1 t){
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

class gen{
	public static void main(String args[]){
		// ArrayList<integer> ar=new ArrayList();
		// ar.add(97);
		// ar.add(10);
		// ar.add(53);
		// int a=ar.get(0);
		Mgen<String> ob=new Mgen(5,"String");
		int x=ob.getvalue();
		System.out.println(x);
	}

}
//Exam st2 coding question:-
/*
int flag=0;
for(int i=0;i<str.length()-4;i++){
	if(str.charAt(i)=='x'){
		if(str.charAt(i+1)!='y' && str.charAt(i+2)!='y' && str.charAt(i+3)!='y' && str.charAt(i+4)=='y'){
			flag=1;
			break;
		}
	}
	if(str.charAt(i)=='y'){
		if(str.charAt(i+1)!='x' && str.charAt(i+2)!='x' && str.charAt(i+3)!='x' && str.charAt(i+4)=='x'){
			flag=1;
			break;
		}
	}
}
if(flag) return true;
return false;
*/