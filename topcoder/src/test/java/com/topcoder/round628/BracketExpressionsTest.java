package com.topcoder.round628;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BracketExpressionsTest {

	@Test
	public void testIfPossible() {
		BracketExpressions a = new BracketExpressions();
		assertEquals("possible", a.ifPossible("([]{})"));
		assertEquals("possible", a.ifPossible("(())[]"));
		assertEquals("impossible", a.ifPossible("({])"));
		assertEquals("impossible", a.ifPossible("[]X"));
		assertEquals("possible", a.ifPossible("([]X()[()]XX}[])X{{}}]"));
		assertEquals("possible", a.ifPossible("(())[]XX"));
		assertEquals("possible", a.ifPossible("[[{}{X[]][X][{()(){}[]}[(X[{}{}X()()][{}X{[]}()]()"));

	}
}
