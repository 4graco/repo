package com.topcoder.tco14;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WolfPrefixTest {

	@Test
	public void testCount() {
		WolfPrefix wolfPrefix = new WolfPrefix();
		assertEquals(2, wolfPrefix.count(new String[]{"ab","ac","bc"}));
		assertEquals(1, wolfPrefix.count(new String[]{"a","b","c","d","e"}));
		assertEquals(0, wolfPrefix.count(new String[]{"pluto","plutorelinquish","plutothefirst"}));
		assertEquals(96, wolfPrefix.count(new String[]{"aaaa","aabb","bbac","bcc","caaa","caac","ccac","cccc","cdc","cdp"}));
		assertEquals(264319930, wolfPrefix.count(new String[]{"aaaaaa","bbbbbb","cc","ddddd","eeeeeeee","fffff","ggggggggggg","hhhhhhhhhhhh","i","jjjjj","kkkkkkkkkkkkkkkkkk","lll","mmmmm","nnnn"}));
		assertEquals(270983158, wolfPrefix.count(new String[]{"gberovadxzpvqfpplchnqggrqcexzbahqkkornltlsc","oxqlxcjhxgvocwhatbivmcckwejqhhek","bkxdikysgqdhpplwoamqt","vpydpioaqgrxeqffwpfdgpkdvopkwty", "mjlvxzzhuthnvfssigavqohssgfrrqaxtieimweulbaiszgji","dsioglrw","reptewedqflt","vsftakqmbihhrsd","qxfzxsdxwpawcbbdshhd","rixyarsyukipfu"}));
	}
}
