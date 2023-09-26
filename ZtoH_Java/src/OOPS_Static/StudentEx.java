package OOPS_Static;

/*
public class StudentEx {
	
	 String studentName; 
	 String course; 
	 String school;
	 public static void main(String[] args) {
		
		StudentEx Student1 = new StudentEx();
		StudentEx Student2 = new StudentEx();
        
        Student1.studentName = "Ihechikara";
        Student1.course = "Data Visualization";
        Student1.school = "freeCodeCamp";
        
        Student2.studentName = "John";
        Student2.course = "Data Analysis with Python";
        Student2.school = "freeCodeCamp";
        
        System.out.println(Student1.studentName + " " + Student1.course + " " + Student1.school + "\n");
        // Ihechikara Data Visualization freeCodeCamp
        System.out.println(Student2.studentName + " " + Student2.course + " " + Student2.school);
        // John Data Analysis with Python freeCodeCamp

	}

}
*/

/*
class StudentEx {
    String studentName; 
    String course; 
    String school;
        
    public static void main(String[] args) {
    	StudentEx o = new StudentEx();
    	o.method();
    }
    
    void method() {
    	StudentEx Student1 = new StudentEx();
    	StudentEx Student2 = new StudentEx();
        
        
        Student1.studentName = "Ihechikara";
        Student1.course = "Data Visualization";
        Student1.school = "freeCodeCamp";
        
        
        Student2.studentName = "John";
        Student2.course = "Data Analysis with Python";
        
        System.out.println(Student1.studentName + " " + Student1.course + " " + Student1.school + "\n");
        // Ihechikara Data Visualization freeCodeCamp
        System.out.println(Student2.studentName + " " + Student2.course + " " + Student2.school);
        // John Data Analysis with Python null
    }
}
*/


//In previous codes the output for second student school name when not specified explicitly is null, but in the below code since static variable is shared among all class instances(it is stored seperately
class StudentEx {
    String studentName; 
    String course; 
    static String school;
        
    public static void main(String[] args) {
    	StudentEx Student1 = new StudentEx();
    	StudentEx Student2 = new StudentEx();
         
        Student1.studentName = "Ihechikara";
        Student1.course = "Data Visualization";
        Student1.school = "freeCodeCamp";
        
        
        Student2.studentName = "John";
        Student2.course = "Data Analysis with Python";
        
        System.out.println(Student1.studentName + " " + Student1.course + " " + Student1.school + "\n");
        // Ihechikara Data Visualization freeCodeCamp
        System.out.println(Student2.studentName + " " + Student2.course + " " + Student2.school);
        // John Data Analysis with Python freeCodeCamp
    }
}






