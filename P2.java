package lab6;

public class P2 {
	//a generic method example
	static<T> void genericDisplay(T element)
	{
		System.out.println(element.getClass()
				.getName()+"="+ element);
	}
	//driver method
	public static void main(String[] args)
	{
		//calling generic method with integer argument
	genericDisplay(101);
	genericDisplay("UIT");
	}

}
