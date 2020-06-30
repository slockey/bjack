package com.bjack.model;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DeckTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shuffleShouldChangeCardOrder() throws Exception {
        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card("Hearts", 1, "Ace of Hearts"));
        cards.add(new Card("Hearts", 2, "Two of Hearts"));
        cards.add(new Card("Hearts", 3, "Three of Hearts"));
        
        Deck deck = new Deck();
        deck.setCards(cards);
        
        //shuffle
        deck.shuffle();
        
        Iterator<Card> it = deck.getCards().iterator();
        while (it.hasNext()) {
            Card card = it.next();
            System.out.println(String.format("Card: %s", card.getDisplayValue()));
        }
    }

    // TODO: complete this test case
//    @Test
//    public void shuffleShouldDoNothingIfNoCardsInDeck() throws Exception {
//        Deck deck = new Deck();
//        deck.shuffle();
//    }
}
