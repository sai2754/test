package test;
public interface ITest {
public abstract void m1(int x);
public static void m2(int y)
{
	System.out.println("===Static m2(y)===");
	System.out.println("y:"+y);
}
}
