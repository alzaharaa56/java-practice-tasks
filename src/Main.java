import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     //   System.out.println((cigarParty(30,false)));
      //  System.out.println((cigarParty(50,false)));
      //  System.out.println((cigarParty(70,true)));

//System.out.println(Task2.caughtSpeeding(60,false));
       // System.out.println(Task2.caughtSpeeding(65,false));
        //System.out.println(Task2.caughtSpeeding(65,true));

       // System.out.println(Task3.love6(6, 4));
      //  System.out.println(Task3.love6(4, 5));
       // System.out.println(Task3.love6(1, 5));

        //System.out.println(Task4.more20(20));
       // System.out.println(Task4.more20(21));
       // System.out.println(Task4.more20(22));

       // System.out.println(Task5.nearTen(12));
       // System.out.println(Task5.nearTen(17));
       // System.out.println(Task5.nearTen(19));

       // System.out.println(Task6.teaParty(6, 8));
       // System.out.println(Task6.teaParty(3, 8));
       // System.out.println(Task6.teaParty(20, 6));

       // System.out.println(Task7.twoAsOne(1, 2, 3));
        //System.out.println(Task7.twoAsOne(3, 1, 2));
       // System.out.println(Task7.twoAsOne(3, 2, 2));

       // System.out.println(Task8.lastDigit(23, 19, 13));
       // System.out.println(Task8.lastDigit(23, 19, 12));
        //System.out.println(Task8.lastDigit(23, 19, 3));

      //  System.out.println(Task9.maxMod5(2, 3));
        //System.out.println(Task9.maxMod5(6, 2));
        //System.out.println(Task9.maxMod5(3, 2));


        Scanner scanner = new Scanner(System.in);
       // System.out.println("(blueTicket) ");
      //  System.out.print(" a: ");
        //int a = scanner.nextInt();
       // System.out.print(" b: ");
       // int b = scanner.nextInt();
       // System.out.print("c: ");
       // int c = scanner.nextInt();

       // System.out.println( Task10.blueTicket(a, b, c));
       // System.out.println(" enter the value");
      //  System.out.print("enter the value from (0-10): ");

       // int myStyle = scanner.nextInt();
       // System.out.print(" (0-10): ");
        //int dateStyle = scanner.nextInt();

        //System.out.println(": " + Task11.dateFashion(myStyle, dateStyle));


      //  System.out.println("sortaSum");
      //  System.out.print("enter num1 ");
       // int num1 = scanner.nextInt();
        //System.out.print("enter num2");
        //int num2 = scanner.nextInt();

        //System.out.println("" + Task12.sortaSum(num1, num2));

        System.out.println(" (in1To10)");
        System.out.print("enter unm: ");
        int n = scanner.nextInt();
        System.out.print("choose(true/false): ");
        boolean mode = scanner.nextBoolean();

        System.out.println("output"+ " " + Task13.in1To10(n, mode));


    }

        public static boolean cigarParty(int cigars, boolean isWeekend){

        if (isWeekend){

            return cigars >= 40;

        }
        return (cigars >= 40 && cigars <= 60);
    }}