import java.util.Scanner;


public class Gamer {
    String name;
    int numberOfWins;
    HandSign handSign;
    static int numberOfDraws;
    static int numberOfTrials;

    public Gamer(String name) {
        this.name = name;
    }

    void move(){
        if (Arena.isOver) return;
        System.out.println(this.name +"'s turn");
        Scanner input = new Scanner(System.in);
        System.out.println("press q for quit, s for scissor, r for rock, p for paper");
        boolean isInputInvalid = false;
        do{
            String userChoice = input.next();
            switch (userChoice){
                case "q":
                    Arena.isOver=true;
                   return;
                case "r":
                    this.handSign = HandSign.Rock;
                    break;
                case "s":
                    this.handSign = HandSign.Scissor;
                    break;
                case "p":
                    this.handSign = HandSign.Paper;
                    break;
                default:
                    System.out.println("wrong input, try again!");
                    isInputInvalid=true;
                    break;
            }
            System.out.println(this.name +"'s choice is "+ this.handSign);
        }while(isInputInvalid);
    }
}
