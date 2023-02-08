package in.pelligent.learnspringframework.businesscalculation;

import org.springframework.stereotype.Service;

import java.util.Arrays;

//@Component
@Service
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
