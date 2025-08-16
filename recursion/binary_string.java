
public class binary_string {

    public static void binary_ways(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binary_ways(n - 1, 0, str+"0");
        if (lastPlace == 0) {
            binary_ways(n - 1, 1, str+"1");
        }
        
        
    }

    public static void main(String[] args) {
        binary_ways(3, 0, "");

    }
}
