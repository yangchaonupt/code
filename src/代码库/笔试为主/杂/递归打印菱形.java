package �����.����Ϊ��.��;

public class �ݹ��ӡ���� {
    public static void main(String[] args) {
        long a1 = System.currentTimeMillis();
        printA(5, true);
        long b1 = System.currentTimeMillis();
        System.out.println("ִ��ʱ��Ϊ " + (b1 - a1) + "����");
        long a = System.currentTimeMillis();
        printB(5, true);
        long b = System.currentTimeMillis();
        System.out.println("ִ��ʱ��Ϊ " + (b - a) + "����");
    }

    public static void  printA(int times, boolean ask) {
        for (int i = 5; i > 0; i--) {
            if (i <= 5 - times + 1)
                System.out.print(" *");
            else
                System.out.print(" ");
        }
        System.out.println("");
        if (times > 1 && ask)
            printA(times - 1, true);
        if (ask)
            printA(times + 1, false);
    }

    public static void printB(int times, boolean ask) {
        for (int i = 5; i > 0; i--) {
            if (i <= 5 - times + 1)
                System.out.print(" *");
            else
                System.out.print(" ");
            if (i == 1)
                System.out.println("");
            if (i == 1 && times > 1 && ask)
                printB(times - 1, true);
            if (i == 1 && ask)
                printB(times + 1, false);
        }
    }
}
