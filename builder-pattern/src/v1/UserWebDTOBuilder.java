package v1;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder {

    private String fName, lName, age, address;

    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        fName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        lName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = STR."\{address.getHouseNumber()}, \{address.getStreet()} \{address.getCity()} - \{address.getState()}, \{address.getZipCode()}";
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(STR."\{fName} \{lName}", address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }

}
