import java.util.Scanner;

public class BillOvercharge {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float dataEveryPerson;
        int NumPeopleOverUse;
        int ExtraBill;
        float bill[];
        String person[];
        float TotalExtraBill=0;
        
         System.out.println("Enter How Many People are there in the plan: ");
    Scanner numOfPeople = new Scanner(System.in);
   dataEveryPerson = 15/numOfPeople.nextFloat();
    System.out.println("Every User can use up to  "+dataEveryPerson+ "G data." );
    
     System.out.println("Enter How Many People over use: ");
     Scanner PeopleOverUse = new Scanner(System.in);
     NumPeopleOverUse =PeopleOverUse.nextInt();
     bill = new float[10];
     person =new String[10];
     // System.out.println("The length of bill is: "+ bill.length);
     
    
     System.out.println("Enter How Many Extra Data package applied: ");
     Scanner DataApply = new Scanner(System.in);
     ExtraBill =DataApply.nextInt()*15;
     
    
            
        for (int i =0; i < NumPeopleOverUse; i++) {
            
             System.out.println("Enter the name of the Person: ");
             Scanner PersonName = new Scanner(System.in);
             person[i]=PersonName.nextLine();
             
             System.out.println("Enter this person data use: ");
            Scanner dataUsePerMan = new Scanner(System.in);
            bill[i]=dataUsePerMan.nextFloat()-dataEveryPerson;
            
            TotalExtraBill += bill[i];
        }
        //System.out.println( "total extra data"+ TotalExtraBill);
        for(int i =0; i < NumPeopleOverUse; i++){
        bill[i]=(bill[i]/TotalExtraBill)*ExtraBill;
        System.out.println(person[i]+ " Should pay an extra "+ bill[i]);
        }
    }
   
    
}