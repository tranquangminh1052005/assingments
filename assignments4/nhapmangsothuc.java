/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignments4;

import java.util.Scanner;


public class nhapmangsothuc {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap kich thuoc cua mang");
        int size=scanner.nextInt();
        float[] array=new float[size];
        
        System.out.println("du lieu trong mang la");
        for (float num : array) {
            System.out.println(num);
        }
    }
    public static void importData(float[] arrays) {
           Scanner scanner= new Scanner(System.in);
           System.out.println("nhap gia tri cho mang");
           for (int i = 0; i < arrays.length; i++) {
               System.out.println("nhap gia tri phan tu thu"+i+":");
               arrays[i]=scanner.nextFloat();
        }
    }
}
