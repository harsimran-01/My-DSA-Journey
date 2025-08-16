public class clear_last {
    public static void main(String[] args) {
        int ith = 2;
        int left_shift = ~0<<ith;
        int num = 15;
        System.out.println(num&(left_shift));
    }
}
