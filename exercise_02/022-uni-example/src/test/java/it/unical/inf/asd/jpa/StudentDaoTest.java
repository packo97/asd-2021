package it.unical.inf.asd.jpa;

import it.unical.inf.asd.jpa.dao.CustomerDao;
import it.unical.inf.asd.jpa.dao.StudentDao;
import it.unical.inf.asd.jpa.entities.Address;
import it.unical.inf.asd.jpa.entities.Student;
import it.unical.inf.asd.jpa.entities.other.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.Month;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDaoTest {
    
    @Autowired
    private StudentDao studentDao;
    

    @Test
    public void whenFindingAllCustomers_thenCorrect() {
        Student johnDoe = new Student();
        johnDoe.setFirstName("John");
        johnDoe.setLastName("Doe");
        johnDoe.setBirthDateAsLocalDate(LocalDate.of(2000, Month.JANUARY, 18));
        johnDoe.setGender(Student.Gender.MALE);
        johnDoe.setWantsNewsletter(true);
        johnDoe.setAddress(new Address("Baker Street", "221B", "London"));
        studentDao.save(johnDoe);
    }
}