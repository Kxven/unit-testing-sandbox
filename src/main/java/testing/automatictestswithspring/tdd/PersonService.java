package testing.automatictestswithspring.tdd;

import testing.automatictestswithspring.tdd.model.Person;

public class PersonService implements IPersonService{

    @Override
    public Person createPerson(Person person) {

        return person;
    }
}
