class first{
	public static void main(String args[]){
		System.out.println("Namaste duniya");
		//YZYZYZ  --> Answer  --> 2315476
		/* Type casting types :-
		   --> Widening Type Casting(implicit->self by complier) : lower -> higher value;
		   --> Narrowing Type Casting(explicit -> by the coder) : higher -> lower value;
		   */
		int x=79;
		System.out.println("x : "+x);
		double y=x;
		System.out.println("y : "+y);
		//int z=y;  it shows error (wide --> narrow)
		int z=(int)y;
		System.out.println("z : "+z);

		/*
		Operators and Precedence :-(highest to lowest)
		Operators                    Precedence
		postfix inc and dec          ++--(x++)
		prefix inc and dec           ++--(++x)
		multiplicative				 * / %
		additive                     +-
		shift                        << >> >>>
		realtional                   <> <= >= instaceof
		equality                     == !=
		bitwise AND                  &
		bitwise exclusive OR(XOR)    ^
		bitwise inclusive OR         |
		logical AND                  &&
		logical OR                   ||
		*/ 
		second s1=new second();
		s1.fun();
		third t1=new third();
		t1.tclassp();
		fourth.f();

	}
	//if conversion is automatic done by the compiler then it is called implicit conversion
	//otherwise it is called explicit conversion.
}

class third{	
	static int i=11;//non static function can access static and non static data members;
	void tclassp(){
		System.out.println("Into the third class "+i);
	}
}

class fourth{
	//int i=12; static function can't access non static data member;
	static int i=12;
	public static void f(){
		System.out.println("Into the fourth class "+i);
	}
}

/* Function overloading :-
Having the same function name but different return type or parameter;
   int area(int r){}
   float area(float r){}
   int area(int l,int b){}
*/
/* Using of this keyword
  
   int x; --> object ka variable
   void f(int x){
	this.x=x;
   }
   this keyword is referencing the variable made in the object.
   --> used to refer current class instance variable
   --> used to invoke current class method(implicitly)
   --> used to invoke current class constructor
   --> passed as an argument in the method call
   --> passed as an argument in the constructor call
   --> used to return the current class instance from the method
*/