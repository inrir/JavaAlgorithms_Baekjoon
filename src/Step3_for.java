import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step3_for {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringTokenizer stt = new StringTokenizer(bf.readLine());
        int [] nums = new int[a];
        int [] tre = new int[a];
        int t = 0;
        for(int i = 0; i<a; i++){
            nums[i] = Integer.parseInt(stt.nextToken());
            if(nums[i] < b){
                tre[t] = nums[i];
                t++;
            }
        }
        for(int i = 0; i<t; i++){
            System.out.print(tre[i] + " ");
        }


        //        System.out.println("*".repeat(i)); // 문자열 갯수 곱가능

       /* 반복문 내부에서 값을 여러개 띄워쓰기로 받을 수 있는 방법
         for(int i = 0; i<a; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            num_b[i] = b;
            num_c[i] = c;
            nums[i] = b+c;
        }
         */

    }
}
