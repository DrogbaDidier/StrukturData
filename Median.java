
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kevin
 */
public class Median {
  static void header(String header){
        System.out.println(header); 
    }

    static int[] sorting(int data[]) {
        int a;
        for(int i=0; i<data.length-1; i++){             
            for(int j=data.length-1; j>i; j--){
                if(data[j-1]>data[j]){
                    a = data[j];   
                    data[j] = data[j-1];
                    data[j-1] = a;
                }
            }
        }
        return data;
    }

    static double median(int data[]){
        double median=0.0;
        data = sorting(data);
        if(data.length % 2 == 1)
            median = data[data.length/2];
        else
            median = ((double)(data[data.length/2] + data[(data.length/2)-1])) / 2;
        return median;
    }

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        int data[] = new int[0];
        System.out.print("Masukkan jumlah data: ");
        int jmlh = masukan.nextInt();
        data = new int[jmlh];
        for(int i=0; i<data.length; i++){
            System.out.print("Masukkan data ke-"+(i+1)+": ");
            data[i] = masukan.nextInt();
        }

        System.out.println("Nilai median  = "+median(data));
    }
}