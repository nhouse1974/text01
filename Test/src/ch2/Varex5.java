package ch2;

public class Varex5 {

	public static void main(String[] args) {
		
		int num = 10;
		double d = 10.5;
		String s = "eng";
		
		double dd = num + d;
		
		System.out.println(num+d);
		System.out.println(s+d);  //"eng + "10.5 = eng10.5
		System.out.println(s+d+num);  //"eng + "10.5" = eng10.5 + "10" => eng10.510
		System.out.println(s+(d+num));	//10.5+10 => 20.5eng
		
		
		
	
		
		
   
	}

}

