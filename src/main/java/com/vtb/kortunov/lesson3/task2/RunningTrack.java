package com.vtb.kortunov.lesson3.task2;

public class RunningTrack implements Barrier {

    private final int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Member member) {
        return member.getRunLength() >= length;
    }
}
