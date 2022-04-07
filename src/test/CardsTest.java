package test;

import main.Cards;
import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class CardsTest {

    Cards cards;

    @Test
    public void should_win_player1_if_card1_is_higher(){

        cards = new Cards();
        assertEquals("Player 1 wins. 1 - 0", cards.calculateScore(new int[]{'3'}, new int[]{'2'}));
    }

    @Test
    public void should_win_player2_if_card2_is_higher(){

        cards = new Cards();
        assertEquals("Player 2 wins. 0 - 1", cards.calculateScore(new int[]{'2'},new int[]{'9'}));
    }

    @Test
    public void calculateScore_should_return_tie(){

        cards = new Cards();
        assertEquals("Tie. 0 - 0", cards.calculateScore(new int[]{9}, new int[]{9}));
    }

    @Test
    public void card_value_is_not_a_number(){

        cards = new Cards();
        assertEquals("Player 1 wins. 1 - 0", cards.calculateScore(new int[]{'K'}, new int[]{'J'}));
    }

    @Test
    public void more_than_one_card(){

        cards = new Cards();
        assertEquals("Player 1 wins. 1 - 0", cards.calculateScore(new int[]{'K'}, new int[]{'5'}));
        assertEquals("Player 1 wins. 2 - 0", cards.calculateScore(new int[]{'7'}, new int[]{'4'}));
    }

}
