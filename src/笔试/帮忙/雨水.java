package ����.��æ;
import java.util.*;
public class ��ˮ {
    public static void main(String[] args) {
        int [] arr ={12,0,2,0,3,1,2,0,2,1,4,2,1};
        System.out.println(trap(arr,arr.length));
    }


      public static   int trap(int heights[], int n) {
        int maxhigh=0;
        int left=0,right=0;
        for(int i=0;i<n;i++)//�ҵ����ֵ���±�
        {
            if(heights[i]>heights[maxhigh])
                maxhigh=i;
        }
        int sum=0;
        for(int i=0;i<maxhigh;i++)//������ߵ�����
        {
            if(heights[i]<left)
                sum+=(left-heights[i]);
            else
                left=heights[i];
        }

        for(int j=n-1;j>maxhigh;j--)//�����ұߵ�����
        {
            if(heights[j]<right)
                sum+=(right-heights[j]);
            else
                right=heights[j];
        }
        return sum;
    }

}
