import java.util.ArrayList;
import java.util.Collections;

 class CountEuclid {
    static double V = 0.3; // скорость обучения
    static int q = 1;

    static void count(){
        for (int i1 = 0; i1 < Normalize.arrNorm.length; i1++) {
            countInTable(i1);
        }

        for (int i =0; i< WeightCoef.arrWeightCoef.length; i++){
            for (int j =0; j< WeightCoef.arrWeightCoef[i].length; j++){
                System.out.println(i +" " +" "+j+ " result" +WeightCoef.arrWeightCoef[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

   private static void countInTable( int i1) {
        ArrayList<Double> arrMinMax = new ArrayList<Double>();

        double r = 0;
        double result = 0;
        double bet = 0;

        double min ;

        double wNew = 0;

        double kol = 0;
        double kolNew = 0;

        while (kol< Main.kolClasses){
            findMin(i1,kol,bet,result,r,arrMinMax);
            kol++;
        }

        min = Collections.min(arrMinMax);
        kolNew = arrMinMax.indexOf(min);

        for (int j1 = 0; j1 < Normalize.arrNorm[i1].length; j1++) {
            for (int j = 0; j < WeightCoef.arrWeightCoef[(int) kolNew].length; j++) {
                wNew = Double.parseDouble(String.format("%.2f",
                        Math.pow(WeightCoef.arrWeightCoef[(int) kolNew][j], q) +
                        V * (Normalize.arrNorm[i1][j1] - Math.pow(WeightCoef.arrWeightCoef[(int) kolNew][j], q)))
                        .replace(",", "."));
                WeightCoef.arrWeightCoef[(int) kolNew][j] = wNew;
                if (j1 < Normalize.arrNorm[i1].length) {
                    j1++;
                }
            }
        }
        arrMinMax.clear();
    }

    private static void findMin(int i1, double kol, double bet, double result, double r, ArrayList<Double> arrMinMax) {
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

