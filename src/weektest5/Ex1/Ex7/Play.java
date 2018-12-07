package weektest5.Ex1.Ex7;


import java.util.Optional;
import java.util.Scanner;

public class play {
    public void play() {
        Player player1 = new Human();
        Player player2 = new Computer();
        Judge judge = new Judge();
        Optional<Move> player1Move = player1.getMove();
        Optional<Move> player2Move = player2.getMove();


        System.out.println("Let’s play rock, paper, scissors!");
        System.out.println("These are your options: rock, paper, scissors");
        System.out.println("Choose one:");
        System.out.println("These are your options: rock, paper, scissors");
        System.out.println("Choose one:");
        System.out.println("player1 choose: " + player1Move.get().getName());
        System.out.println("player2 choose: " + player2Move.get().getName());


        judge.displayTheWinner(player1Move.get(), player2Move.get());
    }
    public void playAgain(){
        System.out.println("Do you want to play again? (yes/no)");
        Scanner scanner=new Scanner(System.in);
        String answer =scanner.nextLine();
        if (answer.equals("yes")){
            play();
        }
        System.out.println("");






    }






}
