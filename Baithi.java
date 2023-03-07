import java.util.Arrays;
import java.util.Scanner;

public class Baithi {
    public static void main(String[] args) {
        int size =20;
        int arr[];
//        int tempArr[];
        int choice, temp;
        int sum1 = 0, sumPrime = 0;
        int count=0;
        int count1 = 0;
        int count2 = 0;
        int max = 0, min = 0;
        int minIdx;
        boolean checkPrime;

//        boolean check = false;
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        arr = new int[100];


        do {
            System.out.println("****************HACKATHON-JAVA-BASIC-1-MENU***************");
            System.out.println();
            System.out.println("1.Nhap gia tri phan tu mang");
            System.out.println("2.Hien thi cac gia tri phan tu mang");
            System.out.println("3.In ra cac phan tu le va tinh tong");
            System.out.println("4.In gia tri max, min cac phan tu trong mang");
            System.out.println("5.Thông kê số lượng các phần tử chia hết cho 2 và 3");
            System.out.println("6.In ra mảng đảo ngược");
            System.out.println("7.In ra các phần tử là số nguyên tố trong mảng và tính tổng");
            System.out.println("8.Sắp xếp mảng tăng dần");
            System.out.println("9.Thoat");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    do {
                        System.out.println("Nhập độ dài mảng:");
                        size = sc.nextInt();
                        if (size > 100)
                            System.out.println("Độ dài yêu cầu nhỏ hơn 100!");
                    } while (size > 100);
                    int i = 0;
                    while (i < size) {
                        System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
                        arr[i] = sc.nextInt();
                        i++;
                    }
                    break;
                case 2:
                    System.out.printf("%-20s%s", "Các phần tử trong mảng:", "");
                    for (int j = 0; j < size; j++) {
                        System.out.print(arr[j] + "\t");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.printf("%-20s%s", "Các phần tử trong mảng:", "");
                    for (int j = 0; j < size; j++) {
                        System.out.print(arr[j] + "\t");
                    }
                    System.out.println();
                    System.out.println("Cac so le la: " );

                    for (int j = 0; j < size; j++) {
                        if (arr[j] % 2 != 0) {
                            System.out.print(arr[j] + " ");
                            sum1 += arr[j];
                        }
                    }
                    System.out.println();
                    System.out.println("Tong cac so le la: " + sum1);
                    System.out.println();
                    break;

                case 4:
                    min = arr[0];

                    for (int j = 0; j < size; j++) {
                        if (arr[j] < min) {
                            min = arr[j];
                        }
                        if (arr[j] > max) {
                            max = arr[j];
                        }
                    }

                    System.out.printf("%-20s%s", "Các phần tử trong mảng:", "");
                    for (int j = 0; j < size; j++) {
                        System.out.print(arr[j] + "\t");
                    }
                    System.out.println();
                    System.out.println("Gia tri lon nhat la: " + max);
                    System.out.println("Gia tri nho nhat la: " + min);
                    System.out.println();

                    break;

                case 5:
                    for (int j=0;j<size;j++) {
                        if(arr[j]%2==0) {
                            count1++;
                        }
                        if (arr[j]%3==0) {
                            count2++;
                        }
                        if (arr[j]%6==0){
                            count++;
                        }
                    }

                    System.out.printf("%-20s%s", "Các phần tử trong mảng:", "");
                    for (int j = 0; j < size; j++) {
                        System.out.print(arr[j] + "\t");
                    }
                    System.out.println();
                    System.out.println("Số lượng phần tử chia hết cho 2 là: " + count1);
                    System.out.println("Số lượng phần tử chia hết cho 3 là: " + count2);
                    System.out.println("Số lượng phần tử chia hết cho cả 2 và 3 là: " + count);
                    System.out.println();

                    break;

                case 6:
                    System.out.printf("%-20s%s", "Các phần tử trong mảng trước khi đảo:", "");
                    for (int j = 0; j < size; j++) {
                        System.out.print(arr[j] + "\t");
                    }
                    System.out.println();
                    for (int j = 0; j < size / 2; j++) {
                        temp = arr[j];
                        arr[j] = arr[size - 1 - j];
                        arr[size - 1 - j] = temp;
                    }
                    System.out.printf("%-20s%s", "Các phần tử trong mảng sau khi đảo:", "");
                    for (int j = 0; j < size; j++) {
                        System.out.print(arr[j] + "\t");
                    }
                    System.out.println();

                    break;

                case 7:
                    System.out.printf("%-20s%s", "Các phần tử trong mảng :", "");
                    for (int j = 0; j < size; j++) {
                        System.out.print(arr[j] + "\t");
                    }
                    System.out.println();
                    System.out.println("Các số nguyên tố trong mảng là: ");
                    for (int j = 0; j < size; j++) {
                        checkPrime = true;
                        if (arr[j] == 2) {
                            checkPrime = true;
                        } else if (arr[j] > 1) {
                            for (int k = 2; k < arr[j]; k++) {
                                if (arr[j] % k == 0) {
                                    checkPrime = false;
                                }
                            }
                        } else {
                            checkPrime = false;
                        }
                        if (checkPrime) {
                            sumPrime += arr[j];
                            System.out.print(arr[j] + " ");
                        }
                    }
                    System.out.println();
                    System.out.println("Tổng giá trị các số nguyên tố trong mảng là: " + sumPrime);
                    System.out.println();

                    break;

                case 8:
                    System.out.printf("%-20s%s", "Các phần tử trong mảng :", "");
                    for (int j = 0; j < size; j++) {
                        System.out.print(arr[j] + "\t");
                    }
                    System.out.println();
                    for (int k = 0; k < size - 1; k++) {
                        minIdx = k;
                        for (int j = k + 1; j < size; j++) {
                            if (arr[j] < arr[minIdx]) {
                                minIdx = j;
                            }
                        }
                        temp = arr[k];
                        arr[k] = arr[minIdx];
                        arr[minIdx] = temp;
                    }
                    System.out.printf("%-20s%s", "Các phần tử trong mảng theo thứ tự tăng dần:", "");
                    for (int j = 0; j < size; j++) {
                        System.out.print(arr[j] + "\t");
                    }
                    System.out.println();

                    break;

                default:
                    System.out.println("Tạm biệt");
                    cont = false;
//                    System.exit(0);

            }
            } while (cont);


    }
}
