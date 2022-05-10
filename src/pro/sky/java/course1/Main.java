package pro.sky.java.course1;

public class Main {
    // Задание 1
    public static void main(String[] args) {
	var box = 5;
	int table = 70;
	byte chair = 120;
	short dog = 10000;
	char wow = '!';
	long l = 548321985L;
	float f = 10.55555f;
	double d = 117.4848417;
	boolean houseIsSafe = dog >= 10;
        System.out.println(houseIsSafe);

    // Задание 2
    float boxerOneWeight = 78.2f;
    float boxerTwoWeight = 82.7f;
    float bothBoxersWeight = boxerOneWeight + boxerTwoWeight;
    float differenceInWeight = boxerTwoWeight - boxerOneWeight;
        System.out.println("Общий вес боксеров " + bothBoxersWeight + " кг.");
        System.out.println("Разница в весе боксеров " + differenceInWeight + " кг.");
    // Задание 3
    short bananas = 80;
    short milk = 105;
    short iceCream = 100;
    short egg = 70;
    long breakfast = (bananas * 5) + (milk * 2) + (iceCream * 2) + (egg * 4);
        System.out.println("Общий вес спортивного завтрака в граммах: " + breakfast);
      int grPerKg = 1000;
      float breakfastInKg = breakfast/(float)grPerKg;
            System.out.println("Общий вес спортивного завтрака в килограммах: " + breakfastInKg);

    // Задание 4
    float looseWeight = 7;
    float loseWeightMax = 0.5f;
    float loseWeightMin = 0.25f;
    float daysInMaxLoosing = looseWeight / loseWeightMax;
    float daysInMinLoosing = looseWeight / loseWeightMin;
    float daysAverage = (daysInMaxLoosing + daysInMinLoosing) / 2;
        System.out.println(daysInMaxLoosing);
        System.out.println(daysInMinLoosing);
        System.out.println(daysAverage);
    // Задание 5
    int Masha = 67760;
    int Denis = 83690;
    int Kristina = 76230;
    float RaisingInPr = 1.1f;
    float MashaNewSalary = Masha * RaisingInPr;
        System.out.println(MashaNewSalary);
    float DenisNewSalary = Denis * RaisingInPr;
        System.out.println(DenisNewSalary);
    float KristinaNewSalary = Kristina * RaisingInPr;
        System.out.println(KristinaNewSalary);

    int MonthInYear = 12;
    int MashaYearSalary = Masha * MonthInYear;
        System.out.println("Старая годовая зарплата Маши " + MashaYearSalary);
    float NewMashaYearSalary = MashaNewSalary * MonthInYear;
        System.out.println("Новая годовая зарплата Маши " + NewMashaYearSalary);
    float MashaDifference = NewMashaYearSalary - MashaYearSalary;
        System.out.println("Разница между зарплатами Маши " + MashaDifference);

    int DenisYearSalary = Denis * MonthInYear;
        System.out.println("Старая годовая зарплата Дениса " + DenisYearSalary);
    float NewDenisYearSalary = DenisNewSalary * MonthInYear;
        System.out.println("Новая годовая зарплата Дениса " + NewDenisYearSalary);
    float DenisDifference = NewDenisYearSalary - DenisYearSalary;
        System.out.println("Разница между зарплатами Дениса " + DenisDifference);

    int KristinaYearSalary = Kristina * MonthInYear;
        System.out.println("Старая годовая зарплата Кристины " + KristinaYearSalary);
    float NewKristinaYearSalary = KristinaNewSalary * MonthInYear;
        System.out.println("Новая годовая зарплата Кристины " + NewKristinaYearSalary);
    float KristinaDifference = NewKristinaYearSalary - KristinaYearSalary;
        System.out.println("Разница между зарплатами Кристины " + KristinaDifference);







    }
}
