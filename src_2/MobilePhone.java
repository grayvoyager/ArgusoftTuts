import java.util.ArrayList;

class Contact{
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    static Contact createContact(String name, String phoneNumber){
        Contact con = new Contact(name,phoneNumber);
        return con;
    }
}

public class MobilePhone {
    private String myNumber;
    ArrayList<Contact> myContacts;
    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        return !myContacts.contains(contact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if(myContacts.remove(oldContact)){
            myContacts.add(newContact);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        return myContacts.remove(contact);
    }

    public int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    public Contact queryContact(String name){
        for(Contact contact:myContacts){
            if(contact.getName().equalsIgnoreCase(name)){
                return contact;
            }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(Contact contact:myContacts){
            System.out.println(contact.getName()+" -> "+ contact.getPhoneNumber());
        }
    }
}
