package com.Basic;

public class String_Res {
	

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="Yashodhar";//String  by java string literal
		char ch[] ={'y','a','s','h','o','d','h','a','r','.','s'};
		String s3 = new String(ch);//Creating java to string
		String s2=  new String("Yash");//creating java string by new keyword 
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//Immutable String in Java(Can not changed)
		String s4= "YASHODSHR";
		s4 =s4.concat( "Suvarna");
		System.out.println("Immutable Strin===  "+s4);
		
		//Compare two Strings  using equals
		String s5= "Yash";		
		String s6= "YASH";
		System.out.println("Campare equal "+s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		
			
		   String s7="Sachin";  
		   String s8="Sachin";  
		   String s9=new String("Sachin");  
		   System.out.println(s7==s8); 
		   System.out.println(s7==s9);
		   
		   String s10 = "YAsh";
		   String s11 = "Yash";
		   String s12 = new String("yash");
		   System.out.println(s10.compareTo(s11));
		   System.out.println(s11.compareTo(s12));
		  
		   //SubStrings		   
		   String s13="SachinTendulkar";  
		   System.out.println(s13.substring(6));
		   System.out.println(s13.substring(0,3));
		   
		   System.out.println(s10.toLowerCase());
		   System.out.println(s10.toUpperCase());
		   System.out.println(s10.trim());//remove white space
		   System.out.println(s7.startsWith("Sa"));
		   System.out.println(s7.endsWith("n"));
		   System.out.println(s7.charAt(4));
		   System.out.println(s7.length());


		   String Sreplace = s10.replace("Y","A");
		   System.out.println(Sreplace);
		   
		   System.out.print("String Buffer");
		  StringBuffer sb = new StringBuffer("Hello");
		  sb.append("JavaTpoint");
		  sb.insert(1,"JavaTpoint");
		  sb.replace(1, 5, "JavaTpoint");
		  sb.delete(1, 3);
		  sb.reverse();
		  System.out.println("  "+sb);
		  
		  String  t1 = "Wexos Informatica Bangalore";
		  System.out.println(t1.contains("Informatica"));
		  System.out.println(t1.contains("Wexos"));
		  System.out.println(t1.contains("wexos"));
		  
		  
		 String name = "Yashodhar";
		 String sf1 = String.format(name);
		 String sf2= String .format("Value of %f", 334.4);
		 String sf3 = String.format("Value of % 43.6f", 333.33);
		 			 
		 
		 System.out.println(sf1);
		 System.out.println(sf2);
		 System.out.println(sf3);
		  
		 String  m1 = "ABCDEF";
		 byte[] brr = m1.getBytes();
		 for(int i=1;i<brr.length;i++)
		 {
		 System.out.println(brr[i]);
		 }
		 
		 String s16 = "";
		 System.out.println(s16.isEmpty());
		 System.out.println(m1.isEmpty());
		 
		 String s17 =String.join("Welcome ", "To","Wexos Infomatica");
		System.out.println(s17);
		 
 
	}

}
