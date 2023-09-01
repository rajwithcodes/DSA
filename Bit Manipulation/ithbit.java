public class ithbit {
    public static int ith_bit(int n,int i){
        int bitMask=1<<i;
        if((n&bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println("at 2nd bit of 10 is:"+ ith_bit(10, 2));

    }
    
}
