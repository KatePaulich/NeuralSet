package fibonachi;

public class App {
    public static void main(String[] args) {
        int i = 10;
        for (int j=0; j< i; j++){
            str(j);
        }
    }

    static void str(int k){
        String s = "*";
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i=0; i<k; i++){
            stringBuilder.append("*");
        }
        System.out.println(stringBuilder);
    }
}
