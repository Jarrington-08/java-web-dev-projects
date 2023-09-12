package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void reverseBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void standaloneOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void standaloneClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void excessClosingBracketsInFrontOfStringReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]][]"));
    }

    @Test
    public void excessClosingBracketsInEndOfStringReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]]"));
    }

    @Test
    public void excessOpeningBracketsInFrontOfStringReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]"));
    }

    @Test
    public void excessOpeningBracketsInEndOfStringReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][["));
    }

    @Test
    public void singleOpeningBracketFollowedByAlphabeticStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void singleClosingBracketFollowedByAlphabeticStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode"));
    }

    @Test
    public void reverseBracketsInAlphabeticStringReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void excessClosingBracketsInStringReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Lau[]nc]hCode"));
    }

    @Test
    public void excessOpeningBracketsInStringReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Lau[]nc[hCode"));
    }













    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}