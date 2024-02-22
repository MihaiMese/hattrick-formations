package com.mmr.models;

import com.mmr.denominations.Abilities;
import com.mmr.denominations.Skills;

import java.util.EnumMap;

public record Player(
        String firstName,
        String lastName,
        EnumMap<Skills, Abilities> skills
) {

}
