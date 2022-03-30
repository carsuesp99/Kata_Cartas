package test;

import main.Cards;
import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class CardsTest {

    Cards cards;

    @Test
    public void should_win_player1(){

        cards = new Cards();
        assertEquals(cards.card1IsHigher(new int[]{'3'}, new int[]{'2'}), true);
    }

    @Test
    public void should_win_player2(){

        cards = new Cards();
        assertEquals(cards.card2IsHigher(new int[]{'2'},new int[]{'9'}), true);
    }

    @Test
    public void should_return_tie(){

        cards = new Cards();
        assertEquals(cards.card2IsHigher(new int[]{9}, new int[]{9}), false);
    }

    @Test
    public void card_value_is_not_a_number(){

        cards = new Cards();
        assertEquals(cards.card2IsHigher(new int[]{'K'}, new int[]{'J'}), false);
    }

}
