package collection;

import java.util.*;

import element.AstartesCategory;
import element.CollectionPart;

public class SpaceMarineCollection implements InteractiveCollection {
    private LinkedList<CollectionPart> data = new LinkedList<>();
    private java.time.LocalDate initDate;

    public SpaceMarineCollection() {
        this.initDate = java.time.LocalDate.now();
    }


    @Override
    public void info() {
        System.out.println("Initialization date: " + this.initDate);
        System.out.println("Type of collection: " + this.data.getClass());
        System.out.println("Type of stored element: " + this.data.getClass().getComponentType());
        System.out.println("Length of current collection: " + this.data.size());
    }


    @Override
    public void add(CollectionPart elem) {
        this.data.add(elem);
    }

    @Override
    public int size() {
        return this.data.size();
    }

    @Override
    public void show() {
        for (int i = 0; i < this.data.size(); i++) {
            System.out.println(this.data.get(i));
        }
    }

    @Override
    public void update(long id, CollectionPart elem) {
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getId() == id) {
                this.data.set(i, elem);
                break;
            }
        }
        System.out.println("No such id.");
    }

    @Override
    public void removeById(long id) {
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getId() == id) {
                this.data.remove(i);
                break;
            }
        }
    }

    @Override
    public void clear() {
        this.data.clear();
    }

    @Override
    public void removeFirst() {
        this.data.removeFirst();
    }

    @Override
    public void head() {
        try {
            System.out.println(this.data.getFirst());
        } catch (NoSuchElementException e) {
            System.out.println("Collection is empty");
        }
    }

    @Override
    public void removeLower(CollectionPart elem) {
        for (int i = 0; i < this.data.size(); i++) {
            if (elem.compareTo(this.data.get(i)) > 0) {
                this.data.remove(i);
            }
        }
    }

    @Override
    public int countByCategory(AstartesCategory category) {
        int counter = 0;
        for (int i = 0; i < this.data.size(); i++) {

            if (Objects.equals(this.data.get(i).getCategory(), category)) {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }

    @Override
    public void filterContainsName(String namePart) {
        for (int i = 0; i < this.data.size(); i++) {
            CollectionPart curElem = this.data.get(i);
            if (curElem.getName().contains(namePart)) {
                System.out.println(curElem);
            }
        }
    }

    @Override
    public void printFieldAscendingHeartCount() {
        List<Integer> heartCounts = new ArrayList<>();
        for (int i = 0; i < this.data.size(); i++) {
            heartCounts.add(this.data.get(i).getHeartCount());
        }
        Collections.sort(heartCounts);
        for (int j = 0; j < heartCounts.size(); j++) {
            System.out.println(heartCounts.get(j));
        }
    }

    @Override
    public List<String> toStringList() {
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < this.data.size(); i++) {
            strList.add(this.data.get(i).toLineCSV());
        }
        return strList;
    }


}
