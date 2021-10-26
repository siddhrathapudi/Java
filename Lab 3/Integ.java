import java.util.*;
import java.lang.Math;
class Integ {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int vari = sc.nextInt();
		int j,a;
		String str = String.valueOf(vari);
		StringBuffer sb = new StringBuffer("");
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			j=Math.abs(ch[i]-ch[i+1]);
			sb.append(j);
			if(i==ch.length) {
				a=ch[ch.length-1];
				sb.append(a);
			}
		}
		System.out.println(sb);
	}
}