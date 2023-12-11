
package in.sode;
public class Bitlogic {
    public static void main(String[] args) {
        int a = 8;
        int b = 4;
        int c = a | b;
        int d = a & b; 
        int e = a ^ b; 
        int f = (a & b) & (a & ~b); 
        int g = ~a & 0x0f; 
        int h = 0x1a;//0x1a is a hexadecimal value
        //toBinaryString
        //Returns a string representation of the integer argument as an unsigned integer in base 2.
        System.out.printf("a: "+a+" - %s\n",  Integer.toBinaryString(a));
        System.out.printf("b: "+b+" - %s\n", Integer.toBinaryString(b));
        System.out.printf("c: "+c+" - %s\n",  Integer.toBinaryString(c));
        System.out.printf("d: "+d+" - %s\n",  Integer.toBinaryString(d));
        System.out.printf("e: "+e+" - %s\n",  Integer.toBinaryString(e));
        System.out.printf("f: "+f+" - %s\n",  Integer.toBinaryString(f));
        System.out.printf("g: "+g+" - %s\n",  Integer.toBinaryString(g));
        System.out.println("The value of h is "+h);
    }
    
}
