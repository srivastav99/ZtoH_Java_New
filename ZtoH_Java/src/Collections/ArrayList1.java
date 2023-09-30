package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayList1 {

	public static void main(String[] args) {
		//ArrayList works based on index mostly.
		List<Integer> a = new ArrayList<Integer>();//Generic type, can store values of only one kind of data-type.
		ArrayList<Integer> ar = new ArrayList<Integer>();//Here we are creating object of class having a interface which is not a good way to do as interface is there to provide protection to class but by making object of class we are allowing access to everything inside the class.
		//ArrayList arr = new ArrayList<>();//This is heterogeneous type, here we can store multiple data-types inside this ArrayList.
		System.out.println("Size of list at start:"+a.size());
		List<String> as = new ArrayList<String>();
	
		a.add(26);
		a.add(23);
		a.add(23);
		a.add(243);
		a.add(45);
		System.out.println("Size of list after adding elements:"+a.size());
		System.out.println("list after adding elements:"+a);
		
		a.add(0, 1233);
		System.out.println("Size of list after adding a element at a index:"+a.size());
		System.out.println("list after adding a element at a index:"+a);
		
		a.remove(0);//Removes the data at prescribed index(in this case 0th index), in this we remove element through index whereas in HashSet we remove by direct value
		System.out.println("Size of list after removing a element at an index:"+a.size());
		System.out.println("list after removing a element:"+a);
		
		Collections.sort(a,Collections.reverseOrder());
		System.out.println("List after sorting big to small:"+a);
		Collections.sort(a);
		//a.sort(null); //This also sorts array from small to big
		System.out.println("List after sorting small to big:"+a);
		
		List<Integer> a1 = new ArrayList<Integer>();
		a1.add(23);
		a1.add(56);
		a1.add(78);
	
		a1.retainAll(a);//This method only stores data that is same inside both ArrayLists
		System.out.println("After retaining values that are same in both a and a1 inside a1, ArrayList a1 elements:"+a1);
		a1.add(56);
		a1.add(78);
		
		a.addAll(a1);
		System.out.println("ArrayList a after adding ArrayList a1 to a:"+a);
		
		System.out.println("ArrayList contains 26:"+a.contains(26));
		
		//Checks if both ArrayLists are equals or not(checks all values in ArrayLists)
		System.out.println("ArrayList a and ArrayList a1 equal:"+a.equals(a1));
		
		System.out.println(a.contains(12));//This method checks if the given value is present inside ArrayList or not
		
		System.out.println("Value at 0th index:"+a.get(0));//Gets the element present at the given index(in this case 0th index 23 is present)
		
		System.out.println("Value 23 occurs first at index:"+a.indexOf(23));//Gets the index of element given at its first occurrence(in this case 23 is at 0th and 1st index and thus it returns 0)
		System.out.println("Value 45 occurs first at index:"+a.indexOf(45));
		
		System.out.println("Value 23 occurs last at index:"+a.lastIndexOf(23));//Gets the index of element given at its last occurrence(in this case 23 is at 0th,1st and 5th index and thus it returns 5)
		
		System.out.println("Is the ArrayList a empty:"+a.isEmpty());//Checks if given Arraylist is empty or not
		
		System.out.println("Hash code of ArrayList a:"+a.hashCode());//Gives Hash code of ArrayList
		
		System.out.println("Runtime class of Object a:"+a.getClass());//Returns Runtime class of specified Object
		
		
		
		/*
		a.clear();//Clears all the data inside the ArrayList
		System.out.println("After using clear method, ArrayList a:"+a);
		System.out.println("Length of ArrayList a after using clear method:"+a.size());
		*/
		//If we make object of ArrayList like ArrayList<Integer> ar = new ArrayList<Integer>(); then methods like .clone() and .reverseAll() .get() will be available as the methods are present in ArrayList class and not in List interface.
		
		
	}

}
