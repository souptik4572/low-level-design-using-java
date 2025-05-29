package com.example.design.patterns.structural.decorator.mariogame;

import java.util.List;

public class HeightUpAbility implements AbilitiesDecorator {
    private final Character character;

    public HeightUpAbility(Character character) {
        this.character = character;
    }

    @Override
    public List<String> getAbilities() {
        List<String> finalAbilityList = character.getAbilities();
        finalAbilityList.add("Increase Height");
        return finalAbilityList;
    }
}
