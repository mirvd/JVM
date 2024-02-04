package ru.netology;


public class JvmComprehension {// В  Metaspace создается информация о классе

    public static void main(String[] args) {// в момент вызова метода создается его  фрейм в стеке
        int i = 1;                      // 1 в фрейм метода main создается переменная i со значением 1
        Object o = new Object();        // 2 в куче создается объект Object и в фрейме создается переменная о с cсылкой на Object
        Integer ii = 2;                 // 3 в куче создается объект Integer со значением 2 и в фрейме создается переменная ii с cсылкой Integer
        printAll(o, i, ii);             // 4 в стеке создается фрейм метода printAll в нем записываются переменные Object o, int i и Integer ii
        System.out.println("finished"); // 7 в стеке создается фрейм println которому передается ссылка на созданный в куче объект String со значением "finished".
        // В ходе работы программы отрабатывает Garbage Collector
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700; // 5 в куче создается объект Integer со значением 700, во фрейме printAll создается переменная uselessVar с ссылкой на этот объект
        System.out.println(o.toString() + i + ii);  // 6 в стеке создается фрейм println в него передаются ссылки на Object o, int i и Integer ii. В стеке созается фрейм toString
    }
}
