package project1;

public class method2 {

	
	//instance method 
 /*public int add(int a, int b)
 {
  int c=a+b;
  return c;
}
	public static void main(String[] args) {
		method2 m=new method2();
System.out.println("sum of number "+m.add(23, 56));
	}	
}
*/
	
public static int add(int x, int y) {
	int s=x+y;
	return s;
}
	public static void main(String[] args) {
	int a =20;
	int b=34;
	int c=add(a,b);//actual parameter 
	System.out.println("addition of a and b ="+c);
	}
	}