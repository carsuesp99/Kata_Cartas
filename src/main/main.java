package main;

public class main {

    public static void main(String [] args){

        Cards cards = new Cards();

        int[] pack1 = {'9','Q','4','7'};
        int[] pack2 = {'8', 'K','4','3'};


        for(int i=0; i< pack1.length; i++){
            cards.calculateScore(new int[]{pack1[i]}, new int[]{pack2[i]});
        }

    }
}
