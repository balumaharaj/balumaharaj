package hashset;
import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set ss=new HashSet();
System.out.println("size"+ss.size());
System.out.println("empty"+ss.isEmpty());
ss.add(10);
ss.add(20);
System.out.println("size"+ss.size());
System.out.println("empty"+ss.isEmpty());
System.out.println(ss);
System.out.println("remove"+ss.remove(10));
System.out.println("empty"+ss.isEmpty());
System.out.println("size"+ss.size());
System.out.println("empty"+ss.isEmpty());

	}

}
