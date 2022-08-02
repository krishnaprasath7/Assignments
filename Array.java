import java.util.*;
public class Array {
	public static void main(String[] args) {
	//int a=101;
	//
	//String s3[]=s2.split("_");
	//System.out.println(s3);
	//for(String m:s3) {
	//	System.out.println(m);
	//}
	//
		StringBuffer v=new StringBuffer("abcdef");
		v.append("mono");
		System.out.println(v);
		v.replace(2, 4, "jazz");
		System.out.println(v);
		 StringBuffer sbb=new StringBuffer(v);
		    sbb.reverse();
		   String newL=sbb+"";
		   System.out.println(newL);

}
}
