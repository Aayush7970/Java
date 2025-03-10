abstract class base{
	int x;
	base(int x){
		this.x=x;
	}
	abstract void speak();
	// abstract function must be inherited;
	public void display(){
		System.out.println("Display in base class "+x);
	}
}
class child extends base{
	child(int x){
		super(x);
	}
	public void speak(){ // speak function must be overrided
		System.out.println("Speak less "+x);
	}
}

class abstraction{
	public static void main(String args[]){
		child c=new child(5);
		c.speak();
		base b=new child(6);
		b.display();	

	}
}