package �����.����;

public class ���� {
    public static void main(String[] args) {
        int [] a =new int [168];
        int j;
        int k=0;
        for (int i = 2; i <= 1000; i++) {
            j = 2;
            while (i % j != 0) {
                j++;
            }
            if (j == i) {
                a[k]=i;
                k++;
            }
        }

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }

    }
}
