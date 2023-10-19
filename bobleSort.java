import java.util.Scanner;

public class bobleSort {

    public static void main(String[] args) {

        // boble sort= kabarcık sıralaması demektir
        // en büyük değeri bulup en sona taşır
        // iç içe iki for döngüsü mevcuttur... while ile de yapılabilir...


        // Exercise: Sort the following input sequence:  30, 1, 4, 9, 16, 3, 2
        //Start: 30, 1, 4, 9, 16, 3, 2 // Initial array
        //– (What are the outputs of Iteration 1 and Iteration
        //2?)
        //– Iteration1: 1, 4, 9, 16, 3, 2, 30
        //
        //– Iteration2: 1, 4, 9, 3, 2, 16, 30
        //
        // Iteration3: 1, 4, 3, 2, 9, 16, 30
        //
        // Iteratıon4: 1, 3, 2, 4, 9, 16, 30
        //
        // Iteratıon5: 1, 2, 3, 4, 9, 16, 30


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


        new bobleSort(dizi,n);

        System.out.println("\nboble sort ile sıralama işlemi yapıldı");

        for (int i = 0; i < dizi.length; i++) {
            System.out.print( dizi[i] + " ");

        }

    }

    public bobleSort(int[] dizi, int n) {

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {

                if (dizi[j] > dizi[j+1]){

                    int geciciDeger=dizi[j];
                    dizi[j]=dizi[j+1];
                    dizi[j+1]=geciciDeger;

                }

            }

        }
    }
}
