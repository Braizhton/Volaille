package org.example;

// Classe abstraite représentant un objet volaille
public abstract class Volaille {
    protected double poids;
    protected int id;
    protected double prix;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void set_poids(double poids) {
        this.poids = poids;
    }

    public double get_prix_kilo()
    {
        return 0;
    }

    public boolean a_abattre()
    {
        return false;
    }
}
