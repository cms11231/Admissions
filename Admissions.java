import java.util.Scanner;
public class Admissions {
    	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    
        int sat = 0;
        String satrank;
        int rank = 0;
        String rankrank;
        int awards = 0;
        String awardsrank;
        String location = "Colorado";
        String locationrank;


		System.out.println("What is your SAT score: ");
        sat = scan.nextInt();
        System.out.println("What is your class rank: ");
        rank = scan.nextInt();
        System.out.println("How many awards have you won: ");
        awards = scan.nextInt();
        System.out.println("Where do you reside: ");
        location = scan.next();


        if (sat >= 1500){
            satrank = "E";
        } else if (sat >= 1400 && sat <= 1499){
            satrank = "S";
        } else if (sat >= 1200 && sat <= 1399){
            satrank = "A";
        } else {
            satrank = "N";
        }


        System.out.println(satrank);
        
	}
}