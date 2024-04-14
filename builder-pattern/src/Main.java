import v1.*;
import v2.UserDTOV2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /* v1: Complex construction */
        User user1 = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO dto1 = directBuild(builder, user1);
        System.out.println(dto1);

        /* v2: In real world code */
        User user2 = createUser();
        UserDTOV2 dto2 = directBuildV2(UserDTOV2.getBuilder(), user2);
        System.out.println(dto2);
    }

    /* Method chaining: This is the builder director. The director know about the sequence of steps needed to create object */
    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();
    }

    /* v2 */
    private static UserDTOV2 directBuildV2(UserDTOV2.UserDTOBuilderV2 builder, User user) {
        return builder
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();
    }

    /* Getting a user object, usually from a persistence layer */
    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1999, 5, 3));
        user.setFirstName("Anderson");
        user.setLastName("Llanos");
        Address address = new Address();
        address.setHouseNumber("1");
        address.setStreet("#47-63");
        address.setCity("Bogotá");
        address.setState("Colombia");
        address.setZipCode("110231");
        user.setAddress(address);
        return user;
    }
}