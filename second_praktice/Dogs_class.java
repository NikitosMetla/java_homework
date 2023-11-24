package second_praktice;

public class Dogs_class {
    public static class Dog {
        private String name;
        private int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int calculateHumanAge() {
            return age * 7;
        }

        @Override
        public String toString() {
            return "Dog{name='" + name + "', age=" + age + '}';
        }
    }

    public static class DogKennel {
        private Dog[] dogs;
        private int numberOfDogs;

        public DogKennel(int capacity) {
            dogs = new Dog[capacity];
            numberOfDogs = 0;
        }

        public void addDog(Dog dog) {
            if (numberOfDogs < dogs.length) {
                dogs[numberOfDogs] = dog;
                numberOfDogs++;
                System.out.println("Dog added to the kennel: " + dog);
            } else {
                System.out.println("Kennel is full. Cannot add more dogs.");
            }
        }

        public void displayDogs() {
            System.out.println("Dogs in the kennel:");
            for (int i = 0; i < numberOfDogs; i++) {
                System.out.println(dogs[i]);
            }
        }
    }

    public static class DogTester {
        public static void main(String[] args) {
            Dog dog1 = new Dog("Buddy", 3);
            Dog dog2 = new Dog("Max", 5);
            Dog dog3 = new Dog("Lucy", 2);

            DogKennel kennel = new DogKennel(3);

            kennel.addDog(dog1);
            kennel.addDog(dog2);
            kennel.addDog(dog3);

            kennel.displayDogs();
        }
    }

}
