/*
 * Modifier: Devansh Mashhruwala / Student id: 991648634
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

import java.util.Scanner;

/**
 * step1 : generate 7 random cards and store in array - how step 2: take any
 * card input from user suit,number step 3: user card is in the array 'card is
 * found'
 *
 * @author sivagamasrinivasan
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7]; //Array of object
       
        Card luckyCard= new Card(7,"hearts"); // created lucky card so also have to add constructor in Card class
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < magicHand.length; i++) {
            magicHand[i] = new Card();
            magicHand[i].setValue(magicHand[i].generateRank());//use a method to generate random *13
            magicHand[i].setSuits(magicHand[i].generateSuit());//random method suit 
        }

        //random generated cards
        for (Card value : magicHand) {
            System.out.println(value.getValue() + " of " + value.getSuits());
        }
        //step 2:take input 
        System.out.print("Enter a Rank of your choice: ");
        int rank = sc.nextInt();
        System.out.print("Select a Suit of your choice:\n1 for Diamonds\n2 for Club\n3 for Spade\n4 for Heart: ");
        String suit = Card.SUITS[sc.nextInt() - 1];

        //step 3: match with array 
        int checked = 0;
        for (Card value : magicHand) {
            if (rank == value.getValue() && suit.equals(value.getSuits())) {
                System.out.println("Hurray! Your card matched");
                checked = 1;
                break;
            }
        }
        if (checked == 0) {
            System.out.println("Your card did not match");
        }
        sc.close();
    }

}
