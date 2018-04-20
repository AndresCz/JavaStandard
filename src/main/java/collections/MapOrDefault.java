
package dario.java.std;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapOrDefault {
	public static void main(String[] args) {

		Map<String,Integer> map = createMap();
                Integer value = map.getOrDefault("Android", 0);
                
                Optional<Integer> maybeInt = Optional.of(1);
                
                if (maybeInt.isPresent()) {
                    int i = maybeInt.get();
                }
                
                
                map.put("Android", 1);

		// write to command line
		map.forEach((k, v) -> System.out.printf("%s %s%n", k, v));
	}

	private static Map<String, Integer> createMap() {
		Map<String, Integer> map = new HashMap<>();
		map.put("Eclipse IDE", 0);
		map.put("Eclipse RCP", 0);
		map.put("Git", 0);
		return map;
	}
}
