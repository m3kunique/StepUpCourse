package OOP;

public class Employee {
    private final String name;
    private Department department;

    public String getName() {
        return name;
    }

    public Employee(String name) {
        this.name = name;
    }

    public void setDepartment(Department dep) {
        department = dep;
        if (dep.getBoss() == null) department.setBoss(this);
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        if (department != null) {
            if (this.equals(department.getBoss())) {
                return String.format("%s начальник отдела %s", name, department.getTitle());
            } else {
                return String.format("%s работает в отделе %s, начальник которого %s", name, department.getTitle(), department.getBoss().getName());
            }
        }
        return String.format("Сотрудник: %s не закреплен за отделом", name);
    }
}
