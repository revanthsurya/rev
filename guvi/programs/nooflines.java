import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.replaceAll(" ","");
		int len=str.split("[.]+").length;
	            System.out.println(len);
	}
}
