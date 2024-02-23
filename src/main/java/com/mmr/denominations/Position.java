package com.mmr.denominations;

public enum Position {
    /**
     * Goalkeeping is (obviously) the main skill for goalkeepers.
     * Keepers can also benefit from a good defensive skill, and a high set pieces
     * skill will help to defend against free kicks and penalties.
     */
    GOALKEEPER,

    /**
     * Central Defenders should naturally have a lot of defending. Playmaking is also beneficial,
     * and their passing skill really makes a difference when counter-attacking.
     */
    CENTRAL_DEFENDER,

    /**
     * Defending is most important, but they also benefit from a high Winger skill.
     * They contribute a little with their playmaking skill, and passing also helps when
     * counter-attacking.
     */
    WING_BACK,

    /**
     * Having good playmakers in the inner midfield positions is a key ingredient for
     * most successful teams.They also use their Passing and Defending skills a lot.
     * They can also bump the side attacks with some Winger skill, and use a fair amount of scoring.
     */
    INNER_MIDFIELDER,

    /**
     * Naturally, a good Winger skill is most important here but Playmaking and Defending
     * skills can also help. They can also use their Passing skills to help the attack ratings.
     */
    WINGER,

    /**
     * The first job of a Forward is to score goals, which makes their scoring skill
     * of primary importance. Passing is also valuable, and so is winger and playmaking.
     */
    FORWARD
}
