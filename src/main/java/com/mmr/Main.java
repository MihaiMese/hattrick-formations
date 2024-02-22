package com.mmr;

import com.mmr.denominations.Abilities;
import com.mmr.denominations.Skills;
import com.mmr.models.Player;

import java.util.EnumMap;

import static com.mmr.denominations.Abilities.*;
import static com.mmr.denominations.Skills.*;

public class Main {

    public static void main(String[] args) {
        var currentSkills = new EnumMap<Skills, Abilities>(Skills.class);
        currentSkills.put(KEEPER, DISASTROUS);
        currentSkills.put(DEFENDING, POOR);
        currentSkills.put(PLAYMAKING, INADEQUATE);
        currentSkills.put(WINGER, INADEQUATE);
        currentSkills.put(PASSING, FORMIDABLE);
        currentSkills.put(SCORING, FORMIDABLE);
        currentSkills.put(SET_PIECES, WORLD_CLASS);
        Player first = new Player("Adrian", "Haida", currentSkills);

        System.out.println(first);
    }
}
