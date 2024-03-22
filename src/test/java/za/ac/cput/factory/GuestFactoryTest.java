package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Guest;

import static org.junit.jupiter.api.Assertions.*;
/*GuestRepositoryTest.java
GuestRepositoryTest class
Author: Moegamat Isgak Abzal (221321810)
Date: 21 March 2024
*/
class GuestFactoryTest {
@Test
    void buildGuest(){
    Guest g= GuestFactory.buildGuest("0041322","Moegamat","Abzal","0879851324","13 drive Belhar","abzal200@gmail.com");
    Guest g2=g;

    assertNotNull(g);
    assertEquals(g,g2);
}
@Test
    void missingDetails(){
    Guest g= GuestFactory.buildGuest("0041322","Moegamat","Abzal","0879851324","13 drive Belhar",null);
    assertNull(g);
}
@Test
    void buildGeneratedId(){
    Guest g= GuestFactory.buildGuest("Moegamat","Abzal","0879851324","13 drive Belhar","abzal200@gmail.com");
    Guest g2=g;

    assertNotNull(g);
    assertEquals(g,g2);

}
}