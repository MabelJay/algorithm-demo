package com.demos.test;

public class EmptyClass implements CalService {
    @Override
    public float calShape(float r) {
        return 0f;
    }

    @Override
    public float calGravity(float r) {
        return 0f;
    }
}
