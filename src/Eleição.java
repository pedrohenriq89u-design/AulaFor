package PACKAGE_NAME;

public class Eleição {
   static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Quantas Pessoas iram votar?");
        int oi = sc.nextInt();
        IO.println(" Candidatos:");
        IO.println("1- João");
        IO.println("2- Maria");
        for (int i = 1; i <= oi; i++) {
            IO.println("Digite");
            int ai = sc.nextInt();

            {

                if (ai == 1) {
                   IO.println("João teve " + ai + " voto");
                }else {
                    IO.println("Maria teve" + ai + " voto");
                }
            }

                //for (int i = 1; i <= oi; i++) ;
                {

                }
            }

        
}
