//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int i = -57000000;
        System.out.println("Значение переменной с типом int равно " + i);
        byte b = 120;
        System.out.println("Значение переменной с типом byte равно " + b);
        short s = 32328;
        System.out.println("Значение переменной с типом short равно " + s);
        long l = 32328L;
        System.out.println("Значение переменной с типом long равно " + l);
        float f = 3.4E+3F;
        System.out.println("Значение переменной с типом float равно " + f);
        double d = 37E+30;
        System.out.println("Значение переменной с типом double равно " + d);
        //Задача 2
        float first = 27.12f;
        System.out.println("Первая переменная это float: " + first);
        long second = 987678965549L;
        System.out.println("Вторая переменная это long: " + second);
        float third = 2.786f;
        System.out.println("Третья переменная это float " + third);
        short fourth = 569;
        System.out.println("Четвертая переменная это short: " + fourth);
        short fifth = -159;
        System.out.println("Пятая переменная это short: " + fifth);
        short sixth = 27897;
        System.out.println("Шестая переменная это short: " + sixth);
        byte seventh = 67;
        System.out.println("Седьмая переменная это byte: "+ seventh);
        //Задача 3
        byte ludmPavl = 23;
        byte annSergeev = 27;
        byte ekatAndreev = 30;
        short sumOfSheets = 480;
        int sumOfStudents = ludmPavl+annSergeev+ekatAndreev;
        int numOfSheetsPerStudent = sumOfSheets/sumOfStudents;
        System.out.println("На каждого ученика рассчитано " + numOfSheetsPerStudent + " листов бумаги");
        //Задача 4
        byte prod = 8;
        int set20Prod = prod * 20;
        System.out.println("Продуктивность за 20 минут равна " + set20Prod + " бутылок");
        int setDayProd = prod * (24*60);
        System.out.println("Продуктивность за 1 день равна " + setDayProd + " бутылок");
        int set3DaysProd = setDayProd * 3;
        System.out.println("Продуктивность за 3 дня равна " + set3DaysProd + " бутылок");
        int setMonthProd = set3DaysProd * 10;
        System.out.println("Продуктивность за 1 месяц равна " + setMonthProd + " бутылок");
        //Задача 5
        byte sumPaint = 120;
        byte classNeeds = 6;
        int classTotal = sumPaint/classNeeds;
        int whiteTotal = classTotal * 2;
        int brownTotal = classTotal * 4;
        System.out.println("В школе, где " + classTotal + " классов, нужно " + whiteTotal + " банок белой краски и " + brownTotal + " банок коричневой краски");
        //Задача 6
        int bananaReq = 5*80;
        double milkReq = 200*1.05;
        int iceCreamReq = 2*100;
        int eggReq = 4*70;
        double shakeReqGram = bananaReq + milkReq + iceCreamReq + eggReq;
        double shakeReqKilo = shakeReqGram * 0.001;
        System.out.println("Спортзавтрак в граммах весит " + shakeReqGram + " г. а в килограммах: " + shakeReqKilo + " кг.");
        //Задача 7
        int wLossMin = 250;
        int wLossMax = 500;
        int wLossReq = 7000;
        int wLossSlowest = wLossReq/wLossMin;
        int wLossFastest = wLossReq/wLossMax;
        int wLossMedian = (wLossSlowest + wLossFastest)/2;
        System.out.println( "Скорейшее похудение займет " + wLossFastest + " дней, самое медленное " + wLossSlowest);
        System.out.println( "В среднем похудение займет " + wLossMedian + " день");
        //Задача 8
        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76230;
        float salaryRiseM = salaryM * 1.1f;
        float salaryRiseD = salaryD * 1.1f;
        float salaryRiseK = salaryK * 1.1f;
        float yearlySalaryRiseM = salaryRiseM * 12 - salaryM * 12;
        float yearlySalaryRiseD = salaryRiseD * 12 - salaryD * 12;
        float yearlySalaryRiseK = salaryRiseK * 12 - salaryK * 12;
        System.out.println("Маша теперь получает " + salaryRiseM + " рублей. Годовой доход вырос на " + yearlySalaryRiseM + " рублей");
        System.out.println("Денис теперь получает " + salaryRiseD + " рублей. Годовой доход вырос на " + yearlySalaryRiseD  + " рублей");
        System.out.println("Кристина теперь получает " + salaryRiseK + " рубля. Годовой доход вырос на " + yearlySalaryRiseK + " рублей");








        }
    }