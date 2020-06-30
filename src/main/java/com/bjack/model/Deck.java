package com.bjack.model;

import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public void shuffle() {
        // TODO: implement shuffle
        Collections.shuffle(cards);
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

}
