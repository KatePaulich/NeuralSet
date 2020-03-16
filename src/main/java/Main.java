import java.io.IOException;
import java.util.Scanner;

public class Main {
    static double kolString;
    static double kolColumn;
    static double kolFlag;
    static double startCell;
    static double passCell;
    static double kolClasses;
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите данные для считывания");

        System.out.println("Введите количество строк");
        kolString = in.nextDouble();
        System.out.println("Введите количество столбцов");
        kolColumn= in.nextDouble();
        System.out.println("Введите количество признаков");
        kolFlag= in.nextDouble();
        System.out.println("Введите начальную ячейку");
        startCell= in.nextDouble();
        System.out.println("Введите количество ячееек, которые нужно пропустить");
        passCell= in.nextDouble();
        System.out.println("Введите количество классов");
        kolClasses = in.nextDouble();
        in.close();

        Parser.parse();
        Normalize.normalize();
        WeightCoef.coefStart();
        CountEuclid.count();
        Result.find();
    }
}



