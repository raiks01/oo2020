import java.util.Arrays; 

public class V6 {

    public static void main(String[] args) {
        //Array ja selle pikkus 1.osa
        System.out.println("Esimene osa:");
        int[] arr = {5, 98, 56, 34, 7, 9, 21, 77, 0, -6, -20, 154};
        int count = arr.length;

        //Sorteerib ja prindib array kasvavas järjekorras.
        Arrays.sort(arr);
        System.out.print("[");
        for (int i = 0; i < count - 1; i++) {
            System.out.print(arr[i] + ", ");
        }

        int smallest = arr[0];
        int biggest = arr[count - 1];

        //prindib array viimase liikme, massiivi väikseima ja suurima väärtuse, tühja rea.
        System.out.print(arr[count - 1]);
        System.out.println("]");
        System.out.println("Array väikseim väärtus on: " + smallest);
        System.out.println("Array suurim väärtus on: " + biggest);
        System.out.println();

        //% väiksemad arvud 2. osa
        System.out.println("Teine osa:");
        int esimene = count * 1/4; //25%
        int teine = count * 1/2; //50%
        int kolmas = count * 3/4; //75%
        int[] arr2 = {arr[esimene], arr[teine], arr[kolmas], smallest, biggest};
        System.out.println("Väikseim väärtus on: "+arr2[3] + ", arv millest 25% väiksemad arvud on "+ arr2[0] + ", arv millest 50% väiksemad arvud on " + arr2[1] + ", arv millest 75% väiksemad arvud on " + arr2[2] + ", Suurim väärtus on: "+ arr2[4] + ".");
    }
}