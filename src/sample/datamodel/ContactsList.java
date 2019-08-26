package sample.datamodel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ContactsList {

    private ObservableList<Contact> contacts;

    public ContactsList() {
        contacts = FXCollections.observableArrayList();
    }

    public ObservableList<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public void deleteContact(Contact contact){
        contacts.remove(contact);
    }

}
