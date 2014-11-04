package com.topcoder.round638;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NamingConventionTest {

	@Test
	public void testToCamelCase() {
		NamingConvention namingConvention = new NamingConvention();
		assertEquals("sumOfTwoNumbers", namingConvention.toCamelCase("sum_of_two_numbers"));
		assertEquals("variable", namingConvention.toCamelCase("variable"));
		assertEquals("tOPCODER", namingConvention.toCamelCase("t_o_p_c_o_d_e_r"));
		assertEquals("theVariableNameCanBeVeryLongLikeThis", namingConvention.toCamelCase("the_variable_name_can_be_very_long_like_this"));
	}
}
