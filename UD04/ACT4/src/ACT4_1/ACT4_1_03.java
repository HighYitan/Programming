package ACT4_1;
public class ACT4_1_03 {
    public static void main(String[] args) {
        int[] array = {14, 88, 18, 7, 77, 777};
        System.out.print("Los valores son: ");
        UtilitatsArrays.mostraArray(array);
        System.out.println("La media de todos ellos es: " + UtilitatsArrays.mitjana(array));
    }
}