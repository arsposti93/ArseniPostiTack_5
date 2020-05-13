package com.Store;

import com.Car.Car;
import com.company.Movable;

import java.util.List;
import java.util.Objects;

public class Store<T extends Movable> {

    private int cash;
    private List<T> store1;
    private int delivery;


    public Store(int cash, List<T> store1) {
        this.cash = cash;
        this.store1 = store1;
    }

    public void printList(List<T> store1) {
        for (T element : store1) {
            System.out.println(element.showShortInfo());
        }
    }

    public List<T> purchase(int money, int numberOfPositionInStore) {
        delivery = money - store1.get(numberOfPositionInStore).getPrice();
        if (numberOfPositionInStore >= store1.size() || numberOfPositionInStore < 0) {
            System.out.println("Вы ввели не существующий номер");
        } else if (delivery >= 0 && store1.get(numberOfPositionInStore).getPrice() != 0) {
            cash = cash + store1.get(numberOfPositionInStore).getPrice();

            System.out.println("Вы приобрели товар за " + store1.get(numberOfPositionInStore).getPrice()
                    + ", ваша сдача " + delivery);
            store1.remove(numberOfPositionInStore);
        } else if (store1.get(numberOfPositionInStore).getPrice() == 0) {
            System.out.println(" Цена товара не указана");
        } else {
            System.out.println("Недостаточно средств");
        }
        return store1;
    }

    public T sell(int money, T movable) {
        if (money <= movable.getPrice() && money > 0 && cash >= money) {
            store1.add(movable);
            cash = cash - money;
            System.out.println("Вы продали товар за " + money);
        } else if (cash < money) {
            System.out.println("В магазине недостаточно средств чтобь купить товар");
        } else if (money > movable.getPrice()) {
            System.out.println("Вы предлагаете слишком завышенную цену");
        } else if (money == 0) {
            store1.add(movable);
            System.out.println("Спасибо, за благотворительность ");
        } else if (money < 0) {
            store1.add(movable);
            cash = cash - money;
            System.out.println("Ваш товар принят, вы заплатили " + (Math.abs(money)));
        }
        return movable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Store)) return false;
        Store<?> store = (Store<?>) o;
        return getCash() == store.getCash() &&
                delivery == store.delivery &&
                getStore1().equals(store.getStore1());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCash(), getStore1(), delivery);
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public List<T> getStore1() {
        return store1;
    }

    public void setStore1(List<T> store1) {
        this.store1 = store1;
    }
}
