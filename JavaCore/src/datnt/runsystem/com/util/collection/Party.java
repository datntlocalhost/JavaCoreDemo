package datnt.runsystem.com.util.collection;

import java.util.HashSet;

public class Party {
	
	/**
	 * Tên của party
	 */
	private String partyName;
	
	/**
	 * Tên của trưởng nhóm
	 */
	private String leader;
	
	/**
	 * Danh sách thành viên trong nhóm, sử dụng Set để tránh các phần tử trùng nhau
	 */
	private HashSet<String> members;
	
	/**
	 * Hàm khởi tạo đối tượng Party
	 * 
	 * @param partyName được sử dụng để gán partyName cho party
	 * @param leader được sử dụng để gán leader cho party
	 * 
	 * @return Party trả về đối tượng Party mới được khởi tạo
	 */
	public Party(String partyName, String leader) {
		this.partyName = partyName;
		this.leader    = leader;
		this.members   = new HashSet<String>();
	}
	
	/**
	 * Lấy tên party
	 * 
	 * @return String partyName tên party
	 */
	public String getPartyName() {
		return partyName;
	}
	
	/**
	 * Set tên party
	 * 
	 * @param String partyName tên party cần set
	 */
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	
	/**
	 * Lấy tên leader của party
	 * 
	 * @return String tên leader của party
	 */
	public String getLeader() {
		return leader;
	}
	
	/**
	 * Set tên leader cho party
	 * 
	 * @param String leader tên leader cần gán
	 */
	public void setLeader(String leader) {
		this.leader = leader;
	}
	
	/**
	 * Lấy danh sách thành viên trong party
	 * 
	 * @return ArrayList members
	 */
	public HashSet<String> getMembers() {
		return members;
	}
	
	/**
	 * Thêm thành viên vào party
	 * 
	 * @param String member tên thành viên
	 */
	public void addMember(String member) {
		if (!this.isFull()) {
			this.members.add(member);
		}
	}
	
	/**
	 * Xóa thành viên ra khỏi party
	 * 
	 * @param String member tên thành viên
	 */
	public void removeMember(String member) {
		if (hasMember(member)) {
			this.members.remove(member);
		}
	}
	
	/**
	 * Kiểm tra thành viên có trong party không.
	 * 
	 * @param String member tên thành viên.
	 * 
	 * @return boolean true nếu có, false nếu không có. 
	 */
	private boolean hasMember(String member) {
		return this.members.contains(member);
	}
	
	/**
	 * Kiểm tra party đã full thành viên hay chưa
	 * 
	 * @return boolean true nếu số thành viên > 7
	 */
	private boolean isFull() {
		return this.members.size() > 7;
	}
}
