package com.vtb.kortunov.lesson3.task2;

public class Member {

    private final int runLength;
    private final int jumpHeight;

    public Member(int runLength, int jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    public int getRunLength() {
        return runLength;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }
}
