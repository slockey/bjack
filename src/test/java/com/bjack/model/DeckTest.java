package com.bjack.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

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
        cards.add(new Card("Hearts", 4, "Four of Hearts"));
        cards.add(new Card("Hearts", 5, "Five of Hearts"));

        Deck deck = new Deck();
        deck.setCards(cards);
        deck.shuffle();

        Deck newDeck = new Deck();
        newDeck.setCards(cards);

        assertNotEquals(0, deck.compareTo(newDeck));
    }

    @Test
    public void shuffleShouldDoNothingIfNoCardsInDeck() throws Exception {
        Deck deck = new Deck();
        deck.shuffle();
    }

    @Test
    public void deckShouldProvideAccurateCountOfCards() throws Exception {
        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card("Hearts", 1, "Ace of Hearts"));
        cards.add(new Card("Hearts", 2, "Two of Hearts"));
        cards.add(new Card("Hearts", 3, "Three of Hearts"));

        Deck deck = new Deck();
        deck.setCards(cards);
        assertEquals(3, deck.cardCount());
    }
}
