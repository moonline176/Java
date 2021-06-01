package 도서관;

public class Member {
	private String name;
	private String Phone;
	
	public Member() {
		this("","");
	}
	
	public Member(String name, String phone) {
		super();
		this.name = name;
		this.Phone = phone;
	}
	
	public String getName() {
		return name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", Phone=" + Phone + "]";
	}

	
}
