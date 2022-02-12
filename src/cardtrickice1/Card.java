/*
 * Modifier: Devansh Mashhruwala / Student id: 991648634
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** define card value and suits
 * 
 *
 * @author sivagamasrinivasan
 */
public class Card 
{
    private int value;
    private String suits; //encapsulation
    //constant
    public static final String [] SUITS = { "diamonds","clubs","spades","hearts"};

    Card(int value,String suits)
    {
        this.value=value;
        this.suits=suits;
    }
    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the suits
     */
    public String getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        this.suits = suits;
    }
   //number
    public int generateRank()
    {
        return((int)(Math.random()*13)+1);
    }
    
    //method for suits
    public String generateSuit()
    {
        return(SUITS[(int)(Math.random()*4)]);
    }
    
}
