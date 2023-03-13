package collection;

import element.AstartesCategory;
import element.CollectionPart;

import java.util.List;

public interface InteractiveCollection {
    void info();

    void add(CollectionPart elem);

    int size();

    void show();

    void update(long id, CollectionPart elem);

    void removeById(long id);

    void clear();

    void removeFirst();

    void head();

    void removeLower(CollectionPart elem);

    int countByCategory(AstartesCategory category);

    void filterContainsName(String namePart);

    void printFieldAscendingHeartCount();

    List<String> toStringList();

    void set(CollectionPart updelem, CollectionPart elem);
}
