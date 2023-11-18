import  java.util.Random;
import  java.util.Scanner;
import  java.util.Arrays;
public class NonnegativeN {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("n : ");
        int n = scanner.nextInt();

        if(n<=0){
            System.out.print("Pleas input positive integer !!!");
            return;
        }

        Random random = new Random();
        int[] randomNum =new int[n];

        randomNum[0] = n;
        for(int i=1;i<n;i++){
            randomNum[i] = random.nextInt();
        }
        Arrays.sort(randomNum);

        System.out.println("Ans : ");
        for(int ans : randomNum){
            System.out.println(ans);
        }

    }
}


