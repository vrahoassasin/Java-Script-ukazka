package cv08;

import java.util.Arrays;

public class Matice {
    int[][] prvky;
    Matice(int pocetRadku, int pocetSloupcu){
        if(pocetRadku>0&&pocetSloupcu>0){
          prvky = new int[pocetSloupcu][pocetRadku];
        }
    }
    void generujPrvkyNahodne(int a, int b){
        for(int i=0;i<prvky.length;i++){
            for(int j=0;j<prvky[i].length;j++){
                prvky[i][j] = (int) (a + (Math.random() * (b - a)));
            }
        }    
    }
    String vypis(){
        String text="";
        for(int i=0;i<prvky.length;i++){
            for(int j=0;j<prvky[i].length;j++){
                text += String.format("%6d",prvky[i][j]);
            }
            text+="\n";
        }
        return text;
    }
    int[] dejPrvkyNadHlavniDiagonalou(){
        int p = 0;
        for(int i=0;i<prvky.length;i++){
            for(int j=0;j<prvky[i].length;j++){
              if(j>i){
                p++;
              }
            }  
        }
        int[] pole = new int[p];
        int n=0;
        for(int i=0;i<prvky.length;i++){
            for(int j=0;j<prvky[i].length;j++){
              if(j>i){
                pole[n]=prvky[i][j];
                n++;
              }
            }  
        }
        return pole;
    }
    private Matice dejKopii(){
        Matice kopie = new Matice(prvky[0].length,prvky.length);
        for (int i=0;i<kopie.prvky.length;i++){
            System.arraycopy(prvky[i], 0, kopie.prvky[i], 0, prvky[i].length);
        }
        return kopie;
    }
    private Matice trideni(){
        Matice uloziste = dejKopii();
        int[] ulozisteDocastne = new int [prvky.length];
        int n = 0;
        int m = 1;
        for(int j=0;j<prvky[j].length;j++){
            n=0;
            for(int i=0;i<prvky.length;i++){
                ulozisteDocastne[n]=uloziste.prvky[i][j];
                n++;
            }
            Arrays.sort(ulozisteDocastne);
            if(m==1){
                n = 0;
            }
            else{
                n=prvky[j].length+1;
            }
            for(int i=0;i<prvky.length;i++){
                if(m==1){
                    uloziste.prvky[i][j]=ulozisteDocastne[n];
                    n++;                    
                }
                else{
                    uloziste.prvky[i][j]=ulozisteDocastne[n];
                    n--;  
                }                
            }
            if(m==1){
                m=2;
            }
            else{
                m=1;
            }
        }
        
        return uloziste;
    }
    public Matice dejSetrideneSloupceMatice() {
        Matice kopieMatice = trideni();
        
        
        return kopieMatice;
    }
}
