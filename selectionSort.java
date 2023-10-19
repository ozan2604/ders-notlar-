import java.util.Scanner;

public class selectionSort {


    public static void main(String[] args) {

        // selection sort : seçmeli sıralama en küçük sayıyı bul başa taşı!
        // mantık şu en baştaki sayıyı seçiyor daha sonra o sayıyı hepsiyle kıyaslıyor
        // kıyasladığı sayılardan en küçüğü hangisiyse onunla yer değişiyor

        // örnek: 7 3 5 1 2  önce  0.indisi hepsiyle kıyaslıyor en küçük 1 olduğu için direk onla yer değişiyor..
        //Iteration1: 1 3 5 7 2    0. indis bitti şimdi 1. indis tek tek kıyaslaıyor..
        //I 2:  1 2 5 7 3          1. indis bitti şimdi 2. indis tek tek kıyaslaıyor..
        //I 3:  1 2 3 7 5          2. indis bitti şimdi 3. indis tek tek kıyaslaıyor..
        //I 4:  1 2 3 5 7          3. indis bitti şimdi 4. indis en buyuk deger oldugu için artık burda biter....


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

        new selectionSort(dizi,n);

        System.out.println("\nselection sort ile sıralandı");


        for (int i = 0; i < n; i++) {
            System.out.print( dizi[i] + " ");

        }
    }

    public selectionSort(int[] dizi, int n) {

        for (int i = 0; i < n-1; i++) {

            int min=i;

            for (int j = i; j < n ; j++) {
                if (dizi[min]> dizi[j])
                    min=j;
            }

            int temp= dizi[min];
            dizi[min]=dizi[i];
            dizi[i]=temp;

        }
    }
}
