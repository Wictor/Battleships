import java.util.Scanner;

public class GameStart {
    public Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        GameStart gameStart = new GameStart();
        gameStart.menu();

    }

    private void menu() {
        System.out.println("------Menu----------");
        System.out.println("1) VS CPU");
        System.out.println("2) VS Player");
        System.out.println("3) Simulated game");

        System.out.println("Choose your game mode");
        switch(scan.next()) {
            case "1":
                cpuGame();
                break;
            case "2":
                playerGame();
                break;
            case "3":
                simulatedGame();
                break;
            default:
                System.out.println("Incorrect input");
                menu();
                break;
        }
    }

    private void cpuGame() {
        System.out.println("1) Easy");
        System.out.println("2) Hard");
        switch(scan.next()) {
            case "1":
                cpuEasy();
                break;
            case "2":
                cpuHard();
                break;
        }
    }

    private void cpuEasy(){

    }
    private void cpuHard() {

    }
    private void playerGame() {

    }
    private void simulatedGame() {

    }
}

