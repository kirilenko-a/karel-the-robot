package com.shpp.p2p.cs.akirilenko.assignment1;

import com.shpp.karel.KarelTheRobot;

public class SuperKarel extends KarelTheRobot {
    //method makes karel to turn right
    public void turnRight() throws Exception {
        for (int i = 0; i < 3; i++) {
            turnLeft();
        }
    }
    //method makes karel to turn around
    public void turnAround() throws Exception {
        for (int i = 0; i < 2; i++) {
            turnLeft();
        }
    }
    //method makes karel move forward until he reaches an obstacle
    public void moveForward() throws Exception {
        while (frontIsClear()) {
            move();
        }
    }
    //method for finding exit on the newspaper task field
    public void findExit() throws Exception {
        turnRight();

        if (leftIsBlocked()) {
            move();
        }

        turnLeft();
    }
    //method that allows karel to keep moving forwards until he finds beeper
    public void pickupBeeper() throws Exception {
        while (noBeepersPresent()) {
            move();
        }

        pickBeeper();
    }
    //method makes karel move forward until he reaches an obstacle and make right turn at the end
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
