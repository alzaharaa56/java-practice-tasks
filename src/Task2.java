public class Task2 {
    public static int caughtSpeeding(int speed, boolean isBirthday) {

    int allowance = 0;
     if (isBirthday) {
     allowance = 5;
}

 if (speed <= 60 + allowance) {
     return 0;
}       else if (speed <= 80 + allowance) {
           return 1;
}         else {
         return 2;
}
    }
}
