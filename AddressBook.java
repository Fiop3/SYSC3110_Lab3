import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfos = new ArrayList<BuddyInfo>();



    public void addBuddy( BuddyInfo buddy ){
        if (buddy!=null) {
            buddyInfos.add(buddy);
        }


    }
    public BuddyInfo removeBuddy(int index){

        if(index >= 0 && index < buddyInfos.size()){
            return buddyInfos.remove(index);
        }


        return null;
        }

    public static void main(String[] args) {
        // version 2
        BuddyInfo buddy = new BuddyInfo("Homer","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
        System.out.println(addressBook);

    }









}


