import java.sql.Array;

public class dataStructures {


      static int sum(int a[], int N){
        int sum=0; // it works 1 time

        for (int i = 0; i < N; i++) { // it works N time
            System.out.println(sum+=a[i]);  // it works N time
        }
        return sum; // it works 1time
    }
}
 class main{

     public static void main(String[] args) {

         dataStructures data= new dataStructures();

         int[] a = {1,2,3,4,5,6,7};
         int N=a.length;
         System.out.println("sum: " + data.sum(a,N));



     }
 }
