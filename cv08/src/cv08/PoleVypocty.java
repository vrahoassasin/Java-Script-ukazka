package cv08;
public class PoleVypocty {
    static double dejPrumerPrvku(int[] pole){
        int pocet = 0;
        for(int i=0;i<pole.length;i++){
            pocet += pole[i];
        }
    double prumer = (double)pocet/pole.length;
    return prumer;
    }
    static int dejMinHodnotu(int[] pole){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<pole.length;i++){
            if(pole[i]<min){
                min=pole[i];
            }
        }
        return min;
    }
    static int dejMaxHodnotu(int[] pole){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<pole.length;i++){
            if(pole[i]>max){
                max=pole[i];
            }
        }
        return max;
    }
}
