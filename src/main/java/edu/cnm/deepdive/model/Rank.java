package edu.cnm.deepdive.model;

public enum Rank {

  ACE("A"), //objects are tracked by themselves because of data down below
  TWO("2"),
  THREE("3"),
  FOUR("4"),
  FIVE("5"),
  SIX("6"),
  SEVEN("7"),
  EIGHT("8"),
  NINE("9"),
  TEN("10"),
  JACK("J"),
  QUEEN("Q"),
  KING("K");

  private final String symbol; //field

  Rank(String symbol) { //parameter
    this.symbol = symbol;
  }

  public String getSymbol() {  //method
    return symbol;
  }


}
