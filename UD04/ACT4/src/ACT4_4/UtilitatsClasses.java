package ACT4_4;
import java.util.ArrayList;
public class UtilitatsClasses {     
    public static void mostrarArrayList(ArrayList<Integer> array) {
        System.out.print("[ ");
        for (Integer a : array) {
            System.out.print(a + " ");
        }
        System.out.println("]");
    }
    //Lo mismo pero para Strings
    public static void mostrarArrayListCadena(ArrayList<String> array) {
        System.out.print("[ ");
        for (String a : array) {
            System.out.print(a + " ");
        }
        System.out.println("]");
    }

    /**
     * Crear un ArraList 
     *      s'avalua cada element de l'array en l'ArrayList
     * @return ArrayList 
     */    
    public static ArrayList<Integer> mostrarDiferents(int[] array){
        ArrayList<Integer> desiguales = new ArrayList<Integer>();
        for(Integer a : array){
            if (! desiguales.contains(a)){
                desiguales.add(a);
            }
        }
        return desiguales;
    }
    /**
    * Crear un ArraList 
    *      s'avalua cada element de l'array en l'ArrayList
    *      si l'ArrayList es manté ordenat es poden estalviar 
    *      moltes lectures
    * @return ArrayList ordenat
    */
    public static ArrayList<Integer> mostrarDiferentsMillorat(int[] array) {
        ArrayList<Integer> resultat = new ArrayList<>();
        
        resultat.add(array[0]);
        for (int a : array) {
            int i = 0;
            boolean trobat = false;
            
            for (Integer r : resultat) {
                if( r == a) { // trobat, no cal insertar
                    trobat = true;
                    break;
                } else if (r > a) // no trobat, ni es trobarà si l'ArrayList es manté ordenat, cal insertar
                    break;
                else // seguir cercant
                    i++;
            }
            if (!trobat) // afegir 'a' en la posició 'i' per mantenir l'ArrayList ordenat
                resultat.add(i,a);
        }
        return resultat;
    }
    
}