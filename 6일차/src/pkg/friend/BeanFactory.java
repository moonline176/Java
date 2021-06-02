package pkg.friend;


public class BeanFactory {
	public static Object getBean(String beanName) {
		if( beanName.equals("samsung")) {
			return new FriendList();
		} else if ( beanName.equals("lg")) {
			return new FriendManager();
		}
		return null;
	}

}
