/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

/**
 * A class that models a pizza cutter.
 * We only ever want one pizza cutter to 
 * cut the pizzas to ensure consistency.
 * Users can choose how many slices to
 * divide the pizza into.
 * Note that the following source was used as a reference in 
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 * @author dancye
 */
public class PizzaCutter 
{
    int numSlices = 0;// how many pieces to cut the pizza into
    // Singleton pattern to prevent external instantiation
    private PizzaCutter()
    {
        numSlices = 3;
    }
    
    private static PizzaCutter instance = new PizzaCutter();
    
    public static PizzaCutter getInstance()
    {
        return instance;
    }
    
    public int getNumSlices()
    {
        return numSlices;
    }
    public void setNumSlices()
    {
        this.numSlices = numSlices;
    }
}
