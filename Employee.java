
public abstract class Employee {
	 String eName;
     int eId;
	public static int nextIdNum = 1000;
	public Employee(String eName, int eId){
		this.eName = eName;
		this.eId = eId;	
	}
	public Employee(){
		String eName = "";
		int eId = 0;
	}
	
	public void setEName(String eName){
		eName = eName;
	}
   public String getEName(){
	   return eName;
   }
   public void setEId(int eid){
	   eId = eid;
	   eId = nextIdNum +1;
   }
   public int getEId(){
	   return eId;
   }
   public static void setNextIdNum(int nIdNum){
	   nextIdNum = nIdNum;
   }
   public static int getNextIdNum(){
	   return nextIdNum;
   }
   public abstract double computePay();
   public String toString(){
	   return ("name" + eName + "\n" +"id number" + eId);
   }
   
}
