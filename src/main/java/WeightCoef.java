class WeightCoef {
    static  double [][] arrWeightCoef = new double[(int) Main.kolClasses][(int) Main.kolFlag];

    static void coefStart(){
        double wMin = Double.valueOf(String.format("%.2f",(0.5 -  1/Math.sqrt(Main.kolFlag)))
                .replace(",","."));
        double wMax = Double.valueOf(String.format("%.2f",(0.5 + 1/Math.sqrt(Main.kolFlag)))
                .replace(",","."));
        for (int i = 0; i < arrWeightCoef.length; i++) {
            for (int j = 0; j < arrWeightCoef[i].length; j++) {
                arrWeightCoef[i][j] =  Double.valueOf(String.format("%.2f", Math.random()*(wMax-wMin)+wMin).
                        replace(",","."));
                }
            }

        for (int i =0; i< arrWeightCoef.length; i++){
            for (int j =0; j< arrWeightCoef[i].length; j++){
                System.out.println(i +" " +" "+j+ " coef " +arrWeightCoef[i][j] + "\t");
            }
        }
    }
}

