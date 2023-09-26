package OOPS_Static;

public class DataMemebersSpeed {
	
	static long startTime;
	static long elapsedTime;

	static String mStatic;
	private String mPublic;

	public static void main(String[] args) {
		
		DataMemebersSpeed q = new DataMemebersSpeed();
		    q.executeGlobal();
		    q.executeStatic();
		    q.executeLocal();

	}
	
	
	public void executeLocal() {
	    String mLocal;
	    startTime = System.nanoTime();
	    for (int i = 0; i < 1000000000; i++) {
	        mLocal = "";
	    }
	    elapsedTime = System.nanoTime() - startTime;
	    System.out.println("Type Local: " + elapsedTime + " ns");

	}

	public void executeGlobal() {
	    startTime = System.nanoTime();
	    for (int i = 0; i < 1000000000; i++) {
	        mPublic = "";
	    }
	    elapsedTime = System.nanoTime() - startTime;
	    System.out.println("Type Global: " + elapsedTime + " ns");

	}

	public void executeStatic() {
	    startTime = System.nanoTime();
	    for (int i = 0; i < 1000000000; i++) {
	        mStatic = "";
	    }
	    elapsedTime = System.nanoTime() - startTime;
	    System.out.println("Type Static: " + elapsedTime + " ns");
	}

}
