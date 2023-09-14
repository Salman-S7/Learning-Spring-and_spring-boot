package BusinessCalculation;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BussinessCalculationService {
	DataService dataService;

	public BussinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}

}
