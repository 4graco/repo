package com.topcoder.tco14;

public class WolfOnlineJudge {

	public double[] score(String[] solved){
		
		int numCoders = solved.length;
		int numProblems = solved[0].length();
		double []result = new double[numCoders];
		int []countSolv = new int[numProblems];
		for(int i = 0; i< numProblems; i++){
			for(int j= 0; j<numCoders; j++ ){
				if(solved[j].charAt(i) == 'Y')
				countSolv[i] +=1;
			}
		}
		for(int j= 0; j<numCoders; j++ ){
			for(int i = 0; i< numProblems; i++){
			   if(solved[j].charAt(i) == 'Y'){
				   result[j] += 64.0/countSolv[i];
			   }
			}
		}
		
		return result;
	}
}
