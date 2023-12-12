        
import java.util.Arrays;
import java.util.Scanner;
public class Array2 {
    
    public static int[] arrayi_doldur(int sayi){
        Scanner scanner = new Scanner(System.in);
        int[] cikti = new int[sayi];
        
        for (int i = 0 ; i < sayi ;i++) {
            cikti[i] = scanner.nextInt();
            
        }
        return cikti;
        
        
    }
    public static void arrayi_bastir(int[] array) {
        
        for(int i = 0; i < array.length;i++) {
            System.out.println("Element " + (i+1) + ": " + array[i]);
        }
    }
    public static void array_sort(int [] array) {
        
        // Arrays Sınıfı
        
        Arrays.sort(array);
        arrayi_bastir(array);
        
    }
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array Boyutu: ");
        int size = scanner.nextInt();

        int[] myArray = arrayi_doldur(size);

        System.out.println("Değerler:");
        arrayi_bastir(myArray);

        System.out.println("Sıralanmıs array:");
        array_sort(myArray);
        
        scanner.close();
    }
}