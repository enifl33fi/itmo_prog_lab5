package element;

import exceptions.WrongFieldException;

public class Coordinates {
  private int x; // Максимальное значение поля: 201
  private int y; // Значение поля должно быть больше -440

  public Coordinates(int x, int y) {
    if (y <= -440) {
      throw new WrongFieldException("The value of the y field must be greater than -440");
    }
    if (x > 201) {
      throw new WrongFieldException("The value of the x field must be less than or equal to 201");
    }
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }
}
