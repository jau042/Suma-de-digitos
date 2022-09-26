package suma.de.digitos;

import java.util.Scanner;

public class SumaDeDigitos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a = leer.nextInt();
        for (int i = 0; i < a; i++) {
            int sum = 0;
            int b = leer.nextInt();
            String c = b + "";
            for (int j = 0; j < c.length(); j++) {
                char d = c.charAt(j);
                switch (d) {
                    case '1':sum += 1;break;
                    case '2':sum += 2;break;
                    case '3':sum += 3;break;
                    case '4':sum += 4;break;
                    case '5':sum += 5;break;
                    case '6':sum += 6;break;
                    case '7':sum += 7;break;
                    case '8':sum += 8;break;
                    case '9':sum += 9;break;
                    case '0':sum += 0;break;
                }
            }
            System.out.println(sum);
        }
    }
}
