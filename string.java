class string{ //command line argument -> passed at runtime
	public static void main(String[] args){
		if(args.length>0){
			System.out.println("the command line arguments are");
			for(String i:args)
				System.out.println(i);
		}
		else System.out.println("No argument passed");
		long begintime,runtime;
		begintime=System.nanoTime();
		String s="Learning String concept from wscube";
		int i=0;
		for(char c:s.toCharArray()){
			i++;
		}
		runtime=System.nanoTime()-begintime;
		System.out.println(i +" and Total time taken :"+runtime/1000+" usec");
	}
}	/* Non Access modifier :-
	   -> final : cant be inherited to other class
	   -> Abstract : made to inherit in another class and cant be used to make object
	*/
	/* Concatinating Strings :-
	   str1="abc",str2="nmo";
	   str1.concat(str2)--> str2 appends into str1 --> str1+str2;
	*/
	/* Methods in string :-
	   String str;
	   -> str.length() --> finding length of string str
	   -> str.concat(str2) --> concatinating str2 into str
	   -> str.charAt(i) --> returning char at index i in string str;
	   -> str.contains("xyz") --> if xyz is present in str then return true else return false;
	   -> str.contentEquals("xyz") --> if xyz equals to str then return true else return false;
	   -> str.indexOf('x') --> returns index of x elment in str, if x not present in str return -1;
	   -> str.isEmpty() --> return false if str is not empty or return true if str is empty;
	   -> str.toLowerCase() --> change each element of str into lower case;
	   -> str.toUpperCase() --> change each element of str into upper case;
	   -> str.trim() --> remove all the spaces from beggining and end;
	   -> str.substring(1) --> substring of str from index 1 to last element;


	   int length()         // Returns the length of String
StringBuffer append(type arg)  // type could be primitives, char[], String, StringBuffer, etc
StringBuffer insert(int offset, arg)

StringBuffer delete(int start, int end)
StringBuffer deleteCharAt(int index)
void setLength(int newSize)
void setCharAt(int index, char newChar)
StringBuffer replace(int start, int end, String s)
StringBuffer reverse()
 
// Methods for extracting whole/part of the content
char charAt(int index)
String substring(int start)
String substring(int start, int end)
String toString()
 
// Methods for searching
int indexOf(String searchKey)
int indexOf(String searchKey, int fromIndex)
int lastIndexOf(String searchKey)
int lastIndexOf(String searchKey, int fromIndex)






-----------------------------------------------------------------------------------------------------------------
// Reversing a long String via a String vs. a StringBuffer
public class Main 
{
  public static void main(String[] args) 
  {
    long beginTime, elapsedTime;

    // Build a long string
    String str = "";
    int size = 4623;
    char ch = 'a';
    beginTime = System.nanoTime();   // Reference time in nanoseconds
    for (int count = 0; count < size; ++count) 
    {
      str += ch;
      ++ch;
      if (ch > 'z') {
        ch = 'a';
      }
    }
    elapsedTime = System.nanoTime() - beginTime;
    System.out.println("Elapsed Time is " + elapsedTime/1000 + " usec (Build String)");

    // Reverse a String by building another String character-by-character in the reverse order
    String strReverse = "";
    beginTime = System.nanoTime();
    for (int pos = str.length() - 1; pos >= 0 ; pos--) {
      strReverse += str.charAt(pos);   // Concatenate
    }
    elapsedTime = System.nanoTime() - beginTime;
    System.out.println("Elapsed Time is " + elapsedTime/1000 + " usec (Using String to reverse)");

    // Reverse a String via an empty StringBuffer by appending characters in the reverse order
    beginTime = System.nanoTime();
    StringBuffer sBufferReverse = new StringBuffer(size);
    for (int pos = str.length() - 1; pos >= 0 ; pos--) {
      sBufferReverse.append(str.charAt(pos));      // append
    }
    elapsedTime = System.nanoTime() - beginTime;
    System.out.println("Elapsed Time is " + elapsedTime/1000 + " usec (Using StringBuffer's append() to reverse)");

    // Reverse a String by creating a StringBuffer with the given String and invoke its reverse()
    beginTime = System.nanoTime();
    StringBuffer sBufferReverseMethod = new StringBuffer(str);
    sBufferReverseMethod.reverse();     // use reverse() method
    elapsedTime = System.nanoTime() - beginTime;
    System.out.println("Elapsed Time is " + elapsedTime/1000 + " usec (Using StringBuffer's reverse() method)");

    // Reverse a String via an empty StringBuilder by appending characters in the reverse order
    beginTime = System.nanoTime();
    StringBuilder sBuilderReverse = new StringBuilder(size);
    for (int pos = str.length() - 1; pos >= 0 ; pos--) {
      sBuilderReverse.append(str.charAt(pos));
    }
    elapsedTime = System.nanoTime() - beginTime;
    System.out.println("Elapsed Time is " + elapsedTime/1000 + " usec (Using StringBuilder's append() to reverse)");

    // Reverse a String by creating a StringBuilder with the given String and invoke its reverse()
    beginTime = System.nanoTime();
    StringBuilder sBuilderReverseMethod = new StringBuilder(str);
    sBuilderReverseMethod.reverse();
    elapsedTime = System.nanoTime() - beginTime;
    System.out.println("Elapsed Time is " + elapsedTime/1000 + " usec (Using StringBuidler's reverse() method)");
  }
}

Answer
Elapsed Time is 119287 usec (Build String)
Elapsed Time is 49673 usec (Using String to reverse)
Elapsed Time is 1092 usec (Using StringBuffer's append() to reverse)
Elapsed Time is 230 usec (Using StringBuffer's reverse() method)
Elapsed Time is 479 usec (Using StringBuilder's append() to reverse)
Elapsed Time is 105 usec (Using StringBuidler's reverse() method)
*/