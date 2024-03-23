package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Guest;
import za.ac.cput.factory.GuestFactory;

import static org.junit.jupiter.api.Assertions.*;

/*GuestRepositoryTest.java
GuestRepositoryTest class
Author: Moegamat Isgak Abzal (221321810)
Date: 21 March 2024
*/
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class GuestRepositoryTest {
private static IGuestRepository repository=GuestRepository.getRepository();
private Guest guest= GuestFactory.buildGuest("0041322","Moegamat","Abzal","0879851324","13 drive Belhar","abzal200@gmail.com");
    private Guest guest2= GuestFactory.buildGuest("0148910","Kashief","Abzal","0777822144","30 fly str Belhar","kashief22@gmail.com");
@Test
    @Order(1)
    void create(){
Guest create=repository.create(guest);
    Guest create2=repository.create(guest2);
assertNotNull(create);
    assertNotNull(create2);
System.out.println("created");
}
@Test
    @Order(2)
    void read(){
    Guest read=repository.findById(guest.getGuestID());
    assertNotNull(read);
    System.out.println(read);

}
@Test
    @Order(3)
        void update() {
    Guest guestUpdate = new Guest.Builder().copy(guest).setFirstName("Moegamat isgak").build();
    Guest update = repository.update(guestUpdate);
    assertNotNull(update);
    System.out.println("SUCCESS UPDATING NAME");
}
@Test
    @Order(4)
    void delete(){
    assertTrue(repository.delete(guest.getGuestID()));
    System.out.println("guest deleted");
    Guest read=repository.findById(guest.getGuestID());
}
@Test
    @Order(5)
    void getAll(){
    System.out.println(repository.getAll().toString());
}
}