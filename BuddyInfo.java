public class BuddyInfo {


    private String name;
    private String phoneNumber;
    private String address;


    public String getName() {
        return name;
    }

    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }


    public BuddyInfo(){

    }

    public BuddyInfo(String name,String address,String phoneNumber){

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }







    public static void main(String[] args) {
        BuddyInfo names = new BuddyInfo("Homer","Carleton","22");
        System.out.println("Hello "+names.getName() );
        System.out.println("Address: "+names.getAddress());
        System.out.println("Number: "+names.getPhoneNumber());

    }
}
