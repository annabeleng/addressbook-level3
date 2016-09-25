package seedu.addressbook.storage;

import java.nio.file.Paths;
import java.nio.file.Path;

import seedu.addressbook.data.AddressBook;

import seedu.addressbook.storage.StorageFile.StorageOperationException;


public class StorageStub implements Storage {

    public final Path path;

    public StorageStub(String filePath) {
        path = Paths.get(filePath);
    }

    @Override
    public AddressBook load() {
        return new AddressBook();
    }

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {


    }

    @Override
    public String getPath() {
        return null;
    }

}
