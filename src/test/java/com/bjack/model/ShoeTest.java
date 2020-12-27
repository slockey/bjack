package com.bjack.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShoeTest {

    @Before
    public void setUp() throws Exception {
        
    }

    @After
    public void tearDown() throws Exception {
        
    }

    @Test
    public void drawCardShouldDrawCard() throws Exception {
        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card("Spades", 1, "Ace of Spades"));

        Shoe shoe = new Shoe(1, cards);
        Card drawn = shoe.drawCard();

        assertNotNull(drawn);
        assertEquals("Ace of Spades", drawn.getDisplayValue());
    }

    @Test
    public void drawCardShouldReturnNullIfNoCardsLeft() throws Exception {
        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card("Spades", 1, "Ace of Spades"));

        Shoe shoe = new Shoe(1, cards);
        Card drawn = shoe.drawCard();

        assertNotNull(drawn);
        assertEquals("Ace of Spades", drawn.getDisplayValue());
        // end of deck - now returns null
        assertNull(shoe.drawCard());
    }

    @Test
    public void drawCardShouldNotFailWithEmptyShoe() throws Exception {
        Shoe shoe = new Shoe(0);
        Card drawn = shoe.drawCard();
        assertNull(drawn);
    }

    /**
     * Card values are 1 based
     * 
     * @param cardCount
     * @param suits
     * @return
     */
    private ArrayList<Card> generateCards(int cardCount, ArrayList<String> suits) {
        ArrayList<Card> cards = new ArrayList<Card>();
        for (String suit : suits) {
            for (int idx = 1; idx <= cardCount; idx++) {
                String displayValue = String.format("%d of %s", idx, suit);
                cards.add(new Card(suit, idx, displayValue));
            }
        }
        return cards;
    }
}
