
class Cards{

    cardRank = "123456789TJQK";
    
    score1 = 0;
    score2 = 0;

    whoWins(pack1, pack2){

        for(var i=0;i<pack1.length;i++){
            if(this.cardRank.indexOf(pack1[i]) > this.cardRank.indexOf(pack2[i])){
                this.score1++;
                return "Player 1 wins. " + this.score1 + " - " + this.score2;
            } else if(this.cardRank.indexOf(pack1[i]) < this.cardRank.indexOf(pack2[i])){
                this.score2++;
                return "Player 2 wins. " + this.score1 + " - " + this.score2;
            } else{
                return "Tie. 0 - 0";
            }
        }
        
    }

}

module.exports = Cards;