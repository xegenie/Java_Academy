package JavaMission;

/* 
(1) ȭ��� ��ױ��� �켱���� ����, ������ �ݾ��� �� ���� ������ ȭ�� ������ �����Ѵ�.
(2) ȭ�� ������ 50000��, 10000�� 5000��, 1000��, 500��, 100��, 50��, 10��, 5��, 1���� 10���� ������ �ִ�.
(3) �Էµ����ʹ� ����, ���ĺ� ���޾��̸�, ������ �Է��� "QUIT" �̸� �Է��� ������ �����Ѵ�.
(4) ����� ����, ���ĺ� ���޾�, ���κ� �� ȭ�� �ż�, �������� ��ü ȭ�� �ż��� ����Ѵ�.

(�Է�)
���� 623843
���� 728394
���� 432942
���� 942783

(���)
���� ����� ������ ���� ��õ�� õ�� ����� ��� ���ʿ� �ʿ� ���� �Ͽ�
���� 623843 12 2 0 3 1 3 0 4 0 3
���� 728394 14 2 1 3 0 3 1 4 0 4
���� 432942 8 3 0 2 1 4 0 4 0 2
���� 942783 18 4 0 2 1 2 1 3 0 3
��ü ȭ��ż� : 52 13 1 10 3 12 2 15 0 12
 */

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Num9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name[] = new String[4];
        int price[] = new int[4];
        int sum[] = new int[10]; //ȭ����� �迭

        // �̸��� ��� �Է�
        for (int i = 0; i < 4; i++) {
            name[i] = sc.next();
            if (name[i].equals("QUIT")) {
            	System.out.println("���α׷� ����");
            	break;
            }
            price[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("����\t�����\t������\t����\t��õ��\tõ��\t�����\t���\t���ʿ�\t�ʿ�\t����\t�Ͽ�");
        
        for (int i = 0; i < 4; i++) {
            int money = 50000;
            if (name[i].equals("QUIT")) {
            	break;
            }
            System.out.print(name[i] + "\t" + price[i] + "\t");

            for (int j = 0; j < 10; j++) {

                int a = price[i] / money; // ����

                int b[] = new int[10]; // ���� �迭
                b[j] = a;

                price[i] = price[i] % money; // ���� �ݾ�

                if (j % 2 == 0) {
                    money = money / 5;
                } else {
                    money = money / 2;
                }
                System.out.print(a + "\t");

                sum[j] += b[j]; // ���� �迭�� ȭ����� �迭
            
            }
            System.out.println();
        }
        System.out.print("��ü ȭ��ż� : ");
        for (int i = 0; i < sum.length; i++) {
            System.out.print("\t"+sum[i]);
        }

        sc.close();
    }

}