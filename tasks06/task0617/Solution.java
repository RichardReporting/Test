package tasks06.task0617;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Idea idea = new Idea();
        idea.description = s.nextLine();
        printIdea(idea);
    }

    public static void printIdea(Idea idea) {
        System.out.print(idea.description);
    }

    public static class Idea {
        String description;

        public String getDescription() {
            return (description);
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
