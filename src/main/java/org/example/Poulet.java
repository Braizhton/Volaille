package org.example;

public class Poulet extends Volaille {
    private static double prix_kilo = 12;
    public static double poids_abattage = 2;

    /**
     * Instancie une volaille poulet
     */
    public Poulet(double poids, int id)
    {
        this.poids = poids;
        this.id = id;
        this.prix = poids*prix_kilo;
    }

    /**
     * Modifie le prix au kilo des poulets
     */
    public static void update_prix_kilo(double p)
    {
        prix_kilo = p;
    }

    /**
     * Modifie le poids d'abattage des poulets
     */
    public static void set_poids_abattage(double p)
    {
        poids_abattage = p;
    }

    /**
     * Retourne le prix de vente d'un poulet
     */
    public double get_prix()
    {
        return this.poids * prix_kilo;
    }

    /**
     * Indique si le poulet doit être abattu ou non
     */
    public boolean a_abattre()
    {
        return this.poids >= poids_abattage;
    }

}
