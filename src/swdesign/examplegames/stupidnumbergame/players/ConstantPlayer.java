/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swdesign.examplegames.stupidnumbergame.players;

import java.util.logging.Level;
import java.util.logging.Logger;
import swdesign.examplegames.AIInfoImpl;
import swdesign.examplegames.stupidnumbergame.StupidNumberPlayer;
import swdesign.game.AI;

/**
 *
 * @author tog
 */
public class ConstantPlayer extends AIInfoImpl implements AI<StupidNumberPlayer>, StupidNumberPlayer
{
    private final int number;
    
    public ConstantPlayer(String id, String name, int number)
    {
        super(id, name);
        this.number = number;
    }
    
    @Override
    public int getNumber()
    {
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(ConstantPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return number;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " (Constant " + number + ")";
    }

    @Override
    public StupidNumberPlayer newInstance()
    {
        return this;
    }    
}
