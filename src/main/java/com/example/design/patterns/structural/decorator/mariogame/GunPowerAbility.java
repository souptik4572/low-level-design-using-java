package com.example.design.patterns.structural.decorator.mariogame;

import java.util.List;

public class GunPowerAbility implements AbilitiesDecorator{

    private final Character character;

    public GunPowerAbility(Character character) {
        this.character = character;
    }

    @Override
    public List<String> getAbilities() {
        List<String> finalAbilityList = character.getAbilities();
        finalAbilityList.add("Powerful Gun");
        return finalAbilityList;
    }
}
