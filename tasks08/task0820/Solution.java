package tasks08.task0820;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        HashMap<String, Pet> petMap = new HashMap<>();
        petMap = join(createDogs(), createCats());
        petMap = removeCats(petMap);
        printPets(petMap);
    }

    public static HashMap<String, Cat> createCats() {
        HashMap<String, Cat> catMap = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            Cat cat = new Cat();
            catMap.put("Cat" + i, cat);
        }
        return catMap;
    }

    public static HashMap<String, Dog> createDogs() {
        HashMap<String, Dog> dogMap = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            Dog dog = new Dog();
            dogMap.put("Dog" + i, dog);
        }
        return (dogMap);
    }

    public static HashMap<String, Pet> join(HashMap<String, Dog> dog, HashMap<String, Cat> cat) {
        HashMap<String, Pet> petMap = new HashMap<>();
        for (int i = 0; i < dog.size(); i++) {
            petMap.put("Dog" + i, dog.get("Dog" + i));
        }
        for (int i = 0; i < cat.size(); i++) {
            petMap.put("Cat" + i, cat.get("Cat" + i));
        }

        return petMap;
    }

    public static HashMap<String, Pet> removeCats(HashMap<String, Pet> petMap) {
        for (int i = 0; i < petMap.size(); i++) {
            petMap.remove("Cat" + i);
        }
        return (petMap);
    }

    public static void printPets(HashMap<String, Pet> petMap) {
        for (Pet pet : petMap.values()) {
            System.out.println(pet);
        }
    }

    public static class Pet {
        public Pet() {

        }
    }


    public static class Cat extends Pet {
        public Cat() {
            return;
        }
    }

    public static class Dog extends Pet {
        public Dog() {
            return;
        }
    }
}
