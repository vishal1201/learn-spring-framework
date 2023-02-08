package in.pelligent.learnspringframework.businesscalculation;

import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySQLDbDataService implements DataService {

    @Override
    public int[] retrieveData() {
        // TODO Auto-generated method stub
        return new int[]{1, 2, 3, 4, 5};
    }

}
