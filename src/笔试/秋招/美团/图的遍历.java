package 笔试.秋招.美团;

import java.util.*;
public class 图的遍历 {
    public static class Node {
        private int  start;
        private int end;
        private int count;

        public Node(int start, int end, int count) {
            this.start = start;
            this.end = end;
            this.count = count;
        }
    }
    public static class startComparator implements Comparator<Node> {

        @Override
        public int compare(Node o1, Node o2) {
            if (o1.start==o2.start){
                return o1.end-o2.end;
            }
            return o1.start - o2.start;
        }

    }

    public static class countComparator implements Comparator<Node> {

        @Override
        public int compare(Node o1, Node o2) {
            return o2.count - o1.count;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            ArrayList<Node> al= new ArrayList<>();
//            Node[] nodes = new Node[n];
            for (int i=0;i<n-1;i++){
                int x=sc.nextInt();
                int y=sc.nextInt();
                Node node =new Node(x,y,1);
                al.add(node);
//                nodes[i]=node;
            }
//            Arrays.sort(nodes,new startComparator());
            al.sort(new startComparator());
            int len=al.size();
            ArrayList<Node> res= new ArrayList<>();
            res.add(al.get(0));
            int tag=0;
            for (int i=1;i<al.size();i++){
                if (al.get(i).start==res.get(tag).end){
                    res.get(tag).count+=1;
                    res.get(tag).end=al.get(i).end;
                }else if (al.get(i).end==res.get(tag).end){
                    res.get(tag).count+=1;
                    res.get(tag).end=al.get(i).start;
                } else {
                    res.add(al.get(i));
                    tag++;
                }
            }
            res.sort(new countComparator());
            long anser=res.get(0).count;
            for (int i=1;i<res.size();i++){
                anser+=res.get(i).count*2;
            }
            System.out.println(anser);

        }

    }
}
