// package backtracking;

public class find_subsets {
    public static void subsets(String str, String subset,int i){

        if(i==str.length()){
            if(subset.length()==0){
                System.out.println("null");
            }else{
                System.out.println(subset);
            }
            return;
        }
        //yes
        subsets(str, subset+str.charAt(i), i+1);
        //no
        subsets(str, subset, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsets(str, "", 0);
    }
}
