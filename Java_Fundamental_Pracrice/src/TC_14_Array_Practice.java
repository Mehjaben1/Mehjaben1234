
public class TC_14_Array_Practice {

	public static void main(String[] args) {
		
		/*
		// declaration of multiple string variables
		String sMake1, sMake2, sMake3, sMake4, sMake5, sMake6, sMake7, sMake8, sMake9,sMake10;
		
		sMake1 = "Toyota";
	
		sMake2 = "Honda";
		  
		  sMake3 = "Mercedes";
		  
		  sMake4 = "BWM";
		  
		  sMake5 = "LandRover";
		  
		  
		  System.out.println("My Car is a " + sMake1 );
		  
		  System.out.println("My Car is a " + sMake2 );
		  
		  System.out.println("My Car is a " + sMake3 );
		  
		  System.out.println("My Car is a " + sMake4 );
		  
		  System.out.println("My Car is a " + sMake5 );
		
		/*
		 
		 */
		// declaration of array which will hold multiple values
		String[] sMake;
		
		String[] aCarMake = new String[5];
		aCarMake[0] = "BMW";
		aCarMake[1] = "AUDI";
		aCarMake[2] = "TOYOTA";
		aCarMake[3] = "SUZUKI";
		aCarMake[4] = "HONDA";
		
		
		//**********************************************************
		
		
		//Advance way
		
		//**********************************************************
		
		
		String [] aMake = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
		//This is to store the size of the Array
		int iLength = aMake.length;
		System.out.println("Length of the Array is ==> " + iLength);
		//This is to access the first element of an array directly with it's position
		String sBMW = aMake[0];
		System.out.println("First value of the Array is ==> " + sBMW);
		//This is to access the last element of an Array
		String sHonda = aMake[iLength-1];
		System.out.println("Last value of the Array is ==> " + sHonda);
		//This is to print all the element values of an Array
		for(int i = 0;i<=iLength-1;i++){
		System.out.println("The value stored at position "+i+" in aMake array is ==> " + aMake[i]);
		
		}
	}

}
