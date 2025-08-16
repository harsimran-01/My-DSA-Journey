

public class tilling_prblm {
    public static int tilling(int n){ //2xn
        if(n==1 || n==0) return 1;
        //choice
        //vertical

        int vertical_choice = tilling(n-1);

        //horizontal

        int horizontal_choice = tilling(n-2);

        return vertical_choice + horizontal_choice;


    }
    public static void main(String[] args) {

        System.out.println(tilling(1) + " ways ");
        
    }
}
