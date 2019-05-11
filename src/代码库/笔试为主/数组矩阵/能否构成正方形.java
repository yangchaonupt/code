package 代码库.笔试为主.数组矩阵;

public class 能否构成正方形 {
    public static void main(String[] args) {
        isSquare(0,1,5,4,1,6,6,5);

//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        int x1,x2,x3,x4,y1,y2,y3,y4;
//        for(int i = 0; i < t; i++){
//            for(int j = 0; j < 4; j++){
//                x1=sc.nextInt();
//                x2=sc.nextInt();
//                x3=sc.nextInt();
//                x4=sc.nextInt();
//                y1=sc.nextInt();
//                y2=sc.nextInt();
//                y3=sc.nextInt();
//                y4=sc.nextInt();
//                isSquare(x1,y1,x2,y2,x3,y3,x4,y4);
//
//            }
//        }

    }
    public static void isSquare(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4){
        //防止四个坐标都相同
        if(x1==x2&&x1==x3){
            System.out.println("No");
            return ;
        }
        int d1=getDistance(x1,y1,x2,y2);
        int d2=getDistance(x1,y1,x3,y3);
        int d3=getDistance(x1,y1,x4,y4);
        if(Math.min(d1,d2)!=Math.min(d1,d3)){
            System.out.println("No");
            return;
        }
        if(d1+d2!=d3&&d1+d3!=d2&&d2+d3!=d1){
            System.out.println("No");
            return;
        }
        int d4=getDistance(x2,y2,x1,y1);
        int d5=getDistance(x2,y2,x3,y3);
        int d6=getDistance(x2,y2,x4,y4);
        if(Math.min(d4,d5)!=Math.min(d4,d6)){
            System.out.println("No");
            return;
        }
        if(d4+d5!=d6&&d4+d6!=d5&&d5+d6!=d4){
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
    public static int getDistance(int x1,int y1,int x2,int y2){
        return (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
    }

}
