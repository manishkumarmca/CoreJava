package com.manish;


interface Hello1{
	public String say(String str);
}
public class MultipleStatement {

	public static void main(String[] args) {
		 
		
		Hello1 h= (str)->{
			
			String s="Hello";
			String s2 = s+str;
			
			return s2;
			
		};
		System.out.println(h.say("manish"));
		
	}

}
