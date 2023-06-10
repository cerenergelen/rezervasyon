package airlinereservation;

public class user {
    private Name name;
    private String telephoneNumber;
    private int age;
    private String gender;

    public user() {
        name = new Name();
        this.telephoneNumber = "";
        this.age = 0;
        this.gender = "";
    }

    public user(Name name, String telephoneNumber, int age, String gender) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.age = age;
        this.gender = gender;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Name getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name.toString() + " @" + telephoneNumber + " (Age: " + age + ", Gender: " + gender + ")";
    }

    public static void main(String[] args) {
        user.Name userName = new user().new Name();
        userName.setFirstName("ceren");
        userName.setLastName("ergelen");

        user userObject = new user(userName, "5443333434", 22, "kadin");
        System.out.println(userObject.toString());
    }

    public class Name {
        private String firstName;
        private String lastName;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }
}


		      
		
