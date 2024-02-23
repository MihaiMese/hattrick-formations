package com.mmr.models;

import com.mmr.denominations.Ability;
import com.mmr.denominations.Skill;

import java.util.EnumMap;

public record Player(
        String firstName,
        String lastName,
        EnumMap<Skill, Ability> skills
) {

}
