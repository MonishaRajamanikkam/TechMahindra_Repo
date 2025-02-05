package override;

public class User {
	    private String name;
	    private int age;

	    // Constructor
	    public User(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getters and Setters
	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }
	    
	    public int getAge() { return age; }
	    public void setAge(int age) { this.age = age; }

	    // Override toString()
	    @Override
	    public String toString() {
	        return "User{name='" + name + "', age=" + age + "}";
	    }

	    // Override equals()
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        User user = (User) obj;
	        return age == user.age && name.equals(user.name);
	    }

	    // Override hashCode()
	    @Override
	    public int hashCode() {
	        int result = name.hashCode();
	        result = 31 * result + age;
	        return result;
	    }
	}



