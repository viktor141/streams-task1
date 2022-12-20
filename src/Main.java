import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    static List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

    public static void main(String[] args) {
        System.out.print("Функция из Main без использования StreamAPI: ");
        start();
        System.out.println();
        System.out.print("Функция из StreamMain с использованием StreamAPI: ");
        StreamMain.start();
    }

    public static void start(){
        List<Integer> newIntList = new ArrayList<>(intList.size());
        for (int i: intList) {
            if(i > 0 && i % 2 == 0){
                newIntList.add(i);
            }
        }

        newIntList.sort(Comparator.naturalOrder());
        System.out.println(newIntList);
    }
}