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

    @Test
    public void singleDeckShoeShouldContain53Cards() throws Exception {
        // shoe will have 52 standard cards + 1 blank
        boolean moreCards = false;
        long cardCount = 1;

        Shoe shoe = new Shoe(1);
        do {
            Card card = shoe.drawCard();
            if (card != null) {
                cardCount = cardCount + 1;
                moreCards = true;
            } else {
                moreCards = false;
            }
        } while (moreCards);

        assertEquals(53, cardCount);
    }

}