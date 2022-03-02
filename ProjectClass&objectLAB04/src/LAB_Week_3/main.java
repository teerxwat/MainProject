package LAB_Week_3;

import java.io.IOException;

public class main {
	
	public static void main(String[] args) throws IOException {
		MyClassicalMyArray MyClassi = new MyClassicalMyArray();
		MyCurrentArray MyCurrent = new MyCurrentArray();
		MyClassi.getRandom();
		MyClassi.FindMax();
		MyClassi.FindMin();
		MyCurrent.Sort( MyClassi.MyArray );
		MyCurrent.Search( MyClassi.MyArray );
		//MyCurrent.sortTest( MyClassi.MyArray );
	} //end method
}//end class 
