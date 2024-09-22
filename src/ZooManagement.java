//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";
    public static void main(String[] args) {
        ZooManagement zooManagement = new ZooManagement();


        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre :");
        int nbrCages1 = sc.nextInt();
        System.out.println("Veuillez saisir un mot :");
        String zooName1 = sc.next();
        sc.close();

        ZooManagement zooManagement1 = new ZooManagement();
        zooManagement1.nbrCages = nbrCages1;
        zooManagement1.zooName = zooName1;
        System.out.println(zooManagement1.zooName + " Comporte " + zooManagement1.nbrCages + " cages");







        System.out.println(zooManagement.zooName + " Comporte " + zooManagement.nbrCages + " cages");

        System.out.println(zooName1 + " Comporte " + nbrCages1 + " cages");
          Animal lion =new Animal("lions","mooo",25);
          Zoo MyZoo=new Zoo("saf","sfax",50);
          MyZoo.animals[MyZoo.animals.length-1]=lion;
        System.out.printf(lion.toString());





    }
}
