/**
 * 
 */
package com.bjack.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Shoe is a box that contains 4 or more decks shuffled together.
 * 
 * There is usually a blank card placed toward the bottom of the gathered decks
 * to indicate that a re-shuffle is required. Blank card should be placed
 * leaving about 25% of the deck unused.
 * 
 * Intention is to mitigate dealer cheating and card counting.
 */
public class Shoe {

    private final Card BLANK = new Card("blank", 0, "blank");
    private final double BLANK_LOCATION_RATIO = 0.25;

    private final int numDecks;
    private final ArrayList<Card> cards;

    private Iterator<Card> iterator = null;
    private boolean needsReshuffle = false;

    public Shoe(int numDecks) {
        this.numDecks = numDecks;
        this.cards = new ArrayList<Card>();
        // initialize
        populateShoe();
    }

    protected Shoe(int numDecks, ArrayList<Card> cards) {
        this.numDecks = numDecks;
        this.cards = cards;
    }

    public Card drawCard() {
        Card result = null;

        if (iterator == null) {
            iterator = cards.iterator();
        }

        if (iterator.hasNext()) {
            Card nextCard = iterator.next();
            if (nextCard.getSuit().equalsIgnoreCase(BLANK.getSuit())) {
                needsReshuffle = true;
                nextCard = drawCard();
            }
            result = nextCard;
        }

        return result;
    }

    public boolean needsReshuffle() {
        return needsReshuffle;
    }

    private void populateShoe() {
        // get # of decks
        for (int idx = 0; idx < numDecks; idx++) {
            // instantiate deck
            Deck newDeck = DeckFactory.getStandardDeck();
            // shuffle deck
            newDeck.shuffle();
            // add to shoe
            cards.addAll(newDeck.getCards());
        }

        // determine location and insert blank
        int blankIndex = (int)Math.round(cards.size() * BLANK_LOCATION_RATIO);
        cards.add(blankIndex, BLANK);

        // clear the iterator & reshuffle flag
        iterator = null;
        needsReshuffle = false;
    }
}
