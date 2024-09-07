package prob1;

import java.util.Objects;

public class Job {
    private Double salary;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Job(Double salary) {
        this.salary = salary;
    }

    public Job() {
    }

    @Override
    public String toString() {
        return "Job{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return Objects.equals(salary, job.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(salary);
    }
}
