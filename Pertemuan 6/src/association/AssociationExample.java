package association;
import java.util.*;

public class AssociationExample {
	public static void main (String[] args) {
		State state = new State();
		state.setStateName("California");
		
		CityClass city = new CityClass();
		city.setCityName("Los Angeles");
		CityClass city2 = new CityClass();
		city2.setCityName("Sandiago");
		
		List<CityClass> empList = new ArrayList<CityClass>();
		empList.add(city);
		empList.add(city2);
		
		state.setState(empList);
		
		System.out.println(state.getCities() + " are cities in the state " + state.getStateName());
		
	}
}
