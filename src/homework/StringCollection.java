package homework;

public class StringCollection {

    private String[] stringCollection;
    private int index = 0;

    public StringCollection() {
        this.stringCollection = new String[10];
    }

    public StringCollection(int size) {
        this.stringCollection = new String[size];
    }

    public void add(String string) {
        this.stringCollection[this.index] = string;
        this.index++;
        if (this.index >= stringCollection.length) {
            String[] newStringCollection = new String[this.index * 2];
            for (int i = 0; i < stringCollection.length; i++) {
                newStringCollection[i] = stringCollection[i];

            }
            this.stringCollection = newStringCollection;
        }
    }

    public void addByIndex(String string, int indexToAdd) {
        if (this.stringCollection[indexToAdd] != null) {
            String temp = this.stringCollection[indexToAdd];
            this.stringCollection[indexToAdd] = string;
            this.add(temp);
        } else {
            this.stringCollection[indexToAdd] = string;
        }
    }


    public void delete(int indexToDelete) {
        this.stringCollection[indexToDelete] = this.stringCollection[this.index - 1];
        this.stringCollection[this.index - 1] = null;
        this.index--;
    }

    public void deleteByValue(String string) {
        for (int i = 0; i < this.index; i++) {
            if (stringCollection[i].equals(string)) {
                this.delete(i);
            }
        }
    }


    public int getSize() {
        return this.index;
    }

    public String get(int indexToGet) {
        return this.stringCollection[indexToGet];
    }

    @Override
    public String toString() {
        String stringToReturn = "";
        for (int i = 0; i < this.index; i++) {
            stringToReturn += this.stringCollection[i] + " ";
        }
        return stringToReturn;
    }

}
