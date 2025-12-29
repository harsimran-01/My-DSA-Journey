public class palindrome {
    
    public static boolean isPalindrome(String str){
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return str.equals(rev);
    }

    public static boolean palindrome_check(String str){
        int n = str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Palindrome Checker");
        String str = "nammaaan";
        System.out.println(isPalindrome(str));
        System.out.println(palindrome_check(str));
    }
}

