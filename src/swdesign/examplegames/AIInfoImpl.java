/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swdesign.examplegames;

import swdesign.game.AIInfo;

/**
 *
 * @author tog
 */
public class AIInfoImpl implements AIInfo
{
    private final String id;
    private final String name;

    public AIInfoImpl(String id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String getID()
    {
        return id;
    }

    @Override
    public String getName()
    {
        return name;
    }
    
    @Override
    public String toString()
    {
        return id + ":" + name;
    }
}
