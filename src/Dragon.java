import java.util.Scanner;

public class Dragon {
    public static void main(String[] args) {
//        System.out.println("hello");
        Scanner scan = new Scanner(System.in);
        System.out.print("Which cave will you enter? (1 or 2) ");
        int cave = scan.nextInt();

        if(cave == 2) {
            System.out.print("A large dragon jumps out in front of you! He opens his jaws and.. \n");
            System.out.print("Gobbles you down in one bite!");
        } else if(cave == 1){
            System.out.print("A magnificent dragon, allows you to  ride him to riches.");
        } else {
            System.out.print("You have been set on fire!");
        }

    }
}
