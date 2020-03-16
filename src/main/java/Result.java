import java.util.ArrayList;
import java.util.Collections;

class Result {
    static void find(){
        for (int i1 = 0; i1 < Normalize.arrNorm.length; i1++) {
            findResult(i1);
        }
    }
    private static void findResult(int i1){
        ArrayList<Double> arrMinMax = new ArrayList<Double>();
        double r = 0;
        double result = 0;
        double bet = 0;
        double min ;
        double kol = 0;
        double kolBest = 0;
        while (kol< Main.kolClasses){
            findMin(i1,kol,bet,result,r,arrMinMax);
            kol++;
        }
        min = Collections.min(arrMinMax);
        kolBest = arrMinMax.indexOf(min);
        if (min == arrMinMax.get((int) kolBest)){
            System.out.println(kolBest+1 +" класс" + i1);
        }
        arrMinMax.clear();
    }

    private static void findMin(int i1, double kol, double bet, double result, double r, ArrayList<Double> arrMinMax ) {
        for (int j1 = 0; j1 < Normalize.arrNorm[i1].length; j1++) {
            for (int j = 0; j < WeightCoef.arrWeightCoef[(int) kol].length; j++) {
                bet = Double.parseDouble(String.format("%.2f", Math.pow((Normalize.arrNorm[i1][j1]
                        - WeightCoef.arrWeightCoef[(int) kol][j]), 2)).replace(",", "."));
                result = result + bet;
                if (j1 < Normalize.arrNorm[i1].length) {
                    j1++;
                }
            }
        }
        r = Double.parseDouble(String.format("%.2f", Math.sqrt(result)).replace(",", "."));
        arrMinMax.add(r);
    }
}


