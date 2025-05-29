package com.example.design.patterns.structural.decorator.mariogame;

import java.util.List;

public class StarPowerAbility implements AbilitiesDecorator {

    private final Character character;

    public StarPowerAbility(Character character) {
        this.character = character;
    }

    @Override
    public List<String> getAbilities() {
        List<String> finalAbilityList = character.getAbilities();
        finalAbilityList.add("Star Related Power");
        return finalAbilityList;
    }
}
