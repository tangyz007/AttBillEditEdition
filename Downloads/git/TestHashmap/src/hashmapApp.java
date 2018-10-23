import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmapApp {

	
	
	
	
	public static void main(String[] args) {
		float totalData =15;
		float TotalExtraBill=0;
		float dataEveryPerson;
		int NumPeopleOverUse;
		int ExtraBill;
		float bill;
		
//		dataEveryPerson();
//		numOfPeopleOverUse();
//		extraPackage();
		
		System.out.println("Enter How Many People are there in the plan: ");
	    Scanner numOfPeople = new Scanner(System.in);
	    dataEveryPerson = totalData/numOfPeople.nextFloat();
	  
	   System.out.println("Every User can use up to  "+dataEveryPerson+ "G data." );
		
	   System.out.println("Enter How Many People over use: ");
	   Scanner PeopleOverUse = new Scanner(System.in);
	     NumPeopleOverUse = PeopleOverUse.nextInt();
		
	     System.out.println("Enter How Many Extra Data package applied: ");
	     Scanner DataApply = new Scanner(System.in);
	     ExtraBill = DataApply.nextInt()*15;
	     
	     
		Map<String, Float> Bill = new HashMap <String, Float>();
		for(int i=0;i<NumPeopleOverUse;i++) {
			 System.out.println("Enter the name of the Person: ");
             Scanner PersonName = new Scanner(System.in);
             
             System.out.println("Enter this person data use: ");
             Scanner dataUsePerMan = new Scanner(System.in);
             //bill=dataUsePerMan.nextFloat()-dataEveryPerson;
             //TotalExtraBill +=dataUsePerMan.nextFloat()-dataEveryPerson;
           Bill.put(PersonName.nextLine(), dataUsePerMan.nextFloat()-dataEveryPerson);
             
		}
		for(Object temp: Bill.keySet()) {
			TotalExtraBill +=Bill.get(temp);
		}
		for(Object temp: Bill.keySet()) {
			float billPerson=Bill.get(temp);
			
			bill=(billPerson/TotalExtraBill)*ExtraBill;
			System.out.println("key= "+temp+" and should pay= "+bill);
		}
		
	}
	/*
private static void dataEveryPerson() {
	 System.out.println("Enter How Many People are there in the plan: ");
	    Scanner numOfPeople = new Scanner(System.in);
	    float dataEveryPerson = totalData/numOfPeople.nextFloat();
	   this.dataEveryPerson=dataEveryPerson;
	   System.out.println("Every User can use up to  "+dataEveryPerson+ "G data." );
}

private static void numOfPeopleOverUse() {
	Scanner PeopleOverUse = new Scanner(System.in);
    int NumPeopleOverUse = PeopleOverUse.nextInt();
	this.NumPeopleOverUse=NumPeopleOverUse;
    
}

private static void extraPackage() {
	 Scanner DataApply = new Scanner(System.in);
     int ExtraBill = DataApply.nextInt()*15;
     this.ExtraBill=ExtraBill;
}
*/
	
class BillManagement{
	 private String id;
	    private String name;
	    private float charge;
	    
	    
	    public BillManagement(String id,String name,float charge) {
	    	  this.id = id;
	          this.name = name;
	          this.charge = charge;
	    }
}


}
