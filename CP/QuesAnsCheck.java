import java.util.Scanner;
public class QuesAnsCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            char cs[] = sc.next().toCharArray();
            int q = 0 , a =0;
            for(int i = 0 ; i < n ;i++){
                if(cs[i] == 'Q'){
                    q++;
                }
                else{
                    q = Math.max(0,q-1);
                }   

                if(q == 0){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("NO");
                }
        }
        
    }

}
}