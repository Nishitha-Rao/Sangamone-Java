
package in.sode;
public class Lambda {
    //Using interface
    interface Rectangle{
	int area(int a,int b);
    }
    public static void main(String[] args) {
        Rectangle rect=(a,b)->(a*b);    //reference of interface
		int num1=10;
		int num2=5;
		int sum=rect.area(num1,num2);
		System.out.println(sum);
    }
    
}
