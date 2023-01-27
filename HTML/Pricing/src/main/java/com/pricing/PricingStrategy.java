package com.pricing;

import java.math.BigDecimal;

import com.pricing.model.Consumer;

public interface PricingStrategy {
	public BigDecimal getInsurancePrice(Consumer consumer, BigDecimal price);
}
