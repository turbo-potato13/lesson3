package com.vtb.kortunov.lesson3.task2;

public class Wall implements Barrier {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Member member) {
        return member.getJumpHeight() >= height;
    }
}
