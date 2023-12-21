package org.example;

/**
 * Classe abstraite représentant une volaille
 */
public abstract class Volaille {
    protected double poids;
    protected int id;
    protected double prix;

    /**
     * Retourne l'id de la volaille
     */
    public int getId() {
        return id;
    }

    /**
     * Modifie le poids de la volaille
     */
    public void set_poids(double poids) {
        this.poids = poids;
    }

    /**
     * Indique si la volaille doit être abattue ou non
     */
    public boolean a_abattre()
    {
        return false;
    }

    /**
     * Retourne la chaine de caractères représentant une volaille
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "{poids=" + poids +
                ", id=" + id +
                ", prix=" + prix +
                '}';
    }
}
