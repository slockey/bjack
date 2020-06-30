package com.bjack.model;

public class Card {

    private int value;
    private String displayValue;
    private String suit;

    public Card(String suit, int value, String displayValue) {
        this.suit = suit;
        this.value = value;
        this.displayValue = displayValue;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public String getDisplayValue() {
        return displayValue;
    }
    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }
    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }

}
