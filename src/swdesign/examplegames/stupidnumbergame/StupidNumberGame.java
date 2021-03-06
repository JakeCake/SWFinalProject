/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swdesign.examplegames.stupidnumbergame;

import swdesign.game.Game;
import swdesign.game.GameInstance;

/**
 *
 * @author tog
 */
public class StupidNumberGame implements Game<StupidNumberPlayer>, GameInstance<StupidNumberPlayer> {

    private final int numberOfGames;

    public StupidNumberGame(int numberOfGames)
    {
        this.numberOfGames = numberOfGames;
    }

    @Override
    public String getName()
    {
        return "Stupid number game";
    }

    @Override
    public GameInstance<StupidNumberPlayer> newInstance()
    {
        return this;
    }

    @Override
    public Result playGame(StupidNumberPlayer a, StupidNumberPlayer b)
    {
        int aScore = 0;
        int bScore = 0;
        for (int i = 0; i < numberOfGames; ++i)
        {
            int aNumber = a.getNumber();
            int bNumber = b.getNumber();

            if (aNumber > bNumber)
            {
                ++aScore;
            } else if (bNumber > aNumber)
            {
                ++bScore;
            }
            for (int j = 0; j < 1000; j++)
            {
                Math.sin(3456);
                Math.atan2(27.9, 48.23);
                Math.log(782374.3);
                Math.sin(3456);
                Math.atan2(27.9, 48.23);
                Math.log(782374.3);
                Math.sin(3456);
                Math.atan2(27.9, 48.23);
                Math.log(782374.3);
                Math.sin(3456);
                Math.atan2(27.9, 48.23);
                Math.log(782374.3);
                Math.sin(3456);
                Math.atan2(27.9, 48.23);
                Math.log(782374.3);
                Math.sin(3456);
                Math.atan2(27.9, 48.23);
                Math.log(782374.3);
            }
        }

        //Stupid slowdown
        if (aScore > bScore)
        {
            return Result.AWINS;
        }
        if (bScore > aScore)
        {
            return Result.BWINS;
        }
        return Result.TIE;

    }

}
