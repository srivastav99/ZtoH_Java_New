package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapStudent {

	public static void main(String[] args) {

		Map<Integer, StudentData> c1 = new HashMap(); //HashMap to handle first class

		//sc1c1s1,sc1c1s2,sc1c1s3,sc1c1s4 are object representing each student of First class
		StudentData sc1c1s1 = new StudentData();
		sc1c1s1.name = "FirstClassaaaaa"; //Giving name for a student of First class
		c1.putIfAbsent(1, sc1c1s1); //Storing student name with roll.no as 1 into the HashMap c1. 
		
		StudentData sc1c1s2 = new StudentData();
		sc1c1s2.name = "FirstClassbbbbb";
		c1.putIfAbsent(2, sc1c1s2);

		StudentData sc1c1s3 = new StudentData();
		sc1c1s3.name = "FirstClasscccccc";
		c1.putIfAbsent(3, sc1c1s3);

		StudentData sc1c1s4 = new StudentData();
		sc1c1s4.name = "FirstClassddddd";
		c1.putIfAbsent(4, sc1c1s4);

		Map<String, Map<Integer, StudentData>> sc1 = new HashMap<String, Map<Integer, StudentData>>();//HashMap to handle classes(HashMap of school)

		sc1.put("FirstStandard", c1);//putting(relating) HashMap c1(first class student details) in HashMap sc1(school hashMap)

		Map<Integer, StudentData> c2 = new HashMap();//HashMap to handle second class
		//sc1c2s1,sc1c2s2,sc1c2s3,sc1c2s4 are object representing each student of Second class
		StudentData sc1c2s1 = new StudentData();
		sc1c2s1.name = "SecondClassaaaa";
		c2.putIfAbsent(01, sc1c2s1);

		StudentData sc1c2s2 = new StudentData();
		sc1c2s2.name = "SecondClassbbbbb";
		c2.putIfAbsent(02, sc1c2s2);

		StudentData sc1c2s3 = new StudentData();
		sc1c2s3.name = "SecondClassccccc";
		c2.putIfAbsent(03, sc1c2s3);

		StudentData sc1c2s4 = new StudentData();
		sc1c2s4.name = "SecondClassddddd";
		c2.putIfAbsent(04, sc1c2s4);

		sc1.putIfAbsent("SecondStandard", c2); //putting(relating) HashMap c2(second class student details) in HashMap sc1(HashMap of school)

		/*
		for (String classname : m.keySet()) {
			//if (classname.equals("SecondStandard")) {
				Map<Integer, StudentData> grs = m.get(classname);

				for (Integer i : grs.keySet()) {
					//if (i == 2) {

						StudentData gs = grs.get(i);
						System.out.println(
								"Standard " + classname + " StudentData roll no " + i + " And name is " + gs.name);
					//}

				}
			//}

		}
		*/
		
		
		Map<String, Map<String, Map<Integer, StudentData>>> d1 = new HashMap<String, Map<String, Map<Integer, StudentData>>>();//district HashMap
		d1.putIfAbsent("School1", sc1);
		
		Map<String, Map<String, Map<String, Map<Integer, StudentData>>>> st1 = new HashMap<String, Map<String, Map<String, Map<Integer, StudentData>>>>();//State HashMap
		st1.putIfAbsent("District1", d1);
		
		Map<String, Map<String, Map<String, Map<String, Map<Integer, StudentData>>>>> co = new HashMap<String, Map<String, Map<String, Map<String, Map<Integer, StudentData>>>>>();//Country HashMap
		co.putIfAbsent("State1", st1);
		
		
		for(String stateName : co.keySet()) {
			
			Map<String, Map<String, Map<String, Map<Integer, StudentData>>>> codata = co.get(stateName);
			
			for(String districtName : st1.keySet()) {
				
				Map<String, Map<String, Map<Integer, StudentData>>> d1data = st1.get(districtName);
				
				for(String schoolName : d1.keySet()) {
					
					Map<String, Map<Integer, StudentData>> sc1data = d1.get(schoolName);
					
					for(String className : sc1.keySet()) {
						
						Map<Integer, StudentData> c1data = sc1.get(className);
						for (Integer i : c1data.keySet()) {
							

								StudentData data = c1data.get(i);
								System.out.println(
										"State:" + stateName + " District:" + districtName + " School:" + schoolName + 
										" Class:" + className + " Student Roll.no:" + i +" Name:" + data.name );
							

						}
						
					}
					
				}
			}
			
		}
		
	}

}
