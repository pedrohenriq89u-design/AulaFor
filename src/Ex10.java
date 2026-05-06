package PACKAGE_NAME;

public class Ex10 {
  static void main() {
        Scanner sc = new Scanner(System.in);

        double cont = 0;
        IO.println("Digite suas notas:");
        for (double i = 1; i <=5;i++) {
        double notas = sc.nextInt();
            cont+=notas;

            //IO.println("Sua média é: "+cont/5);

        }

        IO.println("Sua média é: "+cont/5);
    }

}
