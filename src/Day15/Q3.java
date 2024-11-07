package Day15;

import java.util.Random;

class Water {
    private int quantity;

    Water(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void printQuantity() {
        System.out.println("물의 수량: " + quantity);
    }
}

class Person {
    private Water[] waters;

    Person(Water[] waters) {
        this.waters = waters;
    }

    public Water[] getWaters() {
        return waters;
    }

    public void setWaters(Water[] waters) {
        this.waters = waters;
    }

    public void printWaters() {
        System.out.println("이 사람의 물 수량:");
        for (Water water : waters) {
                
            water.printQuantity();
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        Random random = new Random();

        Water[] waterArray = new Water[30];
        for (int i = 0; i < waterArray.length; i++) {
            int quantity = random.nextInt(8) + 1; // 1~8 사이의 랜덤 수량 설정
            waterArray[i] = new Water(quantity);
        }

        Person[] people = new Person[3];
        for (int i = 0; i < people.length; i++) {
            Water[] personWaters = new Water[10];

            for (int j = 0; j < 10; j++) {
                personWaters[j] = waterArray[i * 10 + j];
            }

            people[i] = new Person(personWaters);
        }

        for (int i = 0; i < people.length; i++) {
            System.out.println((i + 1) + "번째 사람:");
            people[i].printWaters();
        }
    }
}
