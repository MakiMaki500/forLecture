/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package forlecture;

/**
 *
 * @author PHOTON
 */
public class NotEnoughMoneyException extends Exception {
    private VisionPerson poor;
    private double debt;
    /**
     * Creates a new instance of <code>NotEnoughMoneyException</code> without
     * detail message.
     */
    public NotEnoughMoneyException(VisionPerson poor, double debt) {
        this.poor = poor;
        this.debt = debt;
    }

    /**
     * Constructs an instance of <code>NotEnoughMoneyException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NotEnoughMoneyException(String msg) {
        super(msg);
    }
    
    public double setToZero(){
        double val = poor.getMoney();
        poor.setMoney(0);
        return val;
    }
}
