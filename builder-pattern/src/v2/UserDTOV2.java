package v2;

import v1.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserDTOV2 {

    private String name;

    private String address;

    private String age;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return STR."UserDTOV2{name='\{name}\{'\''}, address='\{address}\{'\''}, age='\{age}\{'\''}\{'}'}";
    }

    public static UserDTOBuilderV2 getBuilder() {
        return new UserDTOBuilderV2();
    }

    public static class UserDTOBuilderV2 {

        private String firstName;

        private String lastName;

        private String age;

        private String address;

        private UserDTOV2 userDTO;

        public UserDTOBuilderV2 withFirstName(String fname) {
            this.firstName = fname;
            return this;
        }

        public UserDTOBuilderV2 withLastName(String lname) {
            this.lastName = lname;
            return this;
        }

        public UserDTOBuilderV2 withBirthday(LocalDate date) {
            age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }

        public UserDTOBuilderV2 withAddress(Address address) {
            this.address = STR."\{address.getHouseNumber()}, \{address.getStreet()} \{address.getCity()} - \{address.getState()}, \{address.getZipCode()}";
            return this;
        }

        public UserDTOV2 build() {
            this.userDTO = new UserDTOV2();
            userDTO.setName(STR."\{firstName} \{lastName}");
            userDTO.setAddress(address);
            userDTO.setAge(age);
            return this.userDTO;
        }

        public UserDTOV2 getUserDTO() {
            return this.userDTO;
        }

    }
}
