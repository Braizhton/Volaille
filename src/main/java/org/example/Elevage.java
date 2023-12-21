package org.example;

import java.util.ArrayList;

public class Elevage {
    private ArrayList<Volaille> elevage;

    public Elevage()
    {
        this.elevage = new ArrayList<>();
    }

    public void add_volaille(Volaille v)
    {
        this.elevage.add(v);
    }

    public Volaille rechercher(int id)
    {
        for (Volaille v : elevage)
        {
            if (v.getId() == id)
                return v;
        }
        return null;
    }

    public void set_poids_volaille(int id, double p)
    {
        rechercher(id).set_poids(p);
    }

    public double evaluer_abattage()
    {
        double res = 0;
        for (Volaille v : elevage)
        {
            if (v.a_abattre()) {
                if (v instanceof Poulet)
                    res += ((Poulet) v).get_prix();
                else if (v instanceof Canard)
                    res += ((Canard) v).get_prix();
            }
        }
        return res;
    }

    public ArrayList<Volaille> abattre_volailles()
    {
        ArrayList<Volaille> a_abattre = new ArrayList<>();
        for (Volaille v : elevage)
        {
            if (v.a_abattre())
            {
                a_abattre.add(v);
            }
        }

        for (Volaille v : a_abattre)
        {
            elevage.remove(v);
        }

        return a_abattre;
    }
}
