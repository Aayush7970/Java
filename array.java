import java.util.*;
class array{
	public int[][] methodrearray(){
		int arr[][]={{1,2,3},{4,5,6}};
		return arr;
	}
	public static void main(String args[]){
		array a=new array();
		Scanner sc=new Scanner(System.in);
		int st[][]=a.methodrearray();
		for(int i=0;i<st.length;i++){
			for(int j=0;j<st[i].length;j++){
				System.out.println(st[i][j]);
			}
		}
	}
}