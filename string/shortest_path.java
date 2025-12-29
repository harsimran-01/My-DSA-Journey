
public class shortest_path {
    public static float path_find(String str){
        int x = 0;
        int y = 0;
        for(int i=0;i<str.length();i++){
            char dir = str.charAt(i);

            if(dir == 'N') y++;
            else if(dir == 'S') y--;
            else if(dir == 'E') x++;
            else x--;
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        System.out.println("Shortest Path");
        String path = "WNEENESENNN";
        System.out.println(path_find(path));
        
    }
}
