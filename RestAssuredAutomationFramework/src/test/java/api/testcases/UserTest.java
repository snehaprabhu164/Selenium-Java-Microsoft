package api.testcases;

import api.payroll.User;
import com.github.javafaker.Faker;
import org.testng.annotations.BeforeClass;

public class UserTest {

    Faker faker;
    User payload;

    @BeforeClass
    public void generateTestData() {

        faker = new Faker();
        payload = new User();

        payload.setId(faker.idNumber().hashCode());
        payload.setUsername(faker.name().username());
        payload.setFirstName(faker.name().firstName());
        payload.setLastName(faker.name().lastName());
        payload.setEmail(faker.internet().emailAddress());
        payload.setPassword(faker.internet().password());
        payload.setPhone(faker.phoneNumber().cellPhone());
    }
}
