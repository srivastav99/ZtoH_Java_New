package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapStudentPro {

	public static void main(String[] args) {

		// School 1 (district 1 of state 1 of country)
		Map<Integer, StudentData> st1d1sc1c1 = new HashMap(); // HashMap to handle first class

		StudentData sc1c1s1 = new StudentData();
		sc1c1s1.name = "Rohit"; // Giving name for a student of First class
		st1d1sc1c1.putIfAbsent(1, sc1c1s1); // Storing student name with roll.no as 1 into the HashMap m.

		StudentData sc1c1s2 = new StudentData();
		sc1c1s2.name = "Kohli";
		st1d1sc1c1.putIfAbsent(2, sc1c1s2);

		StudentData sc1c1s3 = new StudentData();
		sc1c1s3.name = "Shreyas";
		st1d1sc1c1.putIfAbsent(3, sc1c1s3);

		StudentData sc1c1s4 = new StudentData();
		sc1c1s4.name = "Surya";
		st1d1sc1c1.putIfAbsent(4, sc1c1s4);

		Map<String, Map<Integer, StudentData>> st1d1sc1 = new HashMap<String, Map<Integer, StudentData>>();// HashMap to
																											// handle
																											// classes(of
																											// a school)

		st1d1sc1.put("FirstStandard", st1d1sc1c1);// putting(relating) HashMap mfc(first class student details) in
													// HashMap m

		Map<Integer, StudentData> st1d1sc1c2 = new HashMap();// HashMap to handle second class
		// ss1,ss2,ss3,ss4 are object representing each student of Second class
		StudentData sc1c2s1 = new StudentData();
		sc1c2s1.name = "Rinku";
		st1d1sc1c2.putIfAbsent(5, sc1c2s1);

		StudentData sc1c2s2 = new StudentData();
		sc1c2s2.name = "Gill";
		st1d1sc1c2.putIfAbsent(6, sc1c2s2);

		StudentData sc1c2s3 = new StudentData();
		sc1c2s3.name = "Ruturaj";
		st1d1sc1c2.putIfAbsent(7, sc1c2s3);

		StudentData sc1c2s4 = new StudentData();
		sc1c2s4.name = "Shaw";
		st1d1sc1c2.putIfAbsent(8, sc1c2s4);

		st1d1sc1.putIfAbsent("SecondStandard", st1d1sc1c2); // putting(relating) HashMap msc(second class student
															// details) in
		// HashMap m

		Map<String, Map<String, Map<Integer, StudentData>>> st1d1 = new HashMap<String, Map<String, Map<Integer, StudentData>>>();// district
																																	// HashMap
		st1d1.putIfAbsent("Indian Batting school", st1d1sc1);

		// School 2( district 1 of state 1 of country)

		Map<Integer, StudentData> st1d1sc2c1 = new HashMap(); // HashMap to handle first class

		StudentData sc2c1s1 = new StudentData();
		sc2c1s1.name = "Chahal"; // Giving name for a student of First class
		st1d1sc2c1.putIfAbsent(9, sc2c1s1); // Storing student name with roll.no as 1 into the HashMap m.

		StudentData sc2c1s2 = new StudentData();
		sc2c1s2.name = "Kuldeep";
		st1d1sc2c1.putIfAbsent(10, sc2c1s2);

		StudentData sc2c1s3 = new StudentData();
		sc2c1s3.name = "Bishnoi";
		st1d1sc2c1.putIfAbsent(11, sc2c1s3);

		StudentData sc2c1s4 = new StudentData();
		sc2c1s4.name = "Varun";
		st1d1sc2c1.putIfAbsent(12, sc2c1s4);

		Map<String, Map<Integer, StudentData>> st1d1sc2 = new HashMap<String, Map<Integer, StudentData>>();// HashMap to
																											// handle
																											// classes(of
																											// a school)

		st1d1sc2.put("FirstStandard", st1d1sc2c1);// putting(relating) HashMap mfc(first class student details) in
													// HashMap m

		Map<Integer, StudentData> st1d1sc2c2 = new HashMap();// HashMap to handle second class
		// ss1,ss2,ss3,ss4 are object representing each student of Second class
		StudentData sc2c2s1 = new StudentData();
		sc2c2s1.name = "Bumrah";
		st1d1sc2c2.putIfAbsent(13, sc2c2s1);

		StudentData sc2c2s2 = new StudentData();
		sc2c2s2.name = "Bhuvi";
		st1d1sc2c2.putIfAbsent(14, sc2c2s2);

		StudentData sc2c2s3 = new StudentData();
		sc2c2s3.name = "Shami";
		st1d1sc2c2.putIfAbsent(15, sc2c2s3);

		StudentData sc2c2s4 = new StudentData();
		sc2c2s4.name = "Siraj";
		st1d1sc2c2.putIfAbsent(16, sc2c2s4);

		st1d1sc2.putIfAbsent("SecondStandard", st1d1sc2c2); // putting(relating) HashMap msc(second class student
															// details) in HashMap m

		st1d1.putIfAbsent("Indian Bowling school", st1d1sc2);

		Map<String, Map<String, Map<String, Map<Integer, StudentData>>>> st1 = new HashMap<String, Map<String, Map<String, Map<Integer, StudentData>>>>();
		st1.putIfAbsent("Medchal", st1d1);

		// School 3( district 2 of state 1 of country)

		Map<Integer, StudentData> st1d2sc3c1 = new HashMap(); // HashMap to handle first class

		StudentData sc3c1s1 = new StudentData();
		sc3c1s1.name = "Jadeja"; // Giving name for a student of First class
		st1d2sc3c1.putIfAbsent(17, sc3c1s1); // Storing student name with roll.no as 1 into the HashMap m.

		StudentData sc3c1s2 = new StudentData();
		sc3c1s2.name = "Ashwin";
		st1d2sc3c1.putIfAbsent(18, sc3c1s2);

		StudentData sc3c1s3 = new StudentData();
		sc3c1s3.name = "Axar";
		st1d2sc3c1.putIfAbsent(19, sc3c1s3);

		StudentData sc3c1s4 = new StudentData();
		sc3c1s4.name = "Krunal";
		st1d2sc3c1.putIfAbsent(20, sc3c1s4);

		Map<String, Map<Integer, StudentData>> st1d2sc3 = new HashMap<String, Map<Integer, StudentData>>();// HashMap to
																											// handle
																											// classes(of
																											// a school)

		st1d2sc3.put("FirstStandard", st1d2sc3c1);// putting(relating) HashMap mfc(first class student details) in
													// HashMap m

		Map<Integer, StudentData> st1d2sc3c2 = new HashMap();// HashMap to handle second class
		// ss1,ss2,ss3,ss4 are object representing each student of Second class
		StudentData sc3c2s1 = new StudentData();
		sc3c2s1.name = "Hardik";
		st1d2sc3c2.putIfAbsent(21, sc3c2s1);

		StudentData sc3c2s2 = new StudentData();
		sc3c2s2.name = "Vijay";
		st1d2sc3c2.putIfAbsent(22, sc3c2s2);

		StudentData sc3c2s3 = new StudentData();
		sc3c2s3.name = "Shardul";
		st1d2sc3c2.putIfAbsent(23, sc3c2s3);

		StudentData sc3c2s4 = new StudentData();
		sc3c2s4.name = "Chahar";
		st1d2sc3c2.putIfAbsent(24, sc3c2s4);

		st1d2sc3.putIfAbsent("SecondStandard", st1d2sc3c2); // putting(relating) HashMap msc(second class student
															// details) in HashMap m

		Map<String, Map<String, Map<Integer, StudentData>>> st1d2 = new HashMap<String, Map<String, Map<Integer, StudentData>>>();// district
																																	// HashMap
		st1d2.putIfAbsent("Indian All rounders school", st1d2sc3);

		// School 4( district 2 of state 1 of country)

		Map<Integer, StudentData> st1d2sc4c1 = new HashMap(); // HashMap to handle first class

		StudentData sc4c1s1 = new StudentData();
		sc4c1s1.name = "Pant"; // Giving name for a student of First class
		st1d2sc4c1.putIfAbsent(25, sc4c1s1); // Storing student name with roll.no as 1 into the HashMap m.

		StudentData sc4c1s2 = new StudentData();
		sc4c1s2.name = "Rahul";
		st1d2sc4c1.putIfAbsent(26, sc4c1s2);

		StudentData sc4c1s3 = new StudentData();
		sc4c1s3.name = "Sanju";
		st1d2sc4c1.putIfAbsent(27, sc4c1s3);

		StudentData sc4c1s4 = new StudentData();
		sc4c1s4.name = "Ishan";
		st1d2sc4c1.putIfAbsent(28, sc4c1s4);

		Map<String, Map<Integer, StudentData>> st1d2sc4 = new HashMap<String, Map<Integer, StudentData>>();// HashMap to
																											// handle
																											// classes(of
																											// a school)

		st1d2sc4.put("FirstStandard", st1d2sc4c1);// putting(relating) HashMap mfc(first class student details) in
													// HashMap m

		Map<Integer, StudentData> st1d2sc4c2 = new HashMap();// HashMap to handle second class
		// ss1,ss2,ss3,ss4 are object representing each student of Second class
		StudentData sc4c2s1 = new StudentData();
		sc4c2s1.name = "Bharat";
		st1d2sc4c2.putIfAbsent(29, sc4c2s1);

		StudentData sc4c2s2 = new StudentData();
		sc4c2s2.name = "Saha";
		st1d2sc4c2.putIfAbsent(30, sc4c2s2);

		StudentData sc4c2s3 = new StudentData();
		sc4c2s3.name = "Jitesh";
		st1d2sc4c2.putIfAbsent(31, sc4c2s3);

		StudentData sc4c2s4 = new StudentData();
		sc4c2s4.name = "Jagdeeshan";
		st1d2sc4c2.putIfAbsent(32, sc4c2s4);

		st1d2sc4.putIfAbsent("SecondStandard", st1d2sc4c2); // putting(relating) HashMap msc(second class student
															// details) in HashMap m

		st1d2.putIfAbsent("Indian WK school", st1d2sc4);

		st1.putIfAbsent("Medak", st1d2);

		Map<String, Map<String, Map<String, Map<String, Map<Integer, StudentData>>>>> co = new HashMap<String, Map<String, Map<String, Map<String, Map<Integer, StudentData>>>>>();// Country
																																													// HashMap
		co.putIfAbsent("TS", st1);

		// School 5 (district 1 of state 2 of country)
		Map<Integer, StudentData> st2d1sc5c1 = new HashMap(); // HashMap to handle first class

		StudentData sc5c1s1 = new StudentData();
		sc5c1s1.name = "Warner"; // Giving name for a student of First class
		st2d1sc5c1.putIfAbsent(33, sc5c1s1); // Storing student name with roll.no as 1 into the HashMap m.

		StudentData sc5c1s2 = new StudentData();
		sc5c1s2.name = "Smith";
		st2d1sc5c1.putIfAbsent(34, sc5c1s2);

		StudentData sc5c1s3 = new StudentData();
		sc5c1s3.name = "Williamson";
		st2d1sc5c1.putIfAbsent(35, sc5c1s3);

		StudentData sc5c1s4 = new StudentData();
		sc5c1s4.name = "Root";
		st2d1sc5c1.putIfAbsent(36, sc5c1s4);

		Map<String, Map<Integer, StudentData>> st2d1sc5 = new HashMap<String, Map<Integer, StudentData>>();// HashMap to
																											// handle
																											// classes(of
																											// a school)

		st2d1sc5.put("FirstStandard", st2d1sc5c1);// putting(relating) HashMap mfc(first class student details) in
													// HashMap m

		Map<Integer, StudentData> st2d1sc5c2 = new HashMap();// HashMap to handle second class
		// ss1,ss2,ss3,ss4 are object representing each student of Second class
		StudentData sc5c2s1 = new StudentData();
		sc5c2s1.name = "Malan";
		st2d1sc5c2.putIfAbsent(37, sc5c2s1);

		StudentData sc5c2s2 = new StudentData();
		sc5c2s2.name = "Hales";
		st2d1sc5c2.putIfAbsent(38, sc5c2s2);

		StudentData sc5c2s3 = new StudentData();
		sc5c2s3.name = "Brook";
		st2d1sc5c2.putIfAbsent(39, sc5c2s3);

		StudentData sc5c2s4 = new StudentData();
		sc5c2s4.name = "Miller";
		st2d1sc5c2.putIfAbsent(40, sc5c2s4);

		st2d1sc5.putIfAbsent("SecondStandard", st2d1sc5c2); // putting(relating) HashMap msc(second class student
															// details) in HashMap m

		Map<String, Map<String, Map<Integer, StudentData>>> st2d1 = new HashMap<String, Map<String, Map<Integer, StudentData>>>();// district
																																	// HashMap
		st2d1.putIfAbsent("Foreign Batting school", st2d1sc5);

		// School 6( district 1 of state 2 of country)

		Map<Integer, StudentData> st2d1sc6c1 = new HashMap(); // HashMap to handle first class

		StudentData sc6c1s1 = new StudentData();
		sc6c1s1.name = "Stark"; // Giving name for a student of First class
		st2d1sc6c1.putIfAbsent(41, sc6c1s1); // Storing student name with roll.no as 1 into the HashMap m.

		StudentData sc6c1s2 = new StudentData();
		sc6c1s2.name = "Wood";
		st2d1sc6c1.putIfAbsent(42, sc6c1s2);

		StudentData sc6c1s3 = new StudentData();
		sc6c1s3.name = "Cummins";
		st2d1sc6c1.putIfAbsent(43, sc6c1s3);

		StudentData sc6c1s4 = new StudentData();
		sc6c1s4.name = "Rabada";
		st2d1sc6c1.putIfAbsent(44, sc6c1s4);

		Map<String, Map<Integer, StudentData>> st2d1sc6 = new HashMap<String, Map<Integer, StudentData>>();// HashMap to
																											// handle
																											// classes(of
																											// a school)

		st2d1sc6.put("FirstStandard", st2d1sc6c1);// putting(relating) HashMap mfc(first class student details) in
													// HashMap m

		Map<Integer, StudentData> st2d1sc6c2 = new HashMap();// HashMap to handle second class
		// ss1,ss2,ss3,ss4 are object representing each student of Second class
		StudentData sc6c2s1 = new StudentData();
		sc6c2s1.name = "Zampa";
		st2d1sc6c2.putIfAbsent(45, sc6c2s1);

		StudentData sc6c2s2 = new StudentData();
		sc6c2s2.name = "Lyon";
		st2d1sc6c2.putIfAbsent(46, sc6c2s2);

		StudentData sc6c2s3 = new StudentData();
		sc6c2s3.name = "Shamsi";
		st2d1sc6c2.putIfAbsent(47, sc6c2s3);

		StudentData sc6c2s4 = new StudentData();
		sc6c2s4.name = "Rashid";
		st2d1sc6c2.putIfAbsent(48, sc6c2s4);

		st2d1sc6.putIfAbsent("SecondStandard", st2d1sc6c2); // putting(relating) HashMap msc(second class student
															// details) in HashMap m

		st2d1.putIfAbsent("Foreign Bowling school", st2d1sc6);

		Map<String, Map<String, Map<String, Map<Integer, StudentData>>>> st2 = new HashMap<String, Map<String, Map<String, Map<Integer, StudentData>>>>();

		st2.put("Visakhapatnam", st2d1);

		// School 7( district 2 of state 2 of country)

		Map<Integer, StudentData> st2d2sc7c1 = new HashMap(); // HashMap to handle first class

		StudentData sc7c1s1 = new StudentData();
		sc7c1s1.name = "Maxwell"; // Giving name for a student of First class
		st2d2sc7c1.putIfAbsent(49, sc7c1s1); // Storing student name with roll.no as 1 into the HashMap m.

		StudentData sc7c1s2 = new StudentData();
		sc7c1s2.name = "Rashid Khan";
		st2d2sc7c1.putIfAbsent(50, sc7c1s2);

		StudentData sc7c1s3 = new StudentData();
		sc7c1s3.name = "Shakib";
		st2d2sc7c1.putIfAbsent(51, sc7c1s3);

		StudentData sc7c1s4 = new StudentData();
		sc7c1s4.name = "Hasaranga";
		st2d2sc7c1.putIfAbsent(52, sc7c1s4);

		Map<String, Map<Integer, StudentData>> st2d2sc7 = new HashMap<String, Map<Integer, StudentData>>();// HashMap to
																											// handle
																											// classes(of
																											// a school)

		st2d2sc7.put("FirstStandard", st2d2sc7c1);// putting(relating) HashMap mfc(first class student details) in
													// HashMap m

		Map<Integer, StudentData> st2d2sc7c2 = new HashMap();// HashMap to handle second class
		// ss1,ss2,ss3,ss4 are object representing each student of Second class
		StudentData sc7c2s1 = new StudentData();
		sc7c2s1.name = "Stoinis";
		st2d2sc7c2.putIfAbsent(53, sc7c2s1);

		StudentData sc7c2s2 = new StudentData();
		sc7c2s2.name = "Marsh";
		st2d2sc7c2.putIfAbsent(54, sc7c2s2);

		StudentData sc7c2s3 = new StudentData();
		sc7c2s3.name = "Woakes";
		st2d2sc7c2.putIfAbsent(55, sc7c2s3);

		StudentData sc7c2s4 = new StudentData();
		sc7c2s4.name = "Sam";
		st2d2sc7c2.putIfAbsent(56, sc7c2s4);

		st2d2sc7.putIfAbsent("SecondStandard", st2d2sc7c2); // putting(relating) HashMap msc(second class student
															// details) in HashMap m

		Map<String, Map<String, Map<Integer, StudentData>>> st2d2 = new HashMap<String, Map<String, Map<Integer, StudentData>>>();// district
																																	// HashMap

		st2d2.putIfAbsent("Foreign All Rounders school", st2d2sc7);

		// School 8( district 2 of state 2 of country)

		Map<Integer, StudentData> st2d2sc8c1 = new HashMap(); // HashMap to handle first class

		StudentData sc8c1s1 = new StudentData();
		sc8c1s1.name = "Conway"; // Giving name for a student of First class
		st2d2sc8c1.putIfAbsent(57, sc8c1s1); // Storing student name with roll.no as 1 into the HashMap m.

		StudentData sc8c1s2 = new StudentData();
		sc8c1s2.name = "Bairstow";
		st2d2sc8c1.putIfAbsent(58, sc8c1s2);

		StudentData sc8c1s3 = new StudentData();
		sc8c1s3.name = "Head";
		st2d2sc8c1.putIfAbsent(59, sc8c1s3);

		StudentData sc8c1s4 = new StudentData();
		sc8c1s4.name = "Klassen";
		st2d2sc8c1.putIfAbsent(60, sc8c1s4);

		Map<String, Map<Integer, StudentData>> st2d2sc8 = new HashMap<String, Map<Integer, StudentData>>();// HashMap to
																											// handle
																											// classes(of
																											// a school)

		st2d2sc8.put("FirstStandard", st2d2sc8c1);// putting(relating) HashMap mfc(first class student details) in
													// HashMap m

		Map<Integer, StudentData> st2d2sc8c2 = new HashMap();// HashMap to handle second class
		// ss1,ss2,ss3,ss4 are object representing each student of Second class
		StudentData sc8c2s1 = new StudentData();
		sc8c2s1.name = "Carey";
		st2d2sc8c2.putIfAbsent(61, sc8c2s1);

		StudentData sc8c2s2 = new StudentData();
		sc8c2s2.name = "Latham";
		st2d2sc8c2.putIfAbsent(62, sc8c2s2);

		StudentData sc8c2s3 = new StudentData();
		sc8c2s3.name = "Butler";
		st2d2sc8c2.putIfAbsent(63, sc8c2s3);

		StudentData sc8c2s4 = new StudentData();
		sc8c2s4.name = "Quinton";
		st2d2sc8c2.putIfAbsent(64, sc8c2s4);

		st2d2sc8.putIfAbsent("SecondStandard", st2d2sc8c2); // putting(relating) HashMap msc(second class student
															// details) in HashMap m

		st2d2.putIfAbsent("Foreign WK school", st2d2sc8);

		st2.put("Prakasam", st2d2);

		co.putIfAbsent("AP", st2);

		StudentCountry coName = new StudentCountry();
		coName.CountryName = "India";

		for (String stateName : co.keySet()) { // country

			if (stateName == "TS") { // state 1
				Map<String, Map<String, Map<String, Map<Integer, StudentData>>>> codata = co.get(stateName);

				for (String districtName : st1.keySet()) {

					if (districtName == "Medchal") { // district 1
						Map<String, Map<String, Map<Integer, StudentData>>> d1data = st1.get(districtName);

						for (String schoolName : st1d1.keySet()) {
							if (schoolName == "Indian Batting school") { // school1

								Map<String, Map<Integer, StudentData>> sc1data = st1d1.get(schoolName);

								for (String className : st1d1sc1.keySet()) {
									if (className == "FirstStandard") { // class 1
										Map<Integer, StudentData> c1data = st1d1sc1.get(className);
										for (Integer i : c1data.keySet()) {

											StudentData data = c1data.get(i);
											System.out.println("State:" + stateName + " District:" + districtName
													+ " School:" + schoolName + " Class:" + className
													+ " Student Roll.no:" + i + " Name:" + data.name);

										}
									}
									if (className == "SecondStandard") { // class 2
										Map<Integer, StudentData> c2data = st1d1sc1.get(className);
										for (Integer i : c2data.keySet()) {

											StudentData data = c2data.get(i);
											System.out.println("State:" + stateName + " District:" + districtName
													+ " School:" + schoolName + " Class:" + className
													+ " Student Roll.no:" + i + " Name:" + data.name);

										}
									}

								}

							}

							if (schoolName == "Indian Bowling school") {// school 2

								Map<String, Map<Integer, StudentData>> sc2data = st1d1.get(schoolName);

								for (String className : st1d1sc2.keySet()) {
									if (className == "FirstStandard") {// class 1
										Map<Integer, StudentData> c1data = st1d1sc2.get(className);
										for (Integer i : c1data.keySet()) {

											StudentData data = c1data.get(i);
											System.out.println("State:" + stateName + " District:" + districtName
													+ " School:" + schoolName + " Class:" + className
													+ " Student Roll.no:" + i + " Name:" + data.name);

										}
									}
									if (className == "SecondStandard") {// class 2
										Map<Integer, StudentData> c2data = st1d1sc2.get(className);
										for (Integer i : c2data.keySet()) {

											StudentData data = c2data.get(i);
											System.out.println("State:" + stateName + " District:" + districtName
													+ " School:" + schoolName + " Class:" + className
													+ " Student Roll.no:" + i + " Name:" + data.name);

										}
									}

								}

							}
						}
					}

					if (districtName == "Medak") { // district 2

						Map<String, Map<String, Map<Integer, StudentData>>> d2data = st1.get(districtName);

						for (String schoolName : st1d2.keySet()) {
							if (schoolName == "Indian All rounders school") {// school 3
								Map<String, Map<Integer, StudentData>> sc3data = st1d2.get(schoolName);

								for (String className : st1d2sc3.keySet()) {
									if (className == "FirstStandard") {// class 1
										Map<Integer, StudentData> c1data = st1d2sc3.get(className);
										for (Integer i : c1data.keySet()) {

											StudentData data = c1data.get(i);
											System.out.println("State:" + stateName + " District:" + districtName
													+ " School:" + schoolName + " Class:" + className
													+ " Student Roll.no:" + i + " Name:" + data.name);

										}
									}
									if (className == "SecondStandard") {// class 2
										Map<Integer, StudentData> c2data = st1d2sc3.get(className);
										for (Integer i : c2data.keySet()) {

											StudentData data = c2data.get(i);
											System.out.println("State:" + stateName + " District:" + districtName
													+ " School:" + schoolName + " Class:" + className
													+ " Student Roll.no:" + i + " Name:" + data.name);

										}
									}
								}

							}
							if (schoolName == "Indian WK school") {// school 4
								Map<String, Map<Integer, StudentData>> sc1data = st1d2.get(schoolName);

								for (String className : st1d2sc4.keySet()) {
									if (className == "FirstStandard") { // class 1
										Map<Integer, StudentData> c1data = st1d2sc4.get(className);
										for (Integer i : c1data.keySet()) {

											StudentData data = c1data.get(i);
											System.out.println("State:" + stateName + " District:" + districtName
													+ " School:" + schoolName + " Class:" + className
													+ " Student Roll.no:" + i + " Name:" + data.name);

										}
									}
									if (className == "SecondStandard") { // class 2
										Map<Integer, StudentData> c2data = st1d2sc4.get(className);
										for (Integer i : c2data.keySet()) {

											StudentData data = c2data.get(i);
											System.out.println("State:" + stateName + " District:" + districtName
													+ " School:" + schoolName + " Class:" + className
													+ " Student Roll.no:" + i + " Name:" + data.name);

										}
									}
								}

							}
						}

					}

				}

			}

			if (stateName == "AP") { // state 2
				Map<String, Map<String, Map<String, Map<Integer, StudentData>>>> codata = co.get(stateName);

				for (String districtName : st2.keySet()) {

					if (districtName == "Visakhapatnam") { // district 1
						Map<String, Map<String, Map<Integer, StudentData>>> d1data = st2.get(districtName);

						for (String schoolName : st2d1.keySet()) {
							if (schoolName == "Foreign Batting school") { // school 5
								Map<String, Map<Integer, StudentData>> sc5data = st2d1.get(schoolName);

								for (String className : st2d1sc5.keySet()) {
									if (className == "FirstStandard") { // class 1
										Map<Integer, StudentData> c1data = st2d1sc5.get(className);
										for (Integer i : c1data.keySet()) {

											StudentData data = c1data.get(i);
											System.out.println("State:" + stateName + " District:" + districtName
													+ " School:" + schoolName + " Class:" + className
													+ " Student Roll.no:" + i + " Name:" + data.name);

										}
									}
									if (className == "SecondStandard") { // class 2
										Map<Integer, StudentData> c2data = st2d1sc5.get(className);
										for (Integer i : c2data.keySet()) {

											StudentData data = c2data.get(i);
											System.out.println("State:" + stateName + " District:" + districtName
													+ " School:" + schoolName + " Class:" + className
													+ " Student Roll.no:" + i + " Name:" + data.name);

										}
									}
								}
							}
							if (schoolName == "Foreign Bowling school") { // school 6
								Map<String, Map<Integer, StudentData>> sc6data = st2d1.get(schoolName);
								for (String className : st2d1sc6.keySet()) {
									if (className == "FirstStandard") { // class 1
										Map<Integer, StudentData> c1data = st2d1sc6.get(className);
										for (Integer i : c1data.keySet()) {

											StudentData data = c1data.get(i);
											System.out.println("State:" + stateName + " District:" + districtName
													+ " School:" + schoolName + " Class:" + className
													+ " Student Roll.no:" + i + " Name:" + data.name);

										}
									}
									if (className == "SecondStandard") { // class 2
										Map<Integer, StudentData> c2data = st2d1sc6.get(className);
										for (Integer i : c2data.keySet()) {

											StudentData data = c2data.get(i);
											System.out.println("State:" + stateName + " District:" + districtName
													+ " School:" + schoolName + " Class:" + className
													+ " Student Roll.no:" + i + " Name:" + data.name);

										}
									}
								}
							}
						}
					}
					if (districtName == "Prakasam") { // district 2

						Map<String, Map<String, Map<Integer, StudentData>>> d1data = st1.get(districtName);

						for (String schoolName : st2d2.keySet()) {
							if (schoolName == "Foreign All Rounders school") { // school 7
								Map<String, Map<Integer, StudentData>> sc7data = st2d2.get(schoolName);

								for (String className : st2d2sc7.keySet()) {
									if (className == "FirstStandard") { // class 1
										Map<Integer, StudentData> c1data = st2d2sc7.get(className);
										for (Integer i : c1data.keySet()) {

											StudentData data = c1data.get(i);
											System.out.println("State:" + stateName + " District:" + districtName
													+ " School:" + schoolName + " Class:" + className
													+ " Student Roll.no:" + i + " Name:" + data.name);

										}
									}
									if (className == "SecondStandard") { // class 2
										Map<Integer, StudentData> c2data = st2d2sc7.get(className);
										for (Integer i : c2data.keySet()) {

											StudentData data = c2data.get(i);
											System.out.println("State:" + stateName + " District:" + districtName
													+ " School:" + schoolName + " Class:" + className
													+ " Student Roll.no:" + i + " Name:" + data.name);

										}
									}
								}
							}
							if (schoolName == "Foreign WK school") { // school 8
								Map<String, Map<Integer, StudentData>> sc8data = st2d2.get(schoolName);
								for (String className : st2d2sc8.keySet()) {
									if (className == "FirstStandard") { //class 1
										Map<Integer, StudentData> c1data = st2d2sc8.get(className);
										for (Integer i : c1data.keySet()) {

											StudentData data = c1data.get(i);
											System.out.println("State:" + stateName + " District:" + districtName
													+ " School:" + schoolName + " Class:" + className
													+ " Student Roll.no:" + i + " Name:" + data.name);

										}
									}
									if (className == "SecondStandard") { //class 2
										Map<Integer, StudentData> c2data = st2d2sc8.get(className);
										for (Integer i : c2data.keySet()) {

											StudentData data = c2data.get(i);
											System.out.println("State:" + stateName + " District:" + districtName
													+ " School:" + schoolName + " Class:" + className
													+ " Student Roll.no:" + i + " Name:" + data.name);

										}
									}
								}
							}
						}

					}
				}

			}

		}

	}

}
