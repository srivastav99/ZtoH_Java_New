package Collections;

import java.util.Collections;
import java.util.HashSet;

import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		//HashSet works with directly values inside it unlike ArrayList which deals with indexes.
		Set<Integer> s = new HashSet<Integer>();
		System.out.println("Size of HashSet at start:"+s.size());
		
		s.add(12);
		s.add(12);
		s.add(34);
		s.add(34);
		s.add(57);
		s.add(565);
		s.add(565);
		s.add(57);
		s.add(23);
		
		System.out.println("Size of HashSet after adding elements:"+s.size());
		System.out.println("Values of HashSet s:"+s);//Since it is a set all the duplicates are removed but the insertion order will not be maintained as it contains unordered data
		//s.add(0, 1233);//(Does not allow at add at index as sets do not maintain indexes and therefore the data in set is unordered(insertion order is not maintained)
		
		//Collections.sort(s,Collections.reverseOrder());//Cannot sort as set does not work with indexes
		
		//Collections.sort(s);//Cannot sort as set does not work with indexes
		
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(23);
		s1.add(56);
		s1.add(78);
	
		s1.retainAll(s);//This method only stores data that is same inside both HashSets
		System.out.println("After retaining values that are same in both s and s1 inside s1, HashSet s1 elements:"+s1);
		s1.add(56);
		s1.add(78);
		
		s.addAll(s1);
		System.out.println("HashSet s after adding HashSet s1 to s:"+s);
		
		s.add(26);
		System.out.println("HashSet after adding 26:"+s);
		System.out.println("HashSet contains 26:"+s.contains(26));
		
		s.remove(26);//Here we are removing value by directly giving number whereas in ArrayList we have to remove through index.
		
		System.out.println("HashSet s after removing number 26 :"+s);
		
		System.out.println(s.contains(34));//This method checks if the given value is present inside HashSet or not
		
		System.out.println("HashSet s and HashSet s1 equal:"+s.equals(s1));//Checks if both HashSets are equals or not(checks all values in HashSets)
		
		System.out.println("Hash code of HashSet s:"+s.hashCode());//Gives Hash code of HashSet
		
		System.out.println("Is the HashSet s empty:"+s.isEmpty());//Checks if given HashSet is empty or not
		
		/*
		System.out.print("Printing 's' hashset with normal for loop:");
		for (int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i)+" "); //gives error as hashset doesnot have .get() method as it does not store the insertion order of the elements.
		}
		System.out.println();
		*/
		System.out.print("Printing 's' hashset with for-each loop:");
		for (Integer i : s) {
			System.out.print(i+" ");
		}
		
		/*
		s.clear();//Clears all the data inside the HashSet
		System.out.println("After using clear method, HashSet s:"+s);
		System.out.println("Length of HashSet s after using clear method:"+s.size());
		*/
		
		
	}

}
