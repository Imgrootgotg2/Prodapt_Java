package CoreJavaExercises;

public class Ex11_6Test {
	public static void main(String[] args)

	{

		Ex11_6 instanceA = new Ex11_6();

		Ex11_6 instanceB = new Ex11_6();

		instanceA.a = 8;

		instanceB.b = instanceA.x;

		instanceA.x++;

		instanceB.a = 10;

		instanceB.c = 90;

		instanceB.x++;

		System.out.println("a of InstanceA: "+instanceA.a);
		System.out.println("a of InstanceB: "+instanceB.a);
		System.out.println("b of InstanceA: "+instanceA.b);
		System.out.println("b of InstanceB: "+instanceB.b);
		System.out.println("c of InstanceA: "+instanceA.c);
		System.out.println("c of InstanceB: "+instanceB.c);
		System.out.println("x of InstanceA: "+instanceA.x);
		System.out.println("x of InstanceB: "+instanceB.x);
	}
}
