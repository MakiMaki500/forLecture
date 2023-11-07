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
public class VisionPerson {
    protected String name;
    protected int age;
    protected double money;
    protected VisionPerson Friend;
    private static int noOfPersons = 0;
    private static ArrayList<VisionPerson> personList = new ArrayList();
    
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
        personList.add(this);
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
    public static VisionPerson getPerson(int index){
        return personList.get(index);
    }
    public static VisionPerson getPerson(String name){
       boolean found = false;
       for(VisionPerson p : personList) {
           if(p.name.equals(name)){
               found = true;
               return p;
           }
       }
       if(!found) System.out.printf("No person named %s.\n", name);
       return null;
    }
}
