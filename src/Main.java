//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println((cigarParty(30,false)));
        System.out.println((cigarParty(50,false)));
        System.out.println((cigarParty(70,true)));



    }

        public static boolean cigarParty(int cigars, boolean isWeekend){

        if (isWeekend){

            return cigars >= 40;

        }
        return (cigars >= 40 && cigars <= 60);
    }}