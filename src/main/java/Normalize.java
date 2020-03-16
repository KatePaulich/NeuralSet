class Normalize {
    static  double [][] arrNorm = new double[(int) Main.kolString ][(int) Main.kolColumn ];

    static void normalize() {
       double val = 0;
       double min = Double.MAX_VALUE;
       double max = Double.MIN_VALUE;
       double[][] arrMinMax = new double[2][(int) Main.kolColumn ];

        for (int i = 0; i < arrMinMax.length; i++) {
            for (int j = 0; j < arrMinMax[i].length; j++) {
                if (i == 0){
                    arrMinMax[i][j] = min;
                }else {
                    arrMinMax[i][j] = max;
                }
            }
        }
        for (int i = 0; i < arrNorm.length; i++) {
            for (int j = 0; j < Parser.arrValue[i].length; j++) {
                System.out.println(Parser.arrValue[i][j]);
                    if (Parser.arrValue[i][j] < arrMinMax[0][j]) {
                        arrMinMax[0][j] = Parser.arrValue[i][j];
                    }
                    if (Parser.arrValue[i][j] > arrMinMax[1][j]) {
                        arrMinMax[1][j] = Parser.arrValue[i][j];
                    }

            }
        }
        for (int i = 0; i < arrNorm.length; i++) {
            for (int j = 0; j < Parser.arrValue[i].length; j++) {
                val = Parser.arrValue[i][j];
                double norm = Double.parseDouble(String.format("%.2f", ((val - arrMinMax[0][j]) / (arrMinMax[1][j]
                        - arrMinMax[0][j]))).replace(",", "."));
                arrNorm[i][j] = norm;
            }
        }
    }
}

