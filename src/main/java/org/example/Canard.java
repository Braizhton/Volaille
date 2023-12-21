package org.example;

public class Canard extends Volaille {
    private static double prix_kilo = 5;
    public static double poids_abattage = 2.1;

    public Canard(double poids, int id)
    {
        this.poids = poids;
        this.id = id;
    }

    static void update_prix_kilo(double p)
    {
        prix_kilo = p;
    }

    static void set_poids_abattage(double p)
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
