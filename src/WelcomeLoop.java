import java.util.Scanner;

public class WelcomeLoop {
    public static void main(String[] args) {
        String [] names = new String[5];
        Scanner scan = new Scanner(System.in);
        int i = 0;
        System.out.println("Podaj pięć imion, po każdym użyj \"entera\":");
        for (i = 0; i < names.length; i++){
            names[i] = scan.nextLine();
        }

        for(i = names.length-1; i >= 0; i--){
            System.out.println("Cześć " + names[i]);
        }

    }
}
