public class fast_expo {
    public static void main(String[] args) {
        int ans = 1;
        int a = 3;
        int n = 5;

        while(n>0){

            if((n&1)!=0){
                ans = ans*a;
            }
            a = a*a;
            n=n>>1;
        }
        System.out.println(ans);
    }
}
