public class Casting {
	public static void main (String[] args){

	byte b = 6;
	short s = b;
	int i = s;
	long l = i;
	float f = l;
	double d = f;

	System.out.println("casting via autoconversion: 6 (byte) > short > int > long > float > double");
	System.out.println(b);
	System.out.println(s);
	System.out.println(i);
	System.out.println(l);
	System.out.println(f);
	System.out.println(d);
	System.out.println("And now in reverse from double to byte");

	double d2 = 123.45;
	float f2 = (float)d2;
	long l2 = (long)f2;
	int i2 = (int)l2;
	short s2 = (short)i2;
	byte b2 = (byte)s2;

	System.out.println(d2);
        System.out.println(f2);
        System.out.println(l2);
        System.out.println(i2);
        System.out.println(s2);
        System.out.println(b2);	

	}
}

