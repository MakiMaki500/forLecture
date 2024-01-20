/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forlecture;

/**
 *
 * @author PHOTON
 */
public class VisionArchon extends VisionPerson {
    private String nation;
    private String element;
    private double worshipPower;
    
    
    public VisionArchon(String name, String nation, String element, double worshipPower){
        super(name);
        this.nation=nation;
        this.element=element;
        this.worshipPower=worshipPower;
    }
    public void getWorshipped(){
        this.worshipPower+=10;
    }
    public void getPaid(){
        this.money+=1000;
    }
}
