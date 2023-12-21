package org.example;

public class Canard extends Volaille {
    private static double prix_kilo = 5;
    public static double poids_abattage = 2.1;

    /**
     * Instancie une volaille canard
     */
    public Canard(double poids, int id)
    {
        this.poids = poids;
        this.id = id;
        this.prix = poids*prix_kilo;
    }

    /**
     * Modifie le prix au kilo des canards
     */
    public static void update_prix_kilo(double p)
    {
        prix_kilo = p;
    }

    /**
     * Modifie le poids d'abattage des canards
     */
    public static void set_poids_abattage(double p)
    {
        poids_abattage = p;
    }

    /**
     * Retourne le prix de vente d'un canard
     */
    public double get_prix()
    {
        return this.poids * prix_kilo;
    }

    /**
     * Indique si le canard doit être abattu ou non
     */
    public boolean a_abattre()
    {
        return this.poids >= poids_abattage;
    }
}
