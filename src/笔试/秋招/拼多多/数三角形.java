package 笔试.秋招.拼多多;


import java.util.Scanner;

public class 数三角形 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int[] x = new int[numbers];
        int[] y = new int[numbers];
        for(int i = 0; i<numbers; i++){
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        int result = 0;
        for(int i = 0; i<numbers; i++){
            for (int j = i+1; j<numbers; j++){
                for (int z = j+1; z<numbers; z++){
                    if(((y[z]-y[j]+0.0)/(x[z]-x[j]+0.0))!=((y[z]-y[i]+0.0)/(x[z]-x[i]+0.0))){
                        result = result + 1;
                        if(x[i]==x[j]&&x[i]==x[z]){
                            result = result - 1;
                        }
                    }
                }
            }
        }
        System.out.print(result);
    }

}
