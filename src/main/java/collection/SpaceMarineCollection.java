package collection;

import java.util.*;

import element.AstartesCategory;
import element.CollectionPart;

public class SpaceMarineCollection implements InteractiveCollection {
  private final LinkedList<CollectionPart> data = new LinkedList<>();
  private final java.time.LocalDate initDate;

  public SpaceMarineCollection() {
    this.initDate = java.time.LocalDate.now();
  }

  @Override
  public void info() {
    System.out.println("Initialization date: " + this.initDate);
    System.out.println("Type of collection: " + this.data.getClass().getName());
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
    for (CollectionPart curElem : this.data) {
      System.out.println(curElem);
    }
  }

  @Override
  public void update(long id, CollectionPart elem) {
    int i = 0;
    elem.reduceNextId();
    for (CollectionPart curElem : this.data) {
      if (curElem.getId() == id) {
        this.set(curElem, elem);
        break;
      }
      if (i == this.data.size() - 1) {
        System.out.println("No such id.");
      }
      i++;
    }
  }

  @Override
  public void removeById(long id) {
    int i = 0;
    if (this.data.size() == 0) {
      System.out.println("Collection is empty");
    }
    for (CollectionPart curElem : this.data) {
      if (curElem.getId() == id) {
        System.out.printf("Element with id %d deleted.%n", curElem.getId());
        this.data.remove(i);
        break;
      }
      if (i == this.data.size() - 1) {
        System.out.println("No such id.");
      }
      i++;
    }
  }

  @Override
  public void clear() {
    this.data.clear();
  }

  @Override
  public void removeFirst() {
    try {
      this.data.removeFirst();
    } catch (NoSuchElementException e) {
      System.out.println("Collection is empty");
    }
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
    elem.reduceNextId();
    Iterator<CollectionPart> iterator = this.data.iterator();
    CollectionPart curElem;
    while (iterator.hasNext()) {
      curElem = iterator.next();
      if (elem.compareTo(curElem) > 0) {
        System.out.printf("Element with id %d deleted.%n", curElem.getId());
        iterator.remove();
      }
    }
  }

  @Override
  public int countByCategory(AstartesCategory category) {
    int counter = 0;
    for (CollectionPart curElem : this.data) {

      if (Objects.equals(curElem.getCategory(), category)) {
        counter++;
      }
    }
    System.out.println(counter);
    return counter;
  }

  @Override
  public void filterContainsName(String namePart) {
    for (CollectionPart curElem : this.data) {
      if (curElem.getName().contains(namePart)) {
        System.out.println(curElem);
      }
    }
  }

  @Override
  public void printFieldAscendingHeartCount() {
    List<Integer> heartCounts = new ArrayList<>();
    for (CollectionPart curElem : this.data) {
      heartCounts.add(curElem.getHeartCount());
    }
    Collections.sort(heartCounts);
    for (Integer heartCount : heartCounts) {
      System.out.println(heartCount);
    }
  }

  @Override
  public List<String> toStringList() {
    List<String> strList = new ArrayList<>();
    for (CollectionPart curElem : this.data) {
      strList.add(curElem.toLineCSV());
    }
    return strList;
  }

  @Override
  public void set(CollectionPart updElem, CollectionPart elem) {
    updElem.setName(elem.getName());
    updElem.setCoordinates(elem.getCoordinates());
    updElem.setHealth(elem.getHealth());
    updElem.setHeartCount(elem.getHeartCount());
    updElem.setCategory(elem.getCategory());
    updElem.setMeleeWeapon(elem.getMeleeWeapon());
    updElem.setChapter(elem.getChapter());
  }
}
