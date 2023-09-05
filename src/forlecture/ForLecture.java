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
public class ForLecture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(VisionPerson.getNoOfPersons());
        
        VisionPerson zhongli = new VisionPerson("Zhongli");
        double zhonglimoney = zhongli.getMoney();
        System.out.println(zhonglimoney);
        zhongli.earnMoney(1000000);
        zhonglimoney = zhongli.getMoney();
        System.out.println(zhonglimoney);
        
        System.out.println(VisionPerson.getNoOfPersons());
        
        VisionPerson venti = new VisionPerson("Venti", 1066, 5060532);
        venti.introduce();
        
        int ventiage = venti.getAge();
        System.out.println(ventiage);
        venti.birthday();
        ventiage = venti.getAge();
        System.out.println(ventiage);
        
        venti.setFriend(zhongli);
        System.out.println(venti.getName() + " is now friends with " + venti.getFriend().getName());
        
        zhongli.introduce(venti);
        
        System.out.println(VisionPerson.getNoOfPersons());
    }

}
