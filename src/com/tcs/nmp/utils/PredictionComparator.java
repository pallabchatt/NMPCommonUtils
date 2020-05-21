package com.tcs.nmp.utils;

import java.util.Comparator;

import com.google.api.services.prediction.model.Output.OutputMulti;

public class PredictionComparator implements Comparator<OutputMulti> {
	@Override
	public int compare(OutputMulti o1, OutputMulti o2) {
		return o2.getScore().compareTo(o1.getScore());
	}
}
