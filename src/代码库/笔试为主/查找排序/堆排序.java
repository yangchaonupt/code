package �����.����Ϊ��.��������;
/* 
 * Javaʵ�ֿ��������㷨 
 * �ɴ�С���� 
 * author:wyr 
 * 2016-7-14 
 *�������裺1������  2���Ը���ѵ����һ��Ԫ�ؽ���λ�� 
 */  
public class ������ {

    public static void main(String[] args) {  
        int a[] = {3,1,5,7,2,4,9,6,10,8};
        //int b[] = {3,1,5,7,2,4,9,6,10,8}; 

        System.out.println("��ʼֵ��");  
        print(a);  
        System.out.println();
        
        System.out.println("�������1��");
        heapSort(a);

        
        
        System.out.println("\n�����");  
        print(a);
  
    } 
    
    
    public static void heapSort(int[] a){
    	for(int i=0;i<a.length;i++){  
            createLittleHeap1(a,a.length-1-i);//������,��������С���ѡ�ÿ��ѭ���꣬�������ĸ��ڵ㶼����Сֵ���������ʱ��δ�źò������һ��ֵ����λ��  
            swap(a, 0, a.length - 1 - i);//�����һ��ֵ����λ�ã���Сֵ�ҵ���λ��   
            System.out.println("�������===");
            print(a);  
            System.out.println();  
              
        }
    	
    	
    	
    }
    /* 
     * ����С���ѣ����ڵ�С���ӽڵ��ֵ����Ҷ�ӽڵ㿪ʼ��ֱ�����ڵ㡣���������ĶѶ�λ��Сֵ 
     */  
    public static void createLittleHeap1(int[] data, int last) { 
    	 System.out.println("���ĵ�������===");
         for (int i = (last- 1) / 2; i >= 0; i--) {  //�ҵ����һ��Ҷ�ӽڵ�ĸ��ڵ�  
        	
                // ���浱ǰ�����жϵĽڵ�    
                int parent = i;    
                // ����ǰ�ڵ�����ӽڵ���ڣ����ӽڵ����  
                while (2 * parent + 1 <= last) {    
                    // smallerIndex���Ǽ�¼��С�ڵ��ֵ,�ȸ�ֵΪ��ǰ�жϽڵ�����ӽڵ�    
                    int smaller = 2 * parent + 1;//smallerָ�����ӽڵ�    
                    if (smaller < last) { //˵���������ӽڵ�  
                        
                        if (data[smaller] > data[smaller+ 1]) { 
                        	smaller=smaller+1;	//�˴�Ӧ������ڵ�����ҽڵ� ,�������Сֵ���±긳��smaller���������������ӽڵ����Сֵ�±�   
                        }    
                    }    
                    if (data[parent] > data[smaller]) {  //���ڵ�ֵ�Ǵ������ӽڵ����С��ֵ��������Сֵ�ĳ�Ϊ���ڵ�
                        // ����ǰ�ڵ�ֵ���ӽڵ���Сֵ���򽻻�2�ߵ�ֵ��������smallerIndexֵ��ֵ��parent   
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
