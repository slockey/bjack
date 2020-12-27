package com.bjack.model;

import java.util.ArrayList;

public class DeckFactory {

    private static final String SUIT_CLUB = "Club";
    private static final String SUIT_DIAMOND = "Diamond";
    private static final String SUIT_SPADE = "Spade";
    private static final String SUIT_HEART = "Heart";

    private static final String[] cardNames = new String[] {"Ace", "Two", "Three", "Four", "Five", 
                                                     "Six", "Seven", "Eight", "Nine", "Ten", 
                                                     "Jack", "Queen", "King"};

    private DeckFactory() { }

    public static Deck getStandardDeck() {
        ArrayList<Card> cards = new ArrayList<Card>();
        cards.addAll(generateSuit(SUIT_CLUB, cardNames));
        cards.addAll(generateSuit(SUIT_DIAMOND, cardNames));
        cards.addAll(generateSuit(SUIT_SPADE, cardNames));
        cards.addAll(generateSuit(SUIT_HEART, cardNames));

        Deck deck = new Deck();
        deck.setCards(cards);
        return deck;
    }

    private static ArrayList<Card> generateSuit(String suitName, String[] cardNames) {
        ArrayList<Card> suit = new ArrayList<Card>();

        for (int idx = 0; idx < cardNames.length; idx++) {
            String displayName = String.format("%s of %s", cardNames[idx], suitName);
            suit.add(new Card(suitName, idx+1, displayName));
        }

        return suit;
    }
}
