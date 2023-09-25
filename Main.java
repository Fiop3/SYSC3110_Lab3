public class Main {
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}