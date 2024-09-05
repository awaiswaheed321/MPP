package prob1;


import java.util.Objects;

public class Person {
    private String name;
    private Job job;

    Person(String n) {
        name = n;
    }

    Person(String n, Double salary) {
        name = n;
        job = new Job(salary);
    }

    public String getName() {
        return name;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job=" + job +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(job, person.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, job);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Joe", 30000.0);
        Person p2 = new Person("Joe");
        Person p3 = new Person("Joe", 30000.0);
        Person p4 = new Person("Joe");
        Person p5 = new Person("Hana", 30000.0);
        Person p6 = new Person("Hana", 60000.0);
        System.out.println("P1: " + p1);
        System.out.println("P2: " + p2);
        System.out.println("P3: " + p3);
        System.out.println("P4: " + p4);
        System.out.println("P5: " + p5);
        System.out.println("P6: " + p6);
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("p3.equals(p1)? " + p3.equals(p1));
        System.out.println("p4.equals(p2)? " + p4.equals(p2));
        System.out.println("p5.equals(p1)? " + p5.equals(p1));
        System.out.println("p5.equals(p6)? " + p5.equals(p6));
    }

}
