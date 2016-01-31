 public class Order{
  
   public static int tener(){
      return (int) (10*Math.random()+1);
    }
   
   public static int[] tenArray(int n){
     int[] whatever = new int[n];
     for (int i=0; i<n ; i++){
       whatever[i]=tener();}
     return whatever;
     }
  
  public static void main(String[] args){
    
    System.out.println(tener());
    
    int L= 10;
    int[] test = tenArray(L);
    int tmp;
    boolean globe = true;
    while(globe){
      globe = false; 
      for (int i=0; i<(L-1); i++){
         if (test[i] > test[i + 1]) {
                tmp = test[i];
                test[i] = test[i + 1];
                test[i + 1] = tmp;
                globe = true;
        }
      }
    }
      for (int i=0; i<L; i++){
        System.out.println(test[i]);
      }
  }
  }

        