package Collections.ObjectCloning;

public class Example {
    static class Person implements Cloneable {
        private String name;
        private int age;
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        @Override
        public Person clone() throws CloneNotSupportedException {
            return (Person) super.clone(); // Calling Object's clone method
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

    public static void main(String[] args) {
        try {
            Person originalPerson = new Person("John", 25);
            System.out.println("Original Person: " + originalPerson);
            Person clonedPerson = originalPerson.clone();
            System.out.println("Cloned Person: " + clonedPerson);
            clonedPerson.setName("Doe");
            clonedPerson.setAge(30);
            System.out.println("Modified Cloned Person: " + clonedPerson);
            System.out.println("Original Person after cloning: " + originalPerson);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

