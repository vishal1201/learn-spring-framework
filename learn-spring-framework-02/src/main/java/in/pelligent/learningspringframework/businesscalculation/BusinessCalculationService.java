package in.pelligent.learningspringframework.businesscalculation;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
	
	private DataService dataService;

	/**
	 * @param dataService
	 */
	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {
		// TODO Auto-generated method stub
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}
