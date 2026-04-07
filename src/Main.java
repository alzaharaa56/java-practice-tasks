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

        System.out.println(Task3.love6(6, 4));
        System.out.println(Task3.love6(4, 5));
        System.out.println(Task3.love6(1, 5));

    }

        public static boolean cigarParty(int cigars, boolean isWeekend){

        if (isWeekend){

            return cigars >= 40;

        }
        return (cigars >= 40 && cigars <= 60);
    }}