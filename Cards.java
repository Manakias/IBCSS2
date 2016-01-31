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
      
  /*  for(int i=0; i<52; i++){
        System.out.println(deck[i]);
     }
   */
    shuffle(deck, 1000);
    
   // System.out.println("SHUFFLED");
    
   /* for(int i=0; i<52; i++){
        System.out.println(deck[i]);
      }
    */
    
    String[] delt = new String[2];
    delt[0]=deal(deck);
    delt[1]=deal(deck);
    
    System.out.println(delt[0] + " and " + delt[1] + ", with " + count + " cards remaining.");
    int card1 = value(delt[1]);
    int card2 = value(delt[0]);
    System.out.println("The total card value is " + (card1 + card2));
  }
  }
    
    
