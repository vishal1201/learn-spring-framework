package in.pelligent.learningspringframework.businesscalculation;

import org.springframework.stereotype.Component;

@Component
public class MySQLDbDataService implements DataService {

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return new int[] {1, 2, 3, 4, 5};
	}

}
