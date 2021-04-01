package edu.wctc.dice.impl;

import edu.wctc.dice.iface.GameDice;

import java.util.Random;

public class RollDieSixSide implements GameDice {

    @Override
    public int rollDie() {
        Random random = new Random();
        return random.nextInt(6) + 1;
//        return dieRoller.rollDie();
    }

}
