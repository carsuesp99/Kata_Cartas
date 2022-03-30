package main;

public class Cards {

    public final String CARD_RANK = "123456789TJQK";

    int score1 = 0;
    int score2 = 0;

    public void calculateScore(int[] pack1, int[] pack2){



        for(int i=0;i< pack1.length;i++) {
            if (card1IsHigher(pack1,pack2)) {
                score1++;
                System.out.println("Player 1 wins. " + score1 + " - " + score2);

            } else if (card2IsHigher(pack1,pack2)) {
                score2++;
                System.out.println("Player 2 wins. " + score1 + " - " + score2);

            } else {
                System.out.println("Tie. " + score1 + " - " + score2);
            }
        }
    }

    public boolean card1IsHigher(int[] pack1, int[] pack2){
        if(CARD_RANK.indexOf(pack1[0]) > CARD_RANK.indexOf(pack2[0])){
            return true;
        }
        return false;
    }

    public boolean card2IsHigher(int[] pack1, int[] pack2){
        if(CARD_RANK.indexOf(pack1[0]) < CARD_RANK.indexOf(pack2[0])){
            return true;
        }
        return false;
    }

}
