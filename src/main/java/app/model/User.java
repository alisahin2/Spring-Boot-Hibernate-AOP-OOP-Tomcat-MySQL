package app.model;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column()
	private int id;
	
	@Column()
	private String name;
	
	@Column()
	private String surname;
	
	@Column()
	private String phone;
	
	@Column()
	private Date startedDate;

	@Column()
	private String adress;
	
	@Column()
	private String about;
	
	@Column()
	private int salary;
	
	@Column()
	private boolean visibility;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(Date startedDate) {
		this.startedDate = startedDate;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean isVisibility() {
		return visibility;
	}

	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}
	
	public User() {
		
	}

	public User(int id, String name, String surname, String phone, Date startedDate, String adress, String about,
			int salary, boolean visibility) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.startedDate = startedDate;
		this.adress = adress;
		this.about = about;
		this.salary = salary;
		this.visibility = visibility;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", phone=" + phone + ", startedDate="
				+ startedDate + ", adress=" + adress + ", about=" + about + ", salary=" + salary + ", visibility="
				+ visibility + "]";
	}
}
