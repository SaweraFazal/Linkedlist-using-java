package lab6;

public class P1 <T>{

	//an object of type T is declared
		T obj;
		//constructor
		P1(T obj){
			this.obj=obj;
		}							
	public T getObject() {
		return this.obj;
	}
	}
	//driver class to test above
	class Main{
		public static void main(String[] args)
		{
			P1<Integer> iObj=new P1<Integer>(27);
			System.out.println(iObj.getObject());
			//instance of string typre
			P1<String> sObj=new P1<String>("UIT");
			System.out.println(sObj.getObject());
		}
	}
