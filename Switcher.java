public class Switcher{
  
  public static int tener(){
    return(int)(10*Math.random()+1);}
  public static int[] tenArray(int n){
    int[] numbers = new int[n];
    for (int i=0; i<n; i++){
      numbers[i] = tener();}
    return numbers;
  }
  public static void printer(int[] jim){
     for (int j=0; j<jim.length; j++){
     System.out.print(jim[j]+" ");
     }
  }
  
  public static void reversi(int[] jim){
    int tmp;
    for (int i=0; i<(jim.length/2); i++){
      tmp = jim[i];
      jim[i] = jim[jim.length-1-i];
      jim[jim.length-1-i] = tmp;
    }
  }
    public static void main(String[] args){
      
      int L = 5;
      int[] array = tenArray(L);
      printer(array);
      System.out.println();
      reversi(array);
      printer(array);
      
      }
    }