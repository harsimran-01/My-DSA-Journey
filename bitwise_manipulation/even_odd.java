public class even_odd {
    public static void main(String[] args) {
        int bitmask = 1;
        int num = 4;
        if((num & bitmask )== 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd number");
        }
    }
}
