package Lab3;
import java.util.*;
import java.io.*;

public class Num_of_char {

	public static void main(String[] args)throws IOException
	{
		int nl=1,nw=0;
		char ch;
		Scanner scr=new Scanner(System.in);
		System.out.print("\n Enter File name: ");
		String str=scr.nextLine();
		FileInputStream f=new FileInputStream(str);
		int n=f.available();
		for(int i=0;i<n;i++)
		{
				ch=(char)f.read();
				if(ch=='\n')
					nl++;
				else if(ch==' ')
					nw++;
		}
		System.out.println("\nNumber of Lines: "+nl);
		System.out.println("\nNumber of words: "+(nl+nw));
		System.out.println("\nNumber of characters: "+n);
	}

}
