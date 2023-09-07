/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forlecture;

/**
 *
 * @author PHOTON
 */
public class VisionPerson {
    private String name;
    private int age;
    private double money;
    private VisionPerson Friend;
    private static int noOfPersons = 0;
    
    public VisionPerson(String name){
        this.name = name;
        this.age = 5678;
        this.money = 0;    
        noOfPersons++;
    }
    
    public VisionPerson(String name, int age, double money){
        this.name = name;
        this.age = age;
        this.money = money;
        noOfPersons++;
    }
    
    public double getMoney(){
        return this.money;
    }
    
    public void setMoney(double newMoney){
        this.money = newMoney;
    }
    
    public void earnMoney(double amtEarned){
        this.money += amtEarned;
    }
    
    public void spendMoney(double amtSpent){
        this.money += amtSpent;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getName(){
        return this.name;
    }
        
    public void introduce(){
        System.out.println("Hi, my name is " + this.name + ".");
    }
    
    public void introduce(VisionPerson other){
        System.out.println("Hi, " + other.getName() + ", my name is " + this.name + ".");
    }
    
    public void birthday(){
        this.age++;
    }

    /**
     * @return the Friend
     */
    public VisionPerson getFriend() {
        return Friend;
    }

    /**
     * @param Friend the Friend to set
     */
    public void setFriend(VisionPerson Friend) {
        this.Friend = Friend;
    }
    
    public static int getNoOfPersons(){
        return noOfPersons;
    }
}