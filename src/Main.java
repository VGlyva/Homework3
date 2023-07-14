// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int stock = 1000000;
        byte basket = 126;
        short box = 23000;
        long bigStock = 1000000000L;
        float superBigStock = 13f;
        double hangar = 10000000000.1;
        System.out.println("Значение переменной с типом int равно " + stock);
        System.out.println("Значание переменной с типом byte равно " + basket);
        System.out.println("Значение переменной с типом short равно " + box);
        System.out.println("Значение переменной с типом long равно " + bigStock);
        System.out.println("Значение переменной с типом float равно " + superBigStock);
        System.out.println("Значение переменной с типом double равно " + hangar);
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задача 2");
        float superBigStock = 27.12f;
        long bigStock = 987678965549L;
        double hangar = 2.786;
        short box = 569;
        short boxTwo = -159;
        short boxThree = 27897;
        byte basket = 67;
        System.out.println(superBigStock);
        System.out.println(bigStock);
        System.out.println(hangar);
        System.out.println(box);
        System.out.println(boxTwo);
        System.out.println(boxThree);
        System.out.println(basket);
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        short student = 80;
        short sheet = 480;
        int oneStudent = sheet / student;
        System.out.println("На каждого ученика расчитано " + oneStudent + " листов бумаги");
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte workBottle = 16;
        byte workTimeOne = 2;
        byte workTimeTwo = 20;
        short workTimeThree = 1440; // за сутки
        short workTimeFour = 4320; // за три дня
        int workTimeFive = 44640; // за месяц
        int oneMinutes = workBottle / workTimeOne;
        int workTimeBottleOne = oneMinutes * workTimeTwo;
        int workTimeBottleTwo = oneMinutes * workTimeThree;
        int workTimeBottleThree = oneMinutes * workTimeFour;
        int workTimeBottleFour = oneMinutes * workTimeFive;
        System.out.println("За " + workTimeTwo + " минут машина произвела " + workTimeBottleOne + " штук бутылок");
        System.out.println("За " + workTimeThree + " минут машина произвела " + workTimeBottleTwo + " штук бутылок");
        System.out.println("За " + workTimeFour + " минут машина произвела " + workTimeBottleThree + " штук бутылок");
        System.out.println("За " + workTimeFive + " минут машина произвела " + workTimeBottleFour + " штук бутылок");
        System.out.println();
    }
    public static void task5() {
        System.out.println("Задача 5");
        short jar = 120;
        byte jarWhite = 2;
        byte jarBrown = 4;
        int oneGroup = jarWhite + jarBrown;
        int totalGroup = jar / oneGroup;
        int groupBrown = totalGroup * jarBrown;
        int groupWhite = totalGroup * jarWhite;
        System.out.println("В школе, где " + totalGroup + " классов нужно " + groupWhite + " банок белой краски и " + groupBrown + " банок коричневой краски");
        System.out.println();
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte bananas = 5;
        byte oneBanana = 80;
        int totalBananas = oneBanana * bananas;
        short milk = 200;
        float oneMlMilk = 1.05f;
        float totalMilk = milk * oneMlMilk;
        byte iceCream = 2;
        byte oneIceCream = 100;
        int totalIceCream = iceCream * oneIceCream;
        byte eggs = 4;
        byte oneEgg = 70;
        int totalEggs = eggs * oneEgg;
        float totalWeightGram = totalBananas + totalMilk + totalIceCream + totalEggs;
        float totalWeightKilo = totalWeightGram / 1000;
        System.out.println("Вес спортзавтрака в граммах равен " + totalWeightGram);
        System.out.println("Вес спортзавтрака в килограммах равен " + totalWeightKilo);
        System.out.println();

    }
    public static void task7() {
        System.out.println("Задача 7");
        byte weightKilo = 7;
        int weightGram = weightKilo * 1000;
        short dietOne = 250;
        short dietTwo = 500;
        int dayDietOne = weightGram / dietOne;
        int dayDietTwo = weightGram / dietTwo;
        int average = (dayDietOne + dayDietTwo) / 2;
        System.out.println("На похудение при первой диете уйдет " + dayDietOne + " дней");
        System.out.println("На похудение при второй диете уйдет " + dayDietTwo + " дней");
        System.out.println("В среднем уйдет на похудение " + average + " день");
        System.out.println();

    }
    public static void task8() {
        System.out.println("Задача 8");
        int monthMasha = 67760;
        int monthDenis = 83690;
        int monthKristina = 76230;
        int yearMasha = monthMasha * 12;
        int yearDenis = monthDenis * 12;
        int yearKristina = monthKristina * 12;
        float increaseMasha = monthMasha / 100f * 10;
        float increaseDenis = monthDenis / 100f * 10;
        float increaseKristina = monthKristina / 100f * 10;
        float newMonthMasha = monthMasha + increaseMasha;
        float newMonthDenis = monthDenis + increaseDenis;
        float newMonthKristina = monthKristina + increaseKristina;
        float newYearMasha = newMonthMasha * 12;
        float newYearDenis = newMonthDenis * 12;
        float newYearKristina = newMonthKristina * 12;
        float differenceYearMasha = newYearMasha - yearMasha;
        float differenceYearDenis = newYearDenis - yearDenis;
        float differenceYearKristina = newYearKristina - yearKristina;
        System.out.println("Маша теперь получает " + newMonthMasha + " рублей. Годовой доход вырос на " + differenceYearMasha + " рублей");
        System.out.println("Денис теперь получает " + newMonthDenis + " рублей. Годовой доход вырос на " + differenceYearDenis + " рублей");
        System.out.println("Кристина теперь получает " + newMonthKristina + " рублей. Годовой доход вырос на " + differenceYearKristina + " рублей");
        System.out.println();

    }
}
