package ACT4_6;
//import ACT4_1.UtilitatsArrays;
import ACT4_2.UtilitatsMatrius;
import ACT4_3.UtilitatsConsola;
import java.util.ArrayList;
public class ACT4_6_04 {
    static int simbolCuc2 = 1;
    final static int SIMBOL_CAPCUC = 2;
    public static void main(String[] args) {
        int[][] tauler;
        //int[] cuc;
        ArrayList<int[]> cuc = new ArrayList<>();
        final int NTAULER, NFULLES;
        int accio;
        System.out.println("Bienvenido al juego del gusano comehojas, para ganar debes comer todas las hojas posibles pero con cuidado de comerte a ti mismo o perderás, pulsa 0 en cualquier momento para salir del juego.");
        System.out.println();
        NTAULER = UtilitatsConsola.llegirSencer("¿Cuán grande debe ser el tablero de juego? ");
        System.out.println();
        tauler = UtilitatsMatrius.generaMatriu(NTAULER, 0, 0);
        NFULLES = UtilitatsConsola.llegirSencer("¿Cuántas hojas debería haber en el tablero? ");
        System.out.println();
        //cuc = UtilitatsArrays.generaArray(2, 0, tauler.length-1);    
        UtilitatsTauler.emplenaTauler4(tauler, cuc, NFULLES);
        do{
            UtilitatsMatrius.mostraMatriu(tauler);
            accio = UtilitatsConsola.llegirSencer("Puntuación = " + cuc.size() + " | 2 = Abajo | 4 = Izquierda | 6 = Derecha | 8 = Arriba | 0 = Salir del juego -> ");
            System.out.println();
            if(accio == 2 || accio == 4 || accio == 6 || accio == 8){
                UtilitatsTauler.cambiaPosicio4(tauler, cuc, accio);
                accio = (simbolCuc2 == 0 ? 0 : accio);
            }
            if(cuc.size() == NTAULER*NTAULER - NFULLES){
                System.out.println("Venciste.");
                accio = 0;
            }
        }
        while(accio != 0);
    }
}