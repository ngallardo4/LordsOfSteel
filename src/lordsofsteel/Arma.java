package lordsofsteel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngall
 */
public class Arma {
    private String nom;
    private int WPOW; //Poder de l'arma
    private int WVEL; //Velocitat de l'arma

    public Arma(String nom, int WPOW, int WVEL) {
        this.nom = nom;
        this.WPOW = WPOW;
        this.WVEL = WVEL;
    }

    public String getNom() {
        return nom;
    }

    public int getWPOW() {
        return WPOW;
    }

    public int getWVEL() {
        return WVEL;
    }
}
