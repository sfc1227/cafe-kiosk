
import java.util.List;
import java.util.ArrayList;

public class Admin {
	List<AccountInfo> accountInfoList = null;
	List<MenuItem> menuList = null;
	
	public Admin() {
		accountInfoList = new ArrayList<AccountInfo>();
		menuList = new ArrayList<MenuItem>();
	}
	
	public static Admin instance = null;
	
	
	public static Admin getInstance() {
		
		if(instance == null) {
			instance = new Admin();
		}
		
		return instance;
	}
	
	public boolean IsValidPhoneNumber(String phoneNumber) {
		
		for(int i=0; i<accountInfoList.size(); i++) {
			if(accountInfoList.get(i).getPhoneNumber() == phoneNumber) {
				return true;
			}
		}
		
		return false;
	}
	public boolean registerMember(AccountInfo account) {
		
		accountInfoList.add(account);
		
		return true;
	}
	
	public boolean deleteMember(AccountInfo account) {
		
		for(int i=0;i<accountInfoList.size();i++) {
			if(accountInfoList.get(i).getPhoneNumber() == account.getPhoneNumber()) {
				accountInfoList.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	public boolean addMenu(MenuItem menu) {
		
		menuList.add(menu);
		
		return true;
	}
	public boolean deleteMenu(MenuItem menu) {
	
		for(int i=0;i<menuList.size();i++) {
			if(menuList.get(i).getName() == menu.getName()) {
				menuList.remove(i);
				return true;
			}
		}
	
		return false;
	}
	
	
	
	
}
