package 笔试.拼多多;


import java.util.*;
public class 高楼加层 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m=sc.nextInt();
            int n=sc.nextInt();
            int [] a =new int [m];
            for (int i=0;i<m;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            HashMap<Integer,Integer> map= new HashMap<>();
            int maxcout=0;
            for (int i=0;i<m;i++){
                if (map.containsKey(a[i])){
                    map.put(a[i],map.get(a[i])+1);
                }else {
                    map.put(a[i],1);
                }
                if (map.get(a[i])>maxcout){
                    maxcout=map.get(a[i]);
                }
            }
            if (maxcout>=n){
                System.out.println(0);
                break;
            }
            int [][] b =new int [map.size()][2];
            int number=0;
            for (int i=0;i<m;){
                int j=i+1;
                int count =1;
                while (j<m&&a[j]==a[i]){
                    count++;
                    j++;
                }
                b[number][0]=a[i];
                b[number][1]=count;
                i=j;
                number++;
            }
            int minfl=Integer.MAX_VALUE;
            for (int i=0;i<b.length;i++){
                int sum=0;
                for (int j=0;j<=i;j++){
                    sum+=b[j][1];
                }
                if (sum<n){
                    continue;
                }
                sum=n;
                int temp=0;
                sum-=b[i][1];
                while (sum!=0){
                    int jnu=i-1;
                   while (b[jnu][1]<sum){
                       temp+=b[jnu][1]*(b[i][0]- b[jnu][0]);
                       sum-=b[jnu][1];
                       jnu--;

                   }
                    temp+=sum*(b[i][0]- b[jnu][0]);
                   sum=0;

                }
                if (temp<minfl){
                    minfl=temp;
                }
            }
            System.out.println(minfl);

        }

    }
}
