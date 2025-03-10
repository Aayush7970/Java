class base{
	int x;
	int y;
	base(){
		this(1,1);
	}
	base(int x,int y){
		this.x=x;
		this.y=y;
	}
	void display(){
		System.out.println("Inside base class");
	}

}
class child extends base{
	child(int x,int y){
		super(x,y);
	}
	child(){
	}
	void display(){
		System.out.println("Inside child class");
	}
}
class thisandsuper{
	public static void main(String args[]){
		child c=new child();
		base b=new base();
		System.out.println("x is "+c.x +" and y is "+c.y);
		System.out.println(b instanceof child);
		c.display();
	}
}
/* Rules of method overriding :-
   -> Both the superclass and the subclass must have the same method name,
      the same return type and the same parameter list.
   -> We cannot override the method declared as final and static.
   -> We should always override abstract methods of the superclass.
   
   * Abstract class : is a restricted class that cannot be used to create objects
     (to access it. it must be inherited from another class).

   * Abstract method : can only be used in an abstract class, and it does not have body.
     The body is provided by the subclass(inherited from).

   * Super keyword is used to call the base class funtion, constructor, variable;

   * Final Keyword : if variable -> we can't change it's value;
                     if method/function -> we can't override on it;
                     if class -> we can't inherit it;