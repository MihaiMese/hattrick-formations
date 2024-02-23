package com.mmr;

import com.mmr.denominations.Ability;
import com.mmr.denominations.Skill;
import com.mmr.models.Player;

import java.util.EnumMap;

import static com.mmr.denominations.Ability.*;
import static com.mmr.denominations.Skill.*;

public class Main {

    public static void main(String[] args) {
        var currentSkills = new EnumMap<Skill, Ability>(Skill.class);
        currentSkills.put(GOALKEEPING, DISASTROUS);
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
