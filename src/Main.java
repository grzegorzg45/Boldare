
public class Main {


    public static void main(String[] args)
    {

        int [] quantity = {1, 3, 5, 10, 20, 200, 100, 100, 10000};

        whatChange(1.30, quantity);
        whatChange(11.70, quantity);
        whatChange(6.70, quantity);
        whatChange(4.30, quantity);

    }

    public static void whatChange(double change, int [] quantity) {
        System.out.println("Dla reszty " + change + " zł:");

        int changeGr = (int) (change * 100);
        int[] nominal = {500, 200, 100, 50, 20, 10, 5, 2, 1};


        for (int i = 0; i < nominal.length; i++)
        {
            int value = changeGr / nominal[i];

            for (int v = value; v>0 ;v--)
               if (v <= quantity[i])
            {
                if(nominal[i]>=100)
                System.out.println("Wydaj " + v + " monet " + (nominal[i] / 100) + " zł");
                else
                    System.out.println("Wydaj " + v + " monet " + (nominal[i]) + " gr");

                changeGr -= v * nominal[i];
                quantity[i] -= v;
                break;
            }
        }

        System.out.println();
    }




}