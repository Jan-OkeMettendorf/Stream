package de.neuefische.stream.schulung;

public class Student {

    private String name;
    private String postalCode;
    private String age;

    public Student(String name, String number, String age) {
        this.name = name;
        this.postalCode = number;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
