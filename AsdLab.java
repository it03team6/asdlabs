import java.util.Scanner; // подключим сканер

public class AsdLab {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in); 
        System.out.print("X bin: "); // в 6 и 8 строках попросим ввести значения Х и У в бинарном коде
        String x = line.next();
        System.out.print("Y bin: "); 
        String y = line.next();
        char[] arrayX = x.toCharArray(); // переведем полученые строки в массив символов 
        char[] arrayY = y.toCharArray();
        int z = 0;
        long ResultX = 0;
        long ResultY = 0;



        for (int i = arrayX.length-1;i >= 0; i--) // создадим цикл перевода в десятичную систему счисления(начиная с последнего элемента массива)
        { // длинна-1 необходима т.к первое значения массива 0
            ResultX = ResultX + Character.getNumericValue(arrayX[i]) * Power(2, z); // переведем символы в цифры (т.к при считывании строки программа рассматривала их как символы и присваивала значения исходя из ASCII таблицы)
            z++; // увеличиваем степень и гоним цикл
        }
        z = 0; // вне цикла уже обнулим степень
        for (int i = arrayY.length-1;i >= 0; i--) // такие же действия но с массивом У
        {
            ResultY = ResultY + Character.getNumericValue(arrayY[i]) * Power(2, z);
            z++;
        }

        System.out.println("X: " + ResultX);
        System.out.println("Y: " + ResultY);



        if (ResultX % ResultY == 0) // если остаток от деления Х на У равняется 0
        {
            System.out.print("Ділиться БЕЗ остачі"); 
        }
        else
            {
                System.out.print("Ділиться З остачею"); // ну а если не равняется то выводим это
        }




    }
    public static int Power(int x, int n) // создадим функцию поднесения в степень при использовании рекурсии
    {
        if (n == 0) return 1;

        return x*Power(x, n-1);
    }


}

