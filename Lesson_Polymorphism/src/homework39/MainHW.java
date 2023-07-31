package homework39;

import java.io.IOException;

public class MainHW {

  // Создать класс `Food` (еда). В классе должны быть:
  // - поле "название"
  // - поле "калорийность"
  // - конструктор, геттеры, сеттеры
  // - метод "употребить еду" с каким-нибудь выводом.

  // Создать класс `Drink` (напиток) - наследника класса `Food`. В классе должны быть дополнительно:
  // - поле "газированный" (да/нет)
  // - поле "алкогольный" (да/нет)
  // - метод "открыть", который:
  //   - для газированного напитка печатает "пшш",
  //   - для негазированного - "скр",
  //   - а для алкогольного сначала спрашивает возраст и издаёт звук, только если возраст больше 18.
  public static void main(String[] args) throws IOException {
    Food sandwich = new Food("Бутерброд", 350);
    sandwich.eat();

    Drink beer = new Drink("Pilsner", 250, /*sparkling*/ true, /*alcohol*/ true);
    beer.open();
  }
}