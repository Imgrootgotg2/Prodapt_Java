package AssignmentQuest2;

public class Square extends Quadrilateral {

	@Override
	public void area(int base, int height) {
		if (base==height) {
			height=height-10;
			int area=base*height;
			System.out.println("Area of rectangle modeled from sqaure is "+area);
		}
		else {
			System.out.println("Please give proper dimensions for square");
		}
		
	}

	

}
