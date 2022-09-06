package javaclz;

public class Employee {
    private int key;
    private String name;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String department;


    public Employee(int key,String name,String dpt){
        this.name =name;
        this.key = key;
        this.department =dpt;
    }

}
