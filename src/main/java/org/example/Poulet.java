package org.example;

public class Poulet extends Volaille {
    private static double prix_kilo = 12;
    public static double poids_abattage = 2;

    public Poulet(double poids, int id)
    {
        this.poids = poids;
        this.id = id;
        this.prix = poids*prix_kilo;
    }

    public static void update_prix_kilo(double p)
    {
        prix_kilo = p;
    }

    public static void set_poids_abattage(double p)
    {
        poids_abattage = p;
    }

    public double get_prix()
    {
        return this.poids * prix_kilo;
    }

    public boolean a_abattre()
    {
        return this.poids >= poids_abattage;
    }

}
