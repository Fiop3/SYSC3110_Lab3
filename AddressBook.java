import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfos = new ArrayList<BuddyInfo>();



    public void addBuddy( BuddyInfo buddy ){
        buddyInfos.add(buddy);


    }
    public void removeBuddy(BuddyInfo buddyToRem){
       buddyInfos.remove(buddyToRem);
        }

    public static void main(String[] args) {
        // version 2
        BuddyInfo buddy = new BuddyInfo("Homer","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);

    }









}


