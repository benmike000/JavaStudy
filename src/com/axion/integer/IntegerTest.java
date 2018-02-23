package com.axion.integer;

public class IntegerTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer in = new Integer(108);
		Integer in2 = new Integer(108);
		Integer in3 = new Integer(1000);
		Integer in4 = new Integer(1000);
		
		System.out.println(in.toString());
		
		System.out.println(in.intValue());
		
		System.out.println(in.floatValue());
		
		System.out.println(in.doubleValue());
		
		System.out.println(in.longValue());
		
		System.out.println(in.byteValue());
		
		System.out.println(in.shortValue());
		
		System.out.println(in.compareTo(109));
		
		System.out.println(in.compareTo(107));
		
		System.out.println(in.compareTo(108));
		
		System.out.println(in.equals(in2));
		
		System.out.println(in3.equals(in4));
		
		Integer.compare(in, in2);
		
		System.out.println("Integer bytes number is: " + Integer.BYTES);
		
		System.out.println("Integer type max value is： " + Integer.MAX_VALUE);
		
		System.out.println("Integer type min value is: " + Integer.MIN_VALUE);
		
		System.out.println("Integer two's complement binary form bit count is: " + Integer.SIZE);
		
		System.out.println("Two's complement binary form of 108 is:" + Integer.toBinaryString(108));
		
		System.out.println("Hex form of 108 is: " + Integer.toHexString(108));
		
		System.out.println("Octal form of 108 is: " + Integer.toOctalString(108));
		
		System.out.println("one-bits in 108 of two's complement binary form is: " + Integer.bitCount(108));
		
		System.out.println("one-bits in 109 of two's complement binary form is: " + Integer.bitCount(109));
		
		System.out.println("108 decode is: " + Integer.decode("108"));
		
		System.out.println("0x6c decode is: " + Integer.decode("0x6C"));
		
		System.out.println("#6c decode is: " + Integer.decode("#6C"));
		
		System.out.println("#154 decode is: " + Integer.decode("0154"));
		
		System.out.println("Highest bit of 65 to int is: " + Integer.highestOneBit(65));
		System.out.println("Lowest bit of 65 to int is: " + Integer.lowestOneBit(65));
		
		System.out.println("Highest bit of 64 to int is: " + Integer.highestOneBit(64));
		System.out.println("Lowest bit of 64 to int is: " + Integer.lowestOneBit(64));
		
		System.out.println("Highest bit of 63 to int is: " + Integer.highestOneBit(63));
		System.out.println("Lowest bit of 63 to int is: " + Integer.lowestOneBit(63));
		
		System.out.println(Integer.valueOf(123));
		
		System.getProperty(java.lang.String) 
	}
}
