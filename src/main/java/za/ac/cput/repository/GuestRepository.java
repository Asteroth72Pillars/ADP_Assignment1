package za.ac.cput.repository;

import za.ac.cput.domain.Guest;

import java.util.ArrayList;
import java.util.List;

/*GuestRepository.java
GuestRepository class
Author: Moegamat Isgak Abzal (221321810)
Date: 19 March 2024
*/
public class GuestRepository implements IGuestRepository {

    public static IGuestRepository repository = null;
    private List<Guest> guestList;

    public GuestRepository() {
        guestList = new ArrayList<Guest>();
    }

    public static IGuestRepository getRepository() {
        if (repository == null) {
            repository = new GuestRepository();
        }
        return repository;
    }

    @Override
    public Guest create(Guest guest) {
        //  add guest to list|? condtion operator|return guest if added:return null if failed to add
        return guestList.add(guest) ? guest : null;
    }

    @Override
    public Guest findById(String s) {
        for (Guest g : guestList) {
            if (s.equals(g.getGuestID())) {
                System.out.println("success");
                return g;
            }
        }
        return null;
    }

    @Override
    public Guest update(Guest guest) {
        String id = guest.getGuestID();
        Guest oldGuest = findById(id);
        if (oldGuest == null) {
            return null;
        }
        boolean success = delete(id);
        if (success) {
            if (guestList.add(guest)) ;
            return guest;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Guest guestDelete = findById(id);
        if (guestDelete == null)
            return false;
        return (guestList.remove(guestDelete));
    }
    @Override
    public List<Guest> getAll() {
        return guestList;
    }

}
