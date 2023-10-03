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
        // TODO code application logic here
        
        int[] numList = {1,2,3,4,5};
        String[] stringList = new String[5];
        stringList[0] = "Hello";
        stringList[1] = "Hi";
        stringList[2] = "GOT YA NOW, KIRYU-CHAN!!!!!!";
        stringList[3] = "Hola";
        stringList[4] = "Mabuhay";
        char[][] charGrid = new char[2][2];

        new VisionPerson("Neuvillette",32,129029092);
        new VisionPerson("Wriothesley",45,4546353);
        System.out.println(VisionPerson.getPerson(0));
        System.out.println(VisionPerson.getPerson("Wriothesley").getName());
        System.out.println(VisionPerson.getPerson("Wriothesley").getAge());
    }

}
