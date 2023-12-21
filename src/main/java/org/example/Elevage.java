package org.example;

import java.util.ArrayList;

/**
 * Classe représentant un élevage de volailles
 */
public class Elevage {
    private ArrayList<Volaille> elevage;

    /**
     * Crée un élevage vide
     */
    public Elevage()
    {
        this.elevage = new ArrayList<>();
    }

    /**
     * Ajoute une volaille dans l'élevage
     */
    public void add_volaille(Volaille v)
    {
        this.elevage.add(v);
    }

    /**
     * Retourne la volaille de l'élevage à l'index indiqué
     */
    public Volaille rechercher(int id)
    {
        for (Volaille v : elevage)
        {
            if (v.getId() == id)
                return v;
        }
        return null;
    }

    /**
     * Modifie le poids d'une volaille identifiée par son id
     */
    public void set_poids_volaille(int id, double p)
    {
        rechercher(id).set_poids(p);
    }

    /**
     * Retourne le bénéfice généré par les volailles pouvant être abattues
     */
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

    /**
     * Retourne la liste des volailles abattues et les retire de l'élevage
     */
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
