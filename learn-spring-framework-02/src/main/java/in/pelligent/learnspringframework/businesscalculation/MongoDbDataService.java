package in.pelligent.learnspringframework.businesscalculation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Component
@Primary
@Repository
public class MongoDbDataService implements DataService {

    @Override
    public int[] retrieveData() {
        // TODO Auto-generated method stub
        return new int[]{11, 22, 33, 44, 55};
    }

}
