package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		int lefts = 0;
		int rights = 0;
		int rightsafter = 0;
		int leftsafter = 0;
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '{') {
				lefts++;
				for (int j = i + 1; j < b.length(); j++) {
					if (b.charAt(j) == '}') {
						rightsafter++;
					} else {
						leftsafter++;
					}
				}
			} else if (b.charAt(i) == '}') {
				rights++;
			}
		}
		if (lefts == rights && (rightsafter - leftsafter) / lefts == 1) {
			return true;
		} else {
			return false;
		}
	}
}