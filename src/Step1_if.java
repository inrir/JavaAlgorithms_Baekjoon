import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step1_if {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
//        int a = Integer.parseInt(bf.readLine());
//        int b = Integer.parseInt(bf.readLine());
        if(a==b && a==c && b==c){
            System.out.println(10000 + 1000*a);
        }
        else if(a == b){
            System.out.println(1000 + 100*a);
        }
        else if(a == c){
            System.out.println(1000 + 100*a);
        }
        else if(b == c){
            System.out.println(1000 + 100*b);
        }
        else{
            int max = a>b? a:b;
            max = max>c? max:c;

            System.out.println(100*max);
        }

    }
}
