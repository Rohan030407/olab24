package newshelf;

import oldshelf.FictionType;

record Fiction(String name, FictionType fictionType) implements IBook {
    @Override
    public String getTitle() {
        return name;
    }
}
