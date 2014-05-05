/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swdesign.tournament;

import swdesign.game.AIInfo;
import swdesign.game.AI;
/**
 *
 * @author tog
 */
public interface ParticipantInfo extends AIInfo
{
    public int getScore();
    public AI getAI();
}
