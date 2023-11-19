
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("n : ");
    int n = scanner.nextInt();

        Random random = new Random();
        int[] randomNum =new int[n];
        randomNum[0] = n;

        for(int i=1;i<n;i++){
            randomNum[i] = random.nextInt();
        }

        bubbleSort(randomNum);

        System.out.println("Ans : ");
        for(int ans : randomNum){
            System.out.println(ans);
        }


    }

    private static void bubbleSort(int[] randomNum){

        int N = randomNum.length;

        for(int i=0;i<N;i++){
            for (int j=0;j<N-1-i;j++){
                if(randomNum[j]>randomNum[j+1]){
                    int temp = randomNum[j];
                    randomNum[j] = randomNum[j+1];
                    randomNum[j+1] = temp;
                }
            }
        }
    }
}