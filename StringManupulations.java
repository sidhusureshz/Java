import java.util.Scanner;
public class StringManipulations{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first String:");
String s1=sc.nextLine();
System.out.println("Enter the Second String:");
String s2=sc.nextLine();

System.out.println("a)New string:"+s1+","+s2);
System.out.println("b)Length of String s1:"+s1.length());
System.out.println("c)Concat of s1&s2:"+s1.concat(s2));
System.out.println("d)Character Extraction:"+s1.charAt(0));
System.out.println("e)String Comparison:");
System.out.println(s1.equals(s2));
System.out.println(s1.compareTo(s2));
System.out.println("f)Searching substring:"+s1.indexOf("a"));
System.out.println("g)Modifying String 1:"+s1.replace("o","Noooo"));
System.out.println("h)Modifying String 2:"+s1.toUpperCase());

System.out.println("Enter an Integer value:");
int num=sc.nextInt();
System.out.println("i)Data Conversion:"+String.valueOf(num));
System.out.println("j)Split the string:"+s1.split(""));
}
}
