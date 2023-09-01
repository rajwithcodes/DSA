public class odd_even{
    public static void determine(int num){
        int bitMask=1;
        if ((num & bitMask)==0) {
            System.out.println("even");
            
        }
        else{
            System.out.println("odd");
        }     
    }
   public static void main(String[] args) {
    determine(3);
    
   }
}
