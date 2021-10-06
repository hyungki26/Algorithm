package example;
import java.util.*;

public class hashMap {

    public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>(); // Map 선언
		
		map.put("Soraka", 450);
		map.put("Garen", 4800); // Map 안에 값 넣기
        	// Map의 Key는 중복 불가, 동일한 Key에 다른 값을 넣을 경우 최근에 넣은 값 적용
		map.put("Garen", 1350);
		
           	// Key를 사용하여 Map 안의 값 가져오기
		System.out.println("Map Value : " + map.get("Garen")); 
		
		System.out.println("Map size : " + map.size()); // 맵 크기 확인
		
		map.replace("Garen", 450); // Key 값의 내용을 변경
		System.out.println("Garen Value : " + map.get("Garen")); 
		
        	// Key가 존재하는지 확인
		System.out.println("Key Exist : " + map.containsKey("Garen"));
		// Value가 존재하는지 확인
       		System.out.println("Value Exist : " + map.containsValue(450));
		
		System.out.println("Map Empty : " + map.isEmpty()); // Map의 크기가 0인지 확인
		
		map.remove("Garen"); // key에 해당하는 값 삭제
		map.put(null, 150);
		map.put("Garen", 450);
		
		System.out.println("Key가 있으면 Value 없으면 default : " + map.getOrDefault("Ahri", 6300));
		
		// Key가 없거나 Value가 null일 때만 삽입
		map.putIfAbsent("Master Yi", 6300);
		map.putIfAbsent("Garen", 6300);
		System.out.println("Key가 없거나 Value가 null일 때만 삽입 : " + map.get("Master Yi"));
		System.out.println("Key가 없거나 Value가 null일 때만 삽입 : " + map.get("Garen"));
	}
    
}
