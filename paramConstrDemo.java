 class parastd {
		int id;
		String name;

		parastd(int i,String n)
		{
		id=i;
		name=n;
		}

		void display() {
		System.out.println(id+" "+name);
		}
	}
public class paramConstrDemo {
	
		public static void main(String[] args) {

			parastd std1=new parastd(2,"Alex");
			parastd std2=new parastd(10,"Annie");
			std1.display();
			std2.display();
				}
		}

