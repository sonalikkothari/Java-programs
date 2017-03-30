package General;

public class ExplicitGarbCollect {

	int num ;
	
	public  ExplicitGarbCollect(int num) {
		this.num = num;
	}
	
	 @Override
	    protected void finalize() throws Throwable
	    {
	        System.out.println("From Finalize Method, num=" +num);
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExplicitGarbCollect explGC1 = new ExplicitGarbCollect(4);
		ExplicitGarbCollect explGC2 = new ExplicitGarbCollect(20);
		
		explGC2 = explGC1 ;
		
		System.gc();
		
		System.out.println("Explicit garbage collector operation is done::");
	}

}
