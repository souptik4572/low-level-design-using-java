package com.example.design.patterns.structural.decorator.mariogame;

import java.util.ArrayList;
import java.util.List;

public class MarioCharacter implements Character {
    private final List<String> abilities;

    public MarioCharacter() {
        abilities = new ArrayList<>();
    }

    @Override
    public List<String> getAbilities() {
        return abilities;
    }
}
