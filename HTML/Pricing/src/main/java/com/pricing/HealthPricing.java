package com.pricing;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.pricing.model.Consumer;

public class HealthPricing implements PricingStrategy {

	public BigDecimal getInsurancePrice(Consumer consumer, BigDecimal price) {
		BigDecimal tempPrice = new BigDecimal(0.0);
		if(consumer.getIllness().toLowerCase().equals("allergies")) {
			tempPrice = price.multiply(new BigDecimal(0.01));
			System.out.println("Debug allergies: " + tempPrice);
		} else if(consumer.getIllness().toLowerCase().equals("heart disease")) {
			tempPrice = price.multiply(new BigDecimal(.17));
			System.out.println("Debug heart: " + tempPrice);
		} else if(consumer.getIllness().toLowerCase().equals("sleep apnea")) {
			tempPrice = price.multiply(new BigDecimal(.06));
			System.out.println("Debug sleep: " + tempPrice);
		}
		return price.add(tempPrice).setScale(2, RoundingMode.DOWN);
	}

}
