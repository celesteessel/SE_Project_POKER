/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokerserver;

import java.util.ArrayList;

/**
 *
 * @author supithaweerasinghe
 */

public class PokerServer {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CardLogic l = new CardLogic();
        //create 52 cards
        l.creatingCards();
        //randomizing 52 cards
        ArrayList cards = l.randomizingCards();
        
        /*for(int i=0;i<52;i++){
            Cards a = (Cards)cards.get(i);
            System.out.print(a.cnumber);
            System.out.println(a.ctype);
        }*/
        
        GameLogicCardDistribution g = new GameLogicCardDistribution();
        //Give - pair of initial cards to each player
        //g.initialCardsDistribution(RANDOMIZED_ARRAYLIST, NUMBER_OF_PLAYERS);
        ArrayList initial = g.initialCardsDistribution(cards, 2);
        //Give - 3 cards to each player
        ArrayList cardset = g.cardsDistrubution();
        
        ///
        System.out.println("initial card sets 2x2");
        for(int i=0;i<initial.size();i++){
            Cards a = (Cards)initial.get(i);
            System.out.print(a.getCnumber());
            System.out.println(a.getCtype());
        }
        ///
        
        ///
        System.out.println("Card sets 3x3");
        for(int i=0;i<cardset.size();i++){
            Cards a = (Cards)cardset.get(i);
            System.out.print(a.getCnumber());
            System.out.println(a.getCtype());
        }
        ///
        
        ///
        g.displaycard();
        ///
    }
    
}
