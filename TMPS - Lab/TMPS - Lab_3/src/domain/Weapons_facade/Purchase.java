package domain.Weapons_facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Purchase {
    private static int  choice;
    public static void main(String args[]) throws NumberFormatException, IOException{
        do{
            System.out.print("Khajit Merchant \n");
            System.out.print("ONEHANDED.              \n");
            System.out.print("TWOHANDED.              \n");
            System.out.print("ARCHERY.            \n");
            System.out.print("Exit.                     \n");
            System.out.print("Enter your choice: ");

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            Merchant sk=new Merchant();

            switch (choice) {
                case 1:
                {
                    sk.OneHandedSale();
                }
                break;
                case 2:
                {
                    sk.TwoHandedSale();
                }
                break;
                case 3:
                {
                    sk.ArcherySale();
                }
                break;
                default:
                {
                    System.out.println("Khajit got waref, if you got gold.");
                }
                return;
            }

        }while(choice!=4);
    }
}