package com.pricing;

import java.math.BigDecimal;

import com.pricing.model.Consumer;

public class Insurance {
	private PricingStrategy strategy;
	
	public Insurance(PricingStrategy strategy) {
		this.strategy = strategy;
	}

	public BigDecimal executeStrategy(Consumer consumer, BigDecimal price) {
		return strategy.getInsurancePrice(consumer, price);
	}

}
