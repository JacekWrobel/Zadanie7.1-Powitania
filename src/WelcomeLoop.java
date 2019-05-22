import java.util.Scanner;

public class WelcomeLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //użycie pętli "for"
        String[] names = new String[5];
        System.out.println("Podaj pięć imion, po każdym użyj \"entera\":");
        for (int i = 0; i < names.length; i++) {
            names[i] = scan.nextLine();
        }
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println("Cześć " + names[i]);
        }

        //użycie pętli "for" w wydaniu "for each"
        String[] inna = new String[7];
        for (int i = 0; i < inna.length; i++) {
            inna[i] = scan.nextLine();
            System.out.println("Wiataj" + inna[i] + " to jest i = " + i);
        }
        for (String info : inna) {
            System.out.println("Cześć " + info);
        }

//użycie pętli "while"
        String[] loopWhile = new String[5];
        System.out.println("Podaj 5 imion: ");
        int j = 0;
        while (j < loopWhile.length) {
            loopWhile[j] = scan.nextLine();
            j++;
        }
        int k = loopWhile.length - 1;
        while (k >= 0) {
            System.out.println("Witam: " + loopWhile[k]);
            k--;
        }

    }
}
