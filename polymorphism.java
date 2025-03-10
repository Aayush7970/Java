class shape{
	void display(){
		System.out.println("Inside the shape class");
	}
	void display(int a){
		System.out.println("Display the number : "+a);
	}
	void display2(){
		System.out.println("Under display2 in shape class");
	}
}
class square extends shape{
	int display(){
		System.out.println("Inside the square class");
		return 2;
	}

}

class polymorphism{
	public static void main(String args[]){
		shape s;
		s=new shape();
		s.display();
		s.display2();
		s=new square();
		s.display();
		s.display2();
		square sq=new square();
		sq.display();
		sq.display2();
		String d="namaste";
		String d1="duniya";
		System.out.println(d+d1);//-> this is operator overloading;
		//sq=new shape();

	}
}