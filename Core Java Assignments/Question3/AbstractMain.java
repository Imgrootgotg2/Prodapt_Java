package AssignmentQuest3;

public class AbstractMain  {
	public static void main(String[] args) {
		Object[] obj=new Object[6];
		obj[0]=1;
		obj[1]="hi";
		obj[2]=3;
		obj[3]=4;
		obj[4]=5;
		obj[5]=6;
		IntegerSearch is=new IntegerSearch();
		is.search(obj, "hi");
		

	}

}
