package BusinessCalculation;

import org.springframework.stereotype.Component;

@Component
public class MongoDbDataService implements DataService {

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return new int[] { 11, 22, 33, 44, 55 };
	}

}
