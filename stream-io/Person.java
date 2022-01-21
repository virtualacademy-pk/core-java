import java.io.Serializable;

public class Person implements Serializable{
   private int id;	// 4 bytes size as of int length
   private String name;	// maximum 15 char
   private String phone; // maximum 15 char
   private String email; // maximum 15 char
   public Person() {
	      this(0,"","","");
	   }

	   public Person(int id, String name,
	      String phone, String email) {
	      this.id = id;
	      this.name = name;
	      this.phone = phone;
	      this.email = email;
	     
	   }

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	 @Override
	   public String toString() {
	      return "Person [id=" + id + ", name="
	         + name + ", phone=" + phone
	         + ", email=" + email + "]";
	   }	   
}