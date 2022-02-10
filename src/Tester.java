import java.util.*;
public class Tester {
	
public static void main (String args[]) {
	Scanner a = new Scanner(System.in);
	System.out.print("Enter length of the Array");
	int length = a.nextInt();
	int[] data = new int[length];
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	list1.add(1);
	list1.add(2);
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	list2.add(1);
	list2.add(2);
	list2.add(3);
	for (int i = 0; i < length; i++) {
		System.out.print("Please type an element of the Array");
		int element = a.nextInt();
		data[i] = element;
	}
		Stats b = new Stats(data);
		System.out.print(b.Intersects(list1, list2));
		System.out.print("Mean" + b.Mean(data));
		System.out.print("Mode:"+ b.Mode(data));
		System.out.print("Standard Deviation:"+ b.getSD(data));
		
			
}	
}

