
public class Arena {
    Gamer gamer1;
    Gamer gamer2;
    static boolean isOver;

   Arena(Gamer g1, Gamer g2){
        this.gamer1 = g1;
        this.gamer2 = g2;
    }

    void start(){
        while (!isOver){
            gamer1.move();
            gamer2.move();
            processMoves();
            displayScores(gamer1);
            displayScores(gamer2);
        }
    }

    void processMoves(){
        if (gamer1 == null || gamer2==null || isOver ==true) return;
        else if(gamer1.handSign == gamer2.handSign) Gamer.numberOfDraws++;
        else if(gamer1.handSign == HandSign.Paper && gamer2.handSign == HandSign.Rock)
            gamer1.numberOfWins++;
        else if(gamer1.handSign == HandSign.Rock && gamer2.handSign == HandSign.Scissor)
            gamer1.numberOfWins++;
        else if(gamer1.handSign == HandSign.Scissor && gamer2.handSign == HandSign.Paper)
            gamer1.numberOfWins++;
        else
            gamer2.numberOfWins++;

        Gamer.numberOfTrials++;

    }
    void displayScores(Gamer gamer){
        String data= String.format("name: %s number of wins: %d  number " +
                "of draws: %d  number of trials %d", gamer.name, gamer.numberOfWins,
                Gamer.numberOfDraws, Gamer.numberOfTrials);
        System.out.println(data);
    }
}
