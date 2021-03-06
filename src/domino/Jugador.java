/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

import java.util.ArrayList;

/**
 *
 * @author ALUMNEDAM
 */
public class Jugador {
    
    private final String nom;
    private final ArrayList<Fitxa> fitxes; 

/**
    * @param nom 
    * Es el constructor de Jugador, iniciamos nombre de jugador y
    * ArrayList de fichas.
*/
    public Jugador(String nom) {
        this.nom = nom;
        this.fitxes=new ArrayList();
    }
    
    
/**
    * @return  nom
    * Este metodo es para obtener nombre de jugador.
*/
    public String getNom() {
        return nom;
    }

/**
    * @return  fitxes
    * Este metodo es para obtener fichas.
*/
    public ArrayList<Fitxa> getFitxes() {
        return fitxes;
    }

/**
     * Metodo toString para comprobar creacion de Jugadores.
     * @return String del jugador
*/
    @Override
    public String toString() {
        return "Jugador{" + "nom=" + nom + ", fitxes=" + fitxes + "}\n";
    }
}
