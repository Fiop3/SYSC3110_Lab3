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
        System.out.println("Address Book");

    }









}


