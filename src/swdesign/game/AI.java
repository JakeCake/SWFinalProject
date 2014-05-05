/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swdesign.game;

/**
 *
 * @author tog
 * @param <AIInstance>
 */
public interface AI<AIInstance> extends AIInfo
{
    public AIInstance newInstance();
}
