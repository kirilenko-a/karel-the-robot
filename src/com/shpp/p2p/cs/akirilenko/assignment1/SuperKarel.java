package com.shpp.p2p.cs.akirilenko.assignment1;

import com.shpp.karel.KarelTheRobot;

public class SuperKarel extends KarelTheRobot {
    public void turnRight() throws Exception {
        for (int i = 0; i < 3; i++) {
            turnLeft();
        }
    }

    public void turnAround() throws Exception {
        for (int i = 0; i < 2; i++) {
            turnLeft();
        }
    }

    public void moveForward() throws Exception {
        while (frontIsClear()) {
            move();
        }
    }

    public void findExit() throws Exception {
        turnRight();

        if (leftIsBlocked()) {
            move();
        }

        turnLeft();
    }

    public void pickupBeeper() throws Exception {
        while (noBeepersPresent()) {
            move();
        }

        pickBeeper();
    }

    public void moveForwardWithRightTurn() throws Exception{
        moveForward();
        turnRight();
    }

    public void findAndPickBeeper() throws Exception {
        moveForward();
        findExit();
        pickupBeeper();
        turnAround();
    }

    public void returnToStartingPoint() throws Exception {
        moveForwardWithRightTurn();
    }
}
