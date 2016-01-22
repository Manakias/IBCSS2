public class Random{
  public static int tener(){
    return (int) (10*Math.random()+1);
  }
  public static int[] tenArray(int n){
    int[] numbers = new int[n];
    int i;
    for (i=0; i<n; i++){
      numbers[i]=tener();}
  return numbers
} 
    public static void main(String[] args){
      System.out.println(tener());
      int L = 20;
      int[] test = tenArray[L];
      for {i=0; i<L; i++){
        System.out.println(test[i]);
      }
      