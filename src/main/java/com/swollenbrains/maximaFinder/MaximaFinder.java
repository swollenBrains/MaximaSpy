package com.swollenbrains.maximaFinder;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class MaximaFinder {
	
	public List<Peak<Date>> getPeaks(List<ImageDetails> metadata){
		Collections.sort(metadata,new Comparator<ImageDetails>() {
				public int compare(ImageDetails o1, ImageDetails o2) {
					// TODO Auto-generated method stub
					return 0;
				}
			});
		return null;
	}
	

}
