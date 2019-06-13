
public class Generic_Clas<T>
{ 
		T obj;
		Generic_Clas(T obj) {
			this.obj = obj;
		}
		public T print() {
			return this.obj;
		}
		public static void main(String[] args) 
		{			
			Generic_Clas<String> objS = new Generic_Clas<String>("This is Vijay ");
			System.out.println(objS.print()+"\n"+"This is string type \n");
			
			Generic_Clas<String> obje = new Generic_Clas<String>("From KKD");
			System.out.println("This is string type \n"+obje.print()+"\n");
			
			Generic_Clas<Integer> objI = new Generic_Clas<Integer>(10);
			System.out.println("My ID No. is  "+objI.print());
			System.out.println("this is integer value "+objI.print()+"\n");
			
			Generic_Clas<Float> objf = new Generic_Clas<Float>((float) 20000);
			System.out.println("Salary is  \n"+objf.print());
			
		}
	}


