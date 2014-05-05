/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swdesign.examplegames.stupidnumbergame.players;

import java.util.Random;
import swdesign.examplegames.AIInfoImpl;
import swdesign.examplegames.stupidnumbergame.StupidNumberPlayer;
import swdesign.game.AI;

/**
 *
 * @author tog
 */
public class RandomPlayer extends AIInfoImpl implements AI<StupidNumberPlayer>, StupidNumberPlayer
{
    private static final Random rnd = new Random();

    private final int min;
    private final int max;

    public RandomPlayer(String id, String name, int min, int max)
    {
        super(id, name);
        this.min = min;
        this.max = max;
    }
    
    @Override
    public int getNumber()
    {
        int range = max - min + 1;
        return min + rnd.nextInt(range);
    } 

    @Override
    public StupidNumberPlayer newInstance()
    {
        return this;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " (Random[ " + min + "->" + max + "])";
    }
}
