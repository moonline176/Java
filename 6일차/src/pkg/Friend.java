package pkg;

public class Friend {
	protected String gubun;
	private String name;
	protected String tel;
	
	public Friend() {}
	
	public Friend(String gubun, String name, String tel) {
		super();
		this.gubun = gubun;
		this.setName(name);
		this.tel = tel;
	}
	
	public void print() {
		System.out.printf("친구: %20s %20s %20s\n",gubun,getName(),tel);
	}

	@Override
	public String toString() {
		return "Friend [gubun=" + gubun + ", name=" + getName() + ", tel=" + tel + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
