package JavaMission;

import java.util.Scanner;

public class Num7 {
	

	//�л� 5���� JAVA ���α׷��� ������ �Է� �޾�, 1���� �迭�� �����ϰ� ������ �������� ��������,
	//������������ ���� ����Ͻÿ�.
	//(��, ���� ����� ��������, ��������, �������� �� �ϳ��� ���� ����� �̿��Ͻÿ�.
	//������ ���� 0�̻� 100���Ϸ� �־����ϴ�.)
	//35 65 75 90 100
	//100 90 75 65 35


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int arr[] = new int[5];

	        // ���� 5�� �Է�

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();

	        }

	        // ������ �������� �������� �ϱ�
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr.length; j++) {
	                if (arr[i] > arr[j]) {
	                    int temp = arr[j];
	                    arr[j] = arr[i];
	                    arr[i] = temp;
	                }
	            }

	        }
	        // ���� ��������!
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr.length; j++) {
	                if (arr[j] > arr[i]) {
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }

	        }

	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }

	        System.out.println();

	        for (int i = arr.length - 1; i >= 0; i--) {
	            System.out.print(arr[i] + " ");

	        }

	    }
	}

