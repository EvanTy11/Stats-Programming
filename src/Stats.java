import java.util.*;
public class Stats {
private int[] data;

public Stats(int[] data) {
	this.data = data;
}
public int getLength(int[] a) {
	int length;
	length = data.length;
	return length;
}
	public int Mean(int[] mean) {
		int sum = 0;
		for (int i = 0; i < mean.length; i++) {
			sum += mean[i];
		}
		int average = sum/mean.length;
		return average;
	}

 public int Mode(int[] Mode) {
	 int count = 0;
	 int temp = 0;
	 int value = 0;
	 for (int i = 0; i < Mode.length - 1; i++) {
		 
		while(Mode[i] > Mode[i + 1]) {
			Mode[i] = Mode[i + 1];
			
		}
	 }	 
	for (int j = 0; j < Mode.length - 1; j++) {
		
		if(Mode[j] == Mode[j + 1]) {
			count++;	
		}
		if(Mode[j] != Mode[j + 1]) {
			if(count > temp) {
			temp = count;
			value = Mode[j];
			}
		}
		}
	 return value;
 }
 public double getSD(int[] numbers){
	 if(numbers.length <= 1) {
		 return 1;
	 }
	 if(numbers.length == 0) {
		 return 0;
	 }
	 double mean = 0;
	 
	 for(int i = 0; i < numbers.length; i++) {
		 mean += numbers[i];
		 
	 }
	mean =  mean/numbers.length;
	double sumofTempvalues = 0;
	for(int i = 0; i < numbers.length; i++) {
		double tempValue = Math.pow(mean - numbers[i], 2);
		sumofTempvalues = sumofTempvalues + tempValue;
	}
	double result = Math.sqrt(sumofTempvalues);
	return result;
 }
 public ArrayList<Integer> Intersects(ArrayList<Integer> list1, ArrayList<Integer> list2) {
	 ArrayList<Integer> intersect = new ArrayList<Integer>();
	 if(list1.size() >= list2.size()) {
		 for(int i = 0; i < list2.size(); i++) {
			 
			 for (int j = 0; j < list1.size(); j++){
				 if(list2.get(i) == list1.get(j)){
					 intersect.add(list2.get(i));
				 }
			 }
		 } 
	 }
	 else{
		for(int i = 0; i < list1.size(); i++) {
			
			for(int j = 0; i < list2.size(); j++) {
				if(list1.get(i) == list2.get(j)){
					intersect.add(list1.get(i));
				}
			}
		}
	 }
	 
 return intersect;
}
 public ArrayList<Integer> Union(ArrayList<Integer> list1, ArrayList<Integer> list2){
	ArrayList<Integer> Union = new ArrayList<Integer>(); 
	 for(int i = 0; i < list1.size(); i++) {
			
			for(int j = 0; i < list2.size(); j++) {
				if(list1.get(i) == list2.get(j)){
					intersect.add(list1.get(i));
				}
			}
		}
	 return null;
 }
}

