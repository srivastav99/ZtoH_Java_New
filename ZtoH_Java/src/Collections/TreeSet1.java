package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		
		SortedSet<Integer> ts = new TreeSet<Integer>();
		System.out.println("Size of TreeSet ts at start:"+ts.size());
		
		ts.add(565);
		ts.add(565);
		ts.add(34);
		ts.add(34);
		ts.add(57);
		ts.add(57);
		ts.add(12);
		ts.add(12);
		ts.add(23);
		
		System.out.println("Size of TreeSet ts after adding elements:"+ts.size());
		System.out.println("Values of TreeSet ts:"+ts);//Since it is a set all the duplicates are removed but the insertion order will not be maintained as it contains unordered data
		//ts.add(0, 1233);//(Does not allow at add at index as sets do not maintain indexes and therefore the data in set is unordered(insertion order is not maintained)
		
		Set<Integer> ts1 = new HashSet<Integer>();
		ts1.add(23);
		ts1.add(56);
		ts1.add(78);
		
		ts1.retainAll(ts);//This method only stores data that is same inside both TreeSets
		System.out.println("After retaining values that are same in both ts and ts1 inside ts1, Treesets ts1 elements:"+ts1);
		ts1.add(56);
		ts1.add(78);
		
		ts.addAll(ts1);
		System.out.println("TreeSet ts after adding TreeSet ts1 to ts:"+ts);
		
		ts.add(26);
		System.out.println("TreeSet after adding 26:"+ts);
		System.out.println("TreeSet contains 26:"+ts.contains(26));
		
		ts.remove(26);//Here we are removing value by directly giving number whereas in ArrayList we have to remove through index.
	
		System.out.println("TreeSet ts after removing number 26 :"+ts);
		
		System.out.println("TreeSet s and TreeSet s1 equal:"+ts.equals(ts1));//Checks if both TreeSets are equals or not(checks all values in TreeSets)
		
		System.out.println(ts.contains(12));//This method checks if the given value is present inside TreeSet or not
		
		System.out.println("First element in the TreeSet:"+ts.first());//Gives the first element in the TreeSet
		
		System.out.println("Last element in the TreeSet:"+ts.last());//Gives the last element in the TreeSet
		
		System.out.println("Hash code of TreeSet ts:"+ts.hashCode());//Gives Hash code of TreeSet
		
		System.out.println("Is the TreeSet ts empty:"+ts.isEmpty());//Checks if given TreeSet is empty or not
		
		
		/*
		System.out.print("Printing 's' hashset with normal for loop:");
		for (int i = 0; i < ts.size(); i++) {
			System.out.print(ts.get(i)+" "); //gives error as treeset doesnot have .get() method as it does not store the insertion order of the elements.
		}
		System.out.println();
		*/
		
		System.out.print("Printing 'ts' hashset with for-each loop:");
		for (Integer i : ts) {
			System.out.print(i+" ");
		}
		
		/*
		ts.clear();//Clears all the data inside the TreeSet
		System.out.println("After using clear method, TreeSet ts:"+ts);
		System.out.println("Length of TreeSet ts after using clear method:"+ts.size());
		*/
		
	}
	

}
