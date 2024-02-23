package com.mmr;

import com.mmr.denominations.Ability;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.mmr.denominations.Ability.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DenominationsTest {

    @ParameterizedTest
    @MethodSource("provideAbilitiesAndExpectedValues")
    void abilitiesHaveTheCorrectValues(Ability ability, byte value) {
        assertEquals(value, ability.getVal());
    }

    private static Stream<Arguments> provideAbilitiesAndExpectedValues() {
        return Stream.of(
                Arguments.of(NON_EXISTENT,      (byte) 0),
                Arguments.of(DISASTROUS,        (byte) 1),
                Arguments.of(WRETCHED,          (byte) 2),
                Arguments.of(POOR,              (byte) 3),
                Arguments.of(WEAK,              (byte) 4),
                Arguments.of(INADEQUATE,        (byte) 5),
                Arguments.of(PASSABLE,          (byte) 6),
                Arguments.of(SOLID,             (byte) 7),
                Arguments.of(EXCELLENT,         (byte) 8),
                Arguments.of(FORMIDABLE,        (byte) 9),
                Arguments.of(OUTSTANDING,       (byte) 10),
                Arguments.of(BRILLIANT,         (byte) 11),
                Arguments.of(MAGNIFICENT,       (byte) 12),
                Arguments.of(WORLD_CLASS,       (byte) 13),
                Arguments.of(SUPERNATURAL,      (byte) 14),
                Arguments.of(TITANIC,           (byte) 15),
                Arguments.of(EXTRA_TERRESTRIAL, (byte) 16),
                Arguments.of(MYTHICAL,          (byte) 17),
                Arguments.of(MAGICAL,           (byte) 18),
                Arguments.of(UTOPIAN,           (byte) 19),
                Arguments.of(DIVINE,            (byte) 20)
        );
    }

}
