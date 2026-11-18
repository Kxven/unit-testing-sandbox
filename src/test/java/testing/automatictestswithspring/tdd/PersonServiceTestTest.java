package testing.automatictestswithspring.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testing.automatictestswithspring.tdd.model.Person;

import static org.junit.jupiter.api.Assertions.*;


class PersonServiceTestTest {
    Person person;

    @BeforeEach
    void setup() {
        person = new Person(
                "Keith",
                "Pereira",
                "keithpereira@gmail.com",
                "São Paulo - SP",
                "Male"
        );
    }

    @Test
    @DisplayName("When Create a Person With sucess should return a person")
    void testCreatePerson_WhenSucess_ShouldReturnPersonObject() {

        // given
        IPersonService service = new PersonService();

        // when
        Person acutal = service.createPerson(person);
    
        // then
        assertNotNull(acutal, () -> "The create person should not have returned null");
    }

    @Test
    @DisplayName("When Create a Person With sucess should contains first name in returned person object")
    void testCreatePerson_WhenSucess_ShouldConstainsFirstNameInReturnedPersonObject() {
        // given
        IPersonService service = new PersonService();

        // when
        Person acutal = service.createPerson(person);

        // then
        assertNotNull(acutal, () -> "The create person should not have returned null");
        assertEquals(person.getFirstname(),  acutal.getFirstname(), ()-> "The first name is diferent");
    }

    @Test
    @DisplayName("When createa person with sucess should contains last name in returned person object")
    void testCreatePerson_WhenSucess_ShouldConstainsLastNameInReturnedPersonObject() {
        // given
        IPersonService service = new PersonService();

        // when
        Person actual = service.createPerson(person);

        // then
        assertNotNull(actual, () -> "The create person should not have returned null");
        assertEquals(person.getLastname(), actual.getLastname(), () -> "The last name is diferent");
    }

    @Test
    @DisplayName("When createa person with sucess should contains email in returned person object")
    void testCreatePerson_WhenSucess_ShouldConstainsEmailInReturnedPersonObject() {
        // given
        IPersonService service = new PersonService();

        // when
        Person actual = service.createPerson(person);

        // then
        assertNotNull(actual,  () -> "The create person should not have returned null");
        assertEquals(person.getEmail(), actual.getEmail(), ()-> "The last name is diferent");
    }
    @Test
    @DisplayName("When createa person with sucess should contains address in returned person object")
    void testCreatePerson_WhenSucess_ShouldConstainsAddressReturnedPersonObject() {
        // given
        IPersonService service = new PersonService();

        // when
        Person actual = service.createPerson(person);

        // then
        assertNotNull(actual,  () -> "The create person should not have returned null");
        assertEquals(person.getAddress(), actual.getAddress(), ()-> "The last name is diferent");
    }

    @Test
    @DisplayName("When createa person with sucess should contains gender in returned person object")
    void testCreatePerson_WhenSucess_ShouldConstainsGenderReturnedPersonObject() {
        // given
        IPersonService service = new PersonService();

        // when
        Person actual = service.createPerson(person);

        // then
        assertNotNull(actual,  () -> "The create person should not have returned null");
        assertEquals(person.getGender(), actual.getGender(), ()-> "The last name is diferent");
    }


}