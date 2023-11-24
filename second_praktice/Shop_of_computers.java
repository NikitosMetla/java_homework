package second_praktice;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop_of_computers {
    public static class Computer {
        private String brand;
        private String model;

        public Computer(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        @Override
        public String toString() {
            return brand + " " + model;
        }
    }

    public static class Shop {
        private ArrayList<Computer> computers = new ArrayList<>();

        public void addComputer(Computer computer) {
            computers.add(computer);
            System.out.println("Computer added to the shop: " + computer);
        }

        public void searchByBrand(String brand) {
            for (Computer computer : computers) {
                if (computer.getBrand().equalsIgnoreCase(brand)) {
                    System.out.println("Computer found in the shop: " + computer);
                    return;
                }
            }
            System.out.println("Computer with brand " + brand + " not found in the shop.");
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Shop computerShop = new Shop();
            Scanner scanner = new Scanner(System.in);

            computerShop.addComputer(new Computer("HP", "Pavilion"));
            computerShop.addComputer(new Computer("Dell", "Inspiron"));
            computerShop.addComputer(new Computer("Lenovo", "ThinkPad"));

            System.out.print("Enter the brand of the computer to search: ");
            String brandToSearch = scanner.nextLine();
            computerShop.searchByBrand(brandToSearch);

            scanner.close();
        }
    }

}
