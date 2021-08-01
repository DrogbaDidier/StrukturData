
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
public class Modus {
     public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        int [] a;
        System.out.println("Masukkan jumlah data: ");
        int n = input.nextInt();
        a = new int [n];
        System.out.println("Masukkan nilai-nilainya: ");
        for(int i=0;i<n;i++)
        {
            a[i] = input.nextInt();
        }
        
        System.out.print("=========================== \n");
        int c=a[0];
        int b=0;
        int hasil=0,besar=0;
        for (int i=0; i<a.length ;i++)
        {
            if(a[i]==c)
            {
     
                ++b;
                if(b>besar)
                {
                    besar=b;
                    hasil=c;
                }
            }
            else
            {
                c=a[i];
                b=1;
                
            }
        }
        System.out.println("Modus = "+hasil);
    }
}