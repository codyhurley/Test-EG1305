import java.util.Scanner;
public class TestPet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pet p = new Pet();
		
		System.out.println("Please name your new pet.");
		p.name = sc.next();
		
		System.out.println("Please determine the type of pet it is.");
		p.type = sc.next();
		
		System.out.println("How old is it?");
		p.age = sc.nextInt();
		
		
		System.out.println("Pet created.");
		
		System.out.println("Your new pet's name is " + p.getName() + ".");
		System.out.println("It is a " + p.getType() + ".");
		System.out.println("It is " + p.getAge() + " years old.");
		
		

	}

}
