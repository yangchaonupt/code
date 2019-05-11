package ´úÂë¿â.±ÊÊÔÎªÖ÷.²éÕÒÅÅĞò;

public class Ã°ÅİÅÅĞò {

    public static void main(String[] args) {
        int a[] = {3,1,5,7,2,4,9,6,10,8};
        System.out.println("³õÊ¼Öµ£º");
        print(a);
        bubbleSort(a);
        System.out.println("ÅÅĞòºó£º");
        print(a);
    }



    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] data){
        int exchange=0;
        for(int i =0 ; i< data.length-1; i++) {
            for(int j = 0; j < data.length-i-1; j++) {
                exchange=0;
                if(data[j] > data[j+1]) {
                    exchange++;
                    int temp = data[j] ;
                    data[j] = data[j+1] ;
                    data[j+1] = temp;
                }
            }
            print(data);
            if(exchange==0){
                break;
            }
        }


    }

}
