public class get_ith {
    public static void main(String[] args) {
        int ith = 2;
        int left_shift = 1<<ith;
        int num = 3;
        if((num & left_shift) == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
}
