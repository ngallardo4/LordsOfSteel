/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author ngall
 */
public abstract class Personatge {
    protected String nom;
    //private String categoria;
    protected Arma arma;
    protected int experiencia;
    protected int nivell;
    protected int FOR; // (força)
    protected int CON; // (constitució)
    protected int VEL; // (velocitat)
    protected int INT; // (intel·ligència)
    protected int SOR;// (sort)

    public Personatge(String nom, Arma arma, int experiencia, int nivell, int FOR, int CON, int VEL, int INT, int SOR) {
        this.nom = nom;
    }

    
}
