package edu.cnm.deepdive.model;

public class Card implements Comparable<Card> {

  private final Rank rank;
  private final Suit suit;

  public Card(Rank rank, Suit suit) { //constructor
    this.rank = rank;
    this.suit = suit;
  }

  public Rank getRank() { //getter
    return rank;
  }

  public Suit getSuit() { //getter
    return suit;
  }

  public String getSymbol() {
    return String.format("%s%s", rank.getSymbol(), suit.getSymbol());
  }

  @Override //override notifies compiler that we are doing an override to 'keep us honest'
  public String toString() {
    //return String.format("%s %s", rank, suit);
    return getSymbol();
  }

  @Override
  public int compareTo(Card other) {
    int comparison = suit.compareTo(other.suit);
    if (comparison == 0) {
      comparison = rank.compareTo(other.rank);
    }
    return comparison;
  }
  //%s means substitute, it's telling rank to replace first, and suit to replace second object
}
