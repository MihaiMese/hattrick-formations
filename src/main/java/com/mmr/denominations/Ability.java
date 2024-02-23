package com.mmr.denominations;

public enum Ability {
    NON_EXISTENT((byte) 0),
    DISASTROUS((byte) 1),
    WRETCHED((byte) 2),
    POOR((byte) 3),
    WEAK((byte) 4),
    INADEQUATE((byte) 5),
    PASSABLE((byte) 6),
    SOLID((byte) 7),
    EXCELLENT((byte) 8),
    FORMIDABLE((byte) 9),
    OUTSTANDING((byte) 10),
    BRILLIANT((byte) 11),
    MAGNIFICENT((byte) 12),
    WORLD_CLASS((byte) 13),
    SUPERNATURAL((byte) 14),
    TITANIC((byte) 15),
    EXTRA_TERRESTRIAL((byte) 16),
    MYTHICAL((byte) 17),
    MAGICAL((byte) 18),
    UTOPIAN((byte) 19),
    DIVINE((byte) 20);

    private final byte val;

    Ability(byte i) {
        val = i;
    }

    public byte getVal() {
        return val;
    }
}
