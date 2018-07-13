package datnt.runsystem.com.util.collection;

import java.util.LinkedHashMap;

public class PartyManager {
	
	/**
	 * Khởi tạo một HashMap parties rỗng, có Key là String và Value là Party
	 * Có thể sử dụng HashMap hoặc TreeMap nhưng vì phải thao tác xóa, sửa
	 * nhiều trên map và số lượng entry không lớn nên LinkHashMap sẽ cho hiệu
	 * suất cao nhất
	 */
	private static LinkedHashMap<String, Party> parties = new LinkedHashMap<>();

	/**
	 * Thêm một party vào danh sách
	 * 
	 * @param String partyName
	 * @param String leader
	 */
	public static void addNewParty(String partyName, String leader) {
		//Nếu party đã có trong map thì ko thực hiện việc thêm mới
		if (hasParty(partyName)) {
			System.out.println("<!> " + partyName + " da ton tai.");
		}
		else { //Ngược lại thêm mới vào map
			parties.put(partyName, new Party(partyName, leader));
		}
	}
	
	/**
	 * Xoa party ra khỏi map
	 * 
	 * @param String partyName tên party
	 */
	public static void removeParty(String partyName) {
		if (hasParty(partyName)) {
			parties.remove(partyName);
		}
	}
	
	/**
	 * Thêm thành viên vào party đã có.
	 * 
	 * @param String partyName tên party
	 * @param String member tên thành viên sẽ thêm
	 */
	public static void addMember(String partyName, String member) {
		if (hasParty(partyName)) {
			Party party = parties.get(partyName);
			party.addMember(member);
		}
	}
	
	/**
	 * Hiển thị danh sách các party đang có
	 */
	public static void showParties() {
		
		for (String key : parties.keySet()) {
			Party party = parties.get(key);
			System.out.println("Party: " + key + " - Leader: " + party.getLeader() + " - Members: " + party.getMembers());
		}
	}
	
	/**
	 * Clear party map
	 */
	public static void clear() {
		parties.clear();
	}
	
	/**
	 * Kiểm tra xem party đã có trong map 
	 * 
	 * @param String partyName tên party
	 * 
	 * @return boolean true nếu đã có, false nếu chưa có
	 */
	private static boolean hasParty(String partyName) {
		return parties.containsKey(partyName);
	}
	
}
