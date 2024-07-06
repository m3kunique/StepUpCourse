package OOP;

public class Department {
    private Employee boss;
    private String title;

    public Department(String title) {
        this.title = title;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
        if(boss.getDepartment() != this)
            boss.setDepartment(this);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Employee getBoss() {
        return boss;
    }
}
