package com.udacity.pricing;

import com.udacity.pricing.domain.price.Price;
import com.udacity.pricing.service.PricingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PricingServiceApplicationTests {
	@Autowired
	private MockMvc mvc;

	@MockBean
	private PricingService pricingService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void findPrice() throws Exception {
		/**
		 * TODO: Add a test to check that the `get` method works by calling
		 *   a vehicle by ID. This should utilize the car from `getCar()` below.
		 */
		// Arrange
		Long vehicleId = 1L;

		// Act
		Price price = pricingService.getPrice(vehicleId);

		// Assert
		assertNotNull(price);
	}
}
