package v1;

public class UserWebDTO implements UserDTO {

    private String name, address, age;

    public UserWebDTO(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return STR."UserWebDTO{name='\{name}\{'\''}, address='\{address}\{'\''}, age='\{age}\{'\''}\{'}'}";
    }

}
