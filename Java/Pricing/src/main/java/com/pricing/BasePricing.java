package com.pricing;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.pricing.model.Consumer;

public class BasePricing implements PricingStrategy {

	public BigDecimal getInsurancePrice(Consumer consumer, BigDecimal price) {
		BigDecimal agePricing = null;
		if(consumer != null && consumer.getAge() >= 18) {
			int adjustedPrice = (consumer.getAge() -18)/5;
			price = price.add(new BigDecimal(100.00));
			System.out.println("Debug base:  " + adjustedPrice + " ");
			agePricing = new BigDecimal(adjustedPrice);
			price = price.add(agePricing.multiply(new BigDecimal(20)));
			System.out.println("Debug base pricing:  " + price.setScale(2, RoundingMode.DOWN) + " ");
			return price.setScale(2, RoundingMode.DOWN);
		} else {
			return new BigDecimal(0);
		}
	}

}
