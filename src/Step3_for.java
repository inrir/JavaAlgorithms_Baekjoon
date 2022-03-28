import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step3_for {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine());

        for(int i = a; i>=1; i--){
            System.out.println(i);
        }

       /* 반복문 내부에서 값을 여러개 띄워쓰기로 받을 수 있는 방법
         for(int i = 0; i<a; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            nums[i] = b+c;
        }*/

    }
}
