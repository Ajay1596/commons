package io.mosip.kernel.biometrics.model;

import java.util.Map;

import io.mosip.kernel.biometrics.constant.BiometricType;
import lombok.Data;

@Data
public class QualityCheck {
	
	/** 
	 * score per modality, based on input modalitiesToCheck
	 */
	private Map<BiometricType, QualityScore> scores;
	
	/** The analytics info - detailed breakdown and other information */
	private Map<String, String> analyticsInfo;

}
