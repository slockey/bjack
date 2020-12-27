package com.bjack.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;

public class Deck implements Comparable<Deck>{

    private List<Card> cards = new ArrayList<Card>();

    public void shuffle() {
        // TODO: implement shuffle
        Collections.shuffle(cards);
    }

    public List<Card> getCards() {
        return cards;
    }

    /**
     * Replaces the list of cards in this deck with those provided
     * @param cards
     */
    public void setCards(List<Card> cards) {
        this.cards.clear();
        this.cards.addAll(cards);
    }

    public int cardCount() {
        return cards.size();
    }

    @Override
    public int compareTo(Deck other) {
        // this is going to be a bit of a hack and likely temporary
        // append all card display names and generate hash
        
        return hash().compareTo(other.hash());
    }

    public String hash() {
        StringBuffer buff = new StringBuffer();
        for (Card card : cards) {
            buff.append(card.getDisplayValue());
        }
        return DigestUtils.md5Hex(buff.toString()).toUpperCase();
    }
}
