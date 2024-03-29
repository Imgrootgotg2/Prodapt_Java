package AssignmentQuest3;

public class IntegerSearch extends Abstractsearch {
	 
	@Override
	public boolean search(Object[] obj_list, Object obj) {
		
		
		for(int index=0; index<obj_list.length;index++) {
			
			if(obj_list[index].equals(obj)) {
				
			 System.out.println("Eureka Eureka !!!");
			    
				return true; 
				
				
			}
			
			
			else {
				System.out.println("OMG where is the obj");
				
			}
			
		}
		// TODO Auto-generated method stub
		return false;
	}
	
 
}
