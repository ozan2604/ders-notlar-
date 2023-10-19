import java.util.Scanner;

public class insertionSort {

    public static void main(String[] args) {

        // eklemeli sıralama demek
        // mantığı şu ilk önce ilk iki değeri kıyaslar küçükse bi geri gelir
        // daha sonra  tane kıyaslanır küçük olanla hep yer degisir

        // ornek: 7 3 5 1 2
        //iteration 1:      [7 3] 5 1 2 -> [3 7] 5 1 2
        //iteration 2:      [3 7 5] 1 2 -> [3 5 7] 1 2
        //iteration 3:      [3 5 7 1] 2 -> [1 3 5 7 ] 2
        //iteration 4:      [1 3 5 7  2] -> [1 2 3 5 7]



        Scanner scan= new Scanner(System.in);
        System.out.println("girmek istediğiniz dizi adet sayısını giriniz");

        int n= scan.nextInt();
        int[] dizi= new int[n];

        for (int i = 0; i < dizi.length ; i++) {
            System.out.print((i+1)+ ". sayı: ");
            dizi[i]=scan.nextInt();
        }

        for (int i = 0; i < dizi.length; i++) {
            System.out.print( dizi[i] + " ");

        }

        new insertionSort(dizi,n);

        System.out.println("\ninsertion sort ile sıralandı");

        for (int i = 0; i < n; i++) {
            System.out.print( dizi[i] + " ");

        }



    }

    public insertionSort(int[] dizi, int n) {

        for (int i = 1; i < n; i++) {

            for (int j = i; j > 0; j--) {
                if (dizi[j]<dizi[j-1]){

                    int temp= dizi[j];
                    dizi[j]=dizi[j-1];
                    dizi[j-1]=temp;
                }


            }

        }
    }
}
