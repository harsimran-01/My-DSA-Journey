public class clear_ith {
    public static void main(String[] args) {
        int ith = 1;
        int left_shift = 1<<ith;
        int bitmas = ~(left_shift);
        int num = 10;
        System.out.println(num&bitmas);
    }
}
