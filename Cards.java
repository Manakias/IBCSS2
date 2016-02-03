import java.util.Scanner;
public class Cards{
  static int count=52; //the count represents the number of cards remaining in the deck
  public static int rand(int high){
      return (int) (high*Math.random()+1);
    }
  public static void shuffle(String[] the_deck, int switches){
    String temp;
    int a; int b;
    for(int i=0; i<switches; i++){
      a = rand(52);
      b = rand(52);
      temp = the_deck[a-1];
      the_deck[a-1] = the_deck[b-1];
      the_deck[b-1] = temp;
    } 
  }
  public static String deal(String[] the_deck){
    count=count-1;    
   return the_deck[count];
  }
  //homework section
    public static int value(String card){
    if (card.charAt(0) == ('1')){
      return 10;
    }
    else if (card.charAt(0) == ('K')){
      return 10;
    }
    else if (card.charAt(0) == ('Q')){
      return 10;
    }
    else if (card.charAt(0) == ('J')){
      return 10;
    }
    else if (card.charAt(0) == ('A')){
      return 1;
    }
    else{
      char number = card.charAt(0);
      return Character.getNumericValue(number); 
    }
    }
  //end homework
  //Blackjack game, for homework due Feb 3
    public static void playBlackjack(Integer card1, Integer card2, String[] deck, String[] dealt){
      Scanner scan = new Scanner(System.in);
      int cardValue = card1 + card2;
      System.out.println("Your card value is " + cardValue);
      System.out.println("Hit, or stand?");
      String choice = scan.nextLine();{
        if (choice.equals("hit")){
          String newCard;
          newCard = deal(deck);
          int newCardValue = value(newCard);
          cardValue = cardValue + newCardValue;
        }
        if (choice.equals("stand")){};
        if (cardValue > 21){
          System.out.println("Bust! You lose!");
        }
      }
      if (cardValue <= 21){ 
      System.out.println("Your card value is " + cardValue);
        String[] dealerHand = new String[2];
        dealerHand[0] = deal(deck);
        dealerHand[1] = deal(deck);
        int dealerValue = (value(dealerHand[0])) + (value(dealerHand[1]));
        System.out.println("Dealer has a " + dealerHand[0] + " and a " + dealerHand[1] + ", " + dealerValue);
        if (cardValue > dealerValue){
          System.out.println("You Win!");
          if (cardValue == 21){
            System.out.println("Blackjack!");
        }
        }
        if (dealerValue > cardValue){
          System.out.println("You Lose!");
        }
        if (dealerValue == cardValue){
          System.out.println("Push.");
        }
      }
    }
  public static void main(String[] args){
   
    String[] deck = new String[52];
    String[] suit = new String[4];
    int[] card = new int[13];
    
    for (int i=0; i<card.length; i++){
      card[i]=i+1;}
    String cardName;
    suit[0] = "Clubs";
    suit[1] = "Diamonds";
    suit[2] = "Hearts" ;
    suit[3] = "Spades";
      
      
    for(int i=0; i<4; i++){
      for(int j=0; j<13; j++){
        if(j==0){cardName="Ace";}
        else if(j==10){cardName="Jack";}
        else if(j==11){cardName="Queen";}
        else if(j==12){cardName="King";}
        else {cardName=Integer.toString(card[j]);}
        deck[ 13*i+j ]= cardName + " of " +suit[i];
      }
    }
    shuffle(deck, 100000);

    
    String[] delt = new String[20];
    delt[0]=deal(deck);
    delt[1]=deal(deck);
    int card1 = value(delt[1]);
    int card2 = value(delt[0]);
    System.out.println("You have " + delt[0] + " and " + delt[1]);
    playBlackjack(card1, card2, deck, delt);
  }
  }
    
    
