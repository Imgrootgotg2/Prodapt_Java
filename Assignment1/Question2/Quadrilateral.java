package AssignmentQuest2;

public abstract class Quadrilateral {
	
	public abstract void area(int base,int height);
	
	private int base;
	private int height;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public Quadrilateral() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Quadrilateral(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

}
