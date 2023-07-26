import java.util.ArrayList;
import java.util.List;

// MenuItem 클래스: 커피 종류나 음료에 대한 정보를 나타내는 클래스
public class MenuItem {
	String name;
	String description;
	double price;
	List<Language> availableLanguages;

	public MenuItem(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.availableLanguages = new ArrayList<>();
	}

	public void addLanguage(Language language) {
		availableLanguages.add(language);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Language> getAvailableLanguages() {
		return availableLanguages;
	}

}
