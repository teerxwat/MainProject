package LAB_Week_3;

import java.util.Random;

public class MyClassicalMyArray {
	
	//---| Properties
	public int[] MyArray = new int[10];
	public Random rd = new Random(); 

    //---| Method 
	public void getRandom() {
		System.out.print( "Random Number :: " );
	    for ( int i = 0 ; i < MyArray.length ; i++ ) {
	    	MyArray[i] = rd.nextInt(99); 
	    	if( i < 9 ) {
	    		System.out.print( MyArray[i] + ",  " );
	    	}/*end if */else {
	    		System.out.print( MyArray[i] + "\n" );
	    	} //end else
	    } //end for
	} //end method
	
	public void FindMax() {
		int tempMax = 0;
		for ( int i = 0 ; i < MyArray.length ; i++ ) {
			 if( MyArray[i] > tempMax) {
				 tempMax = MyArray[i];
			 } // end if
		} // end for
		System.out.println( "Max Value     :: " + tempMax );
	} // end method
	
	public void FindMin() {
		int tempMin = 99;
		for ( int i = 0 ; i < MyArray.length ; i++ ) {
			 if( MyArray[i] < tempMin) {
				 tempMin = MyArray[i];
			 } // end if
		} // end for
		System.out.println( "Min Value     :: " + tempMin );
	} // end method
} //end class
