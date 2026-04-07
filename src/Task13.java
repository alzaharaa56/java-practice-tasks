public class Task13 {
    public static boolean in1To10(int n, boolean outsideMode) {

if (outsideMode) {
return (n <= 1 || n >= 10);
}

return (n >= 1 && n <= 10);
    }
}
