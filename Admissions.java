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
        String lastname = "Padjen";

        int solid = 0;

        boolean requirementa = false;
        boolean requirementb = false;
        boolean requirementc = true;
        boolean requirementd = true;

		System.out.println("What is your SAT score: ");
        sat = scan.nextInt();
        System.out.println("What is your class rank: ");
        rank = scan.nextInt();
        System.out.println("How many awards have you won: ");
        awards = scan.nextInt();
        System.out.println("Where do you reside: ");
        location = scan.next();
        System.out.println("What is your last name: ");
        lastname = scan.next();


        if (sat >= 1500){
            satrank = "E";
            requirementa = true;
        } else if (sat >= 1400 && sat <= 1499){
            satrank = "S";
            solid++;
        } else if (sat >= 1200 && sat <= 1399){
            satrank = "A";
        } else {
            satrank = "N";
            requirementd = false;
        }

        if (rank >= 95){
            rankrank = "E";
            requirementa = true;
        } else if (rank >=90 && rank <= 94){
            rankrank = "S";
            solid++;
        } else if (rank >= 85 && rank <= 89){
            rankrank = "A";
        } else {
            rankrank = "N";
            requirementd = false;
        }

        if (awards >= 10){
            awardsrank = "E";
            requirementa = true;
        } else if (awards == 8 || awards == 9){
            awardsrank = "S";
            solid++;
        } else if (awards >= 3 && awards <= 7){
            awardsrank = "A";
        } else {
            awardsrank = "N";
            requirementd = false;
        }

        String lastnamee = "Padjen";
        if (lastname.equals("Padjen")){
            requirementc = true;
        } else {
            requirementc = false;
        }

        if (location == "Colorado"){
            awardsrank = "E";
            requirementa = true;
        } else if (location == "Florida"){
            awardsrank = "N";
            requirementd = false;
        } else {
            awardsrank = "A";
        }



        if (solid >= 2){
            requirementb = true;
        }



        if ((requirementa || requirementb || requirementc) && requirementd){
            System.out.println("Congratulations, you were accepted!");
        } else {
            System.out.println("We regret to inform you that you were not accepted. This is due to:");
            if (!requirementa){
                System.out.println("- Your lack of Elite in any subject.");
            }
            if (!requirementb){
                System.out.println("- Your lack of two or more Solids in any merit.");
            }
            if (!requirementc){
                System.out.println("- Your last name.");
            }
            if (!requirementd){
                System.out.println("- A score for a certain merit is lower than Acceptable.");
            }
        }



	}
}