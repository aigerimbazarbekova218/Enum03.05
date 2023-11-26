import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Oblasts oblasts=Oblasts.valueOf(scanner.nextLine());
        switch (oblasts){
            case CHUI:
                Oblasts.CHUI.method();
                break;
            case NARYN:
                Oblasts.NARYN.method();
                break;
            case JALALABAD:
                Oblasts.JALALABAD.method();
                break;
            case YSYKKOL:
                Oblasts.YSYKKOL.method();
                break;
            case TALAS:
                Oblasts.TALAS.method();
                break;
            case OSH:
                Oblasts.OSH.method();
                break;
            case BATKEN:
                Oblasts.BATKEN.method();
                break;
        }





    }
}