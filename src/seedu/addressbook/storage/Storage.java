package seedu.addressbook.storage;

import java.nio.file.Path;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

public interface Storage {

	public static boolean isValidPath(Path filepath) {
		return false;
	}

    public String getPath();

    public AddressBook load() throws StorageOperationException;

    public void save(AddressBook addressBook) throws StorageOperationException;
}