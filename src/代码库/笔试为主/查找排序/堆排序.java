package 代码库.笔试为主.查找排序;
/* 
 * Java实现快速排序算法 
 * 由大到小排序 
 * author:wyr 
 * 2016-7-14 
 *两个步骤：1，建堆  2，对根与堆的最后一个元素交换位置 
 */  
public class 堆排序 {

    public static void main(String[] args) {  
        int a[] = {3,1,5,7,2,4,9,6,10,8};
        //int b[] = {3,1,5,7,2,4,9,6,10,8}; 

        System.out.println("初始值：");  
        print(a);  
        System.out.println();
        
        System.out.println("排序过程1：");
        heapSort(a);

        
        
        System.out.println("\n排序后：");  
        print(a);
  
    } 
    
    
    public static void heapSort(int[] a){
    	for(int i=0;i<a.length;i++){  
            createLittleHeap1(a,a.length-1-i);//创建堆,创建的是小根堆。每次循环完，二叉树的根节点都是最小值，所以与此时的未排好部分最后一个值交换位置  
            swap(a, 0, a.length - 1 - i);//与最后一个值交换位置，最小值找到了位置   
            System.out.println("排序过程===");
            print(a);  
            System.out.println();  
              
        }
    	
    	
    	
    }
    /* 
     * 创建小根堆：父节点小于子节点的值。从叶子节点开始，直到根节点。这样建立的堆定位最小值 
     */  
    public static void createLittleHeap1(int[] data, int last) { 
    	 System.out.println("树的调整过程===");
         for (int i = (last- 1) / 2; i >= 0; i--) {  //找到最后一个叶子节点的父节点  
        	
                // 保存当前正在判断的节点    
                int parent = i;    
                // 若当前节点的左子节点存在，即子节点存在  
                while (2 * parent + 1 <= last) {    
                    // smallerIndex总是记录较小节点的值,先赋值为当前判断节点的左子节点    
                    int smaller = 2 * parent + 1;//smaller指向左子节点    
                    if (smaller < last) { //说明存在右子节点  
                        
                        if (data[smaller] > data[smaller+ 1]) { 
                        	smaller=smaller+1;	//此处应该是左节点大于右节点 ,将代表更小值得下标赋给smaller，让它代表两个子节点的最小值下标   
                        }    
                    }    
                    if (data[parent] > data[smaller]) {  //父节点值是大于它子节点的最小的值，则让最小值的成为父节点
                        // 若当前节点值比子节点最小值大，则交换2者得值，交换后将smallerIndex值赋值给parent   
                        swap(data, parent, smaller);    
                        parent = smaller; 
                        
                        print(data);
                        System.out.println();
                    } else {
                    	
                        print(data);
                        System.out.println();
                        break;    
                    }    
                }    
            }    
    }

    public static void print(int a[]){  
        for(int i=0;i<a.length;i++){  
            System.out.print(a[i]+" ");  
        }  
    }  
     public static  void swap(int[] data, int i, int j) { 
    	 
            if (i == j) {    
                return;    
            }
            data[i] = data[i] + data[j];    
            data[j] = data[i] - data[j];    
            data[i] = data[i] - data[j];    
        }    	
	
	
	
}
