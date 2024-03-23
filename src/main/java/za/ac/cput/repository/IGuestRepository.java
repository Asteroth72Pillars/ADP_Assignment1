package za.ac.cput.repository;

import za.ac.cput.domain.Guest;

import java.util.List;
/*IGuestRepository.java
IGuestRepository class
Author: Moegamat Isgak Abzal (221321810)
Date: 19 March 2024
*/
public interface IGuestRepository extends IRepository<Guest,String> {
    Guest create(Guest guest);

    Guest findById(String s);
    Guest update(Guest guest);
    boolean delete(String id);

    List<Guest> getAll();
}
