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
public interface GameInstance<AIInstance>
{
    public enum Result {AWINS, BWINS, TIE}
    public Result playGame(AIInstance a, AIInstance b);
}
