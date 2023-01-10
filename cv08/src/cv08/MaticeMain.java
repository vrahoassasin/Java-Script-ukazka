package cv08;

import static cv08.PoleVypocty.dejMaxHodnotu;
import static cv08.PoleVypocty.dejMinHodnotu;
import static cv08.PoleVypocty.dejPrumerPrvku;
import java.util.Arrays;

public class MaticeMain {
    public static void main(String[] args) {
        Matice mA = new Matice (4,6);
        mA.generujPrvkyNahodne(-20, 20);
        System.out.println(mA.vypis());
        System.out.println(Arrays.toString(mA.dejPrvkyNadHlavniDiagonalou()));
        
        System.out.println("prrmer prvku nad hlavni diagonalou: "+dejPrumerPrvku(mA.dejPrvkyNadHlavniDiagonalou()));
        System.out.println("Min. hodnota z prvku nad hlavní diagonalou: "+dejMinHodnotu(mA.dejPrvkyNadHlavniDiagonalou()));
        System.out.println("Max. hodnota z prvku nad hlavní diagonalou: "+dejMaxHodnotu(mA.dejPrvkyNadHlavniDiagonalou()));
        
        Matice mAkopie = mA.dejSetrideneSloupceMatice();
        System.out.println(mAkopie.vypis());
    }
}
