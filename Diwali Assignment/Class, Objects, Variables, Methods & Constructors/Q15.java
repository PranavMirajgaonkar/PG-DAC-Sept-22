import java.lang.*;
import java.util.*;

class Database{
	
	int a;
	int b;
	
	Database(){
	
	
	}
	
	Database(int a, int b){
		
		this.a = a;
		this.b = b;
		
	}
	
	public String toString(){
		
		return " Database [ a = "+a+", b = "+b+" ]";
		
	}
	
	public int hashCode(){
		
		return 5*(a+b);
		
	}
	
	public boolean equals(Object ob){
		
		Database d = (Database)ob;
		
		if(this.a == d.a && this.b == d.b){
			
			return true;
			
		}
		
		else{
			
			return false;
			
		}
	}
	
	
}

class Q15{
	
	public static void main(String args[]){
		
		Database d1 = new Database(5, 7);
		Database d2 = new Database(5, 7);
		
		System.out.println("d1 = "+d1);
		System.out.println("Hash code of the d1 is : "+d1.hashCode());
		
		System.out.println("d1 = "+d1);
		System.out.println("Hash code of the d2 is : "+d2.hashCode());
		
		System.out.println(d1.equals(d2));
		System.out.println("Hash code of the d1 is : "+d1.hashCode());
		System.out.println("Hash code of the d1 is : "+d1.hashCode());
		
	}
}