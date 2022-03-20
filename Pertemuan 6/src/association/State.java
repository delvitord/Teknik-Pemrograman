package association;
import java.util.*;

public class State {
	private String stateName;
	
	List<CityClass> citys;

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public List<CityClass> getCities() {
		return citys;
	}

	public void setState(List<CityClass> citys) {
		this.citys = citys;
	}
	
}
