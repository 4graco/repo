package com.topcoder.round629;

public class CandyMaking {

	private double getDifference(int[] containerVolume, int[] desiredWeight, double density) {
		double difference = 0;
		for (int i = 0; i < containerVolume.length; i++) {
			difference += Math.abs(desiredWeight[i] - containerVolume[i] * density);
		}
		return difference;
	}

	public double findSuitableDensity(int[] containerVolume, int[] desiredWeight) {
		double minDifferences = Double.MAX_VALUE;
		for (int i = 0; i < containerVolume.length; i++) {
			double currentDensity = (double) desiredWeight[i] / (double) containerVolume[i];
			double currentDifferences = getDifference(containerVolume, desiredWeight, currentDensity);
			if (currentDifferences < minDifferences) {
				minDifferences = currentDifferences;
			}
		}
		return minDifferences;
	}
}
