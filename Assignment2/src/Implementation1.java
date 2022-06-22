
public class Implementation1 {
	public static void main(String[] args) {
		Employee e1=new Employee();
		System.out.println(e1.calSal(1500));
		Manager m1=new Manager();
		System.out.println(m1.calSal(15000,5000));
		Labour l1=new Labour();
		System.out.println(l1.calSal(1500,2));
	}

}
