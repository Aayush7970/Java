/*
-----------------------class----------------------------------|------------------interface------------------------------
-> keyword : class                                            |   -> keyword : interface
-> can be instantiated and object can be created.             |   -> can't be instantiated and object cannot be created
-> does not support multiple inheritance                      |   -> support multiple inheritance
-> can inherit another class                                  |   -> can't inherit another class
-> can be inherited by other class using "extends" keyword    |   -> can be inherited by other class using "implements" 
															  |      keyword and inherited by an interface using "extends"
															  |      keyword
-> it can contains constructor                                |   -> cannot contains constructor
-> it cannot contain abstract method                          |   -> it only contains abstract methods
-> variable and methond in class declared using public/private|   -> variable and method are declared in interface
   /protected/default   								      |      only as public
-> variables in class can be static,final,or nothing          |   -> variables in interface must be static or final                            
*/
interface myinterface{
	public void method1();
	public void method2();
}
class first implements myinterface{
	public static void main(String args[]){
		public void method1(){
			System.out.println("In method1");
		}
		public void method2(){
			System.out.println("In method2");
		}
	}
}