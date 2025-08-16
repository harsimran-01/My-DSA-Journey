
public class friend_pairing {
    public static int pairing_ways(int n){
        if(n==1 || n==2) return n;

        int single = pairing_ways(n-1);
        int doubly_pair = pairing_ways(n-2);
        int pair_ways = (n-1) * doubly_pair;

        return single + pair_ways;
    }
    public static void main(String[] args) {
        System.out.println(pairing_ways(2));
    }
}
