package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Elevage mon_elevage = new Elevage();

        mon_elevage.add_volaille(new Poulet(0.5, 1));
        mon_elevage.add_volaille(new Poulet(0.7, 2));
        mon_elevage.add_volaille(new Poulet(1.2, 3));

        mon_elevage.add_volaille(new Canard(0.6, 1));
        mon_elevage.add_volaille(new Canard(1.1, 2));
        mon_elevage.add_volaille(new Canard(1.0, 3));

        System.out.println("Saisissez le prix au kilo d'un poulet : ");
        Poulet.update_prix_kilo(scan.nextDouble());
        System.out.println("Saisissez le poids d'abattage en kilo d'un poulet : ");
        Poulet.set_poids_abattage(scan.nextDouble());



        System.out.println("Saisissez le prix au kilo d'un canard : ");
        Canard.update_prix_kilo(scan.nextDouble());
        System.out.println("Saisissez le poids d'abattage en kilo d'un canard : ");
        Canard.set_poids_abattage(scan.nextDouble());


        System.out.println("Les volailles à abattre vont raporter : " + mon_elevage.evaluer_abattage() + "€ !");
        System.out.println("Les volailles à abattre sont : " + mon_elevage.abattre_volailles());



    }
}