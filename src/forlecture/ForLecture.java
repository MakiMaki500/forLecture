/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forlecture;

import java.util.ArrayList;

/**
 *
 * @author PHOTON
 */
public class ForLecture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        VisionArchon barbatos = new VisionArchon("Venti", "Mondstadt", "Anemo", 80.0);
        VisionArchon focalors = new VisionArchon("Furina", "Fontaine", "Hydro", 100.0);
        try{
        VisionPerson lyney = VisionPerson.getPerson("Lyney");
        }
        catch(IllegalArgumentException e){
            System.out.println("Person does not exist");
        }
    }
}
