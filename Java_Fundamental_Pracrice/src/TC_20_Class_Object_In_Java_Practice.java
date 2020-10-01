
public class TC_20_Class_Object_In_Java_Practice {

	public static void main(String[] args) {
	
		
		// Instantiate an object
		  Car Toyota = new Car();  
		  
		  Toyota.sModel = "Camry";  
		  Toyota.iGear = 5;  
		  Toyota.iHighestSpeed = 200;  
		  Toyota.iMake = 2020;  
		  Toyota.iTyres = 4;  
		  Toyota.iDoors = 5;  
		  Toyota.sColor = "White";  
		  Toyota.sTransmission = "Automatic";  
		  Toyota.bLeftHandDrive = true;
		  
		  
		  // call the method  
		  Toyota.DisplayCharacterstics();  
		 }  
		  
		}
		 

		 class Car{
		  
		  //Class Member Variables & Fields
		  String sModel;
		  
		  int iGear;
		  
		  int iHighestSpeed;
		  
		  int iMake;
		  
		  int iTyres;
		  
		  int iDoors;
		  
		  String sColor;
		  
		  String sTransmission;
		  
		  boolean bLeftHandDrive;
		     
		  
		  public void DisplayCharacterstics(){
		  
		  System.out.println("Model of the Car: " + sModel);
		  System.out.println("Number of gears in the Car: " + iGear);
		  System.out.println("Max speed of the Car: " + iHighestSpeed);
		  System.out.println("Color of the Car: " + sColor);
		  System.out.println("Make of the Car: " + iMake);
		  System.out.println("Transmission of the Car: " + sTransmission);
		  
		  
		 }
		
		
	

}

	
