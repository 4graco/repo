package com.topcoder.round635;

/*
 *  Single Round Match 635 Round 1 - Division II, Level Two
 *  http://community.topcoder.com/stat?c=problem_statement&pm=13486&rd=16078
 */
public class QuadraticLaw {

	public long getTime(long d) {
		long time = (long) Math.sqrt(d);
		if (time + time * time > d) {
			time--;
		}

		return time;
	}
}
