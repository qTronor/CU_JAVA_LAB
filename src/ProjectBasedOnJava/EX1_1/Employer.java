package ProjectBasedOnJava.EX1_1;
public class Employer {
    public int id;
    public String name;
    public String joinDate;
    public char desigCode;
    public String dept;
    public int basic;
    public int
            hra;
    public int it;

    public Employer(int id, String name, String joinDate, char desigCode, String dept, int basic, int hra, int it) {
        this.id = id;
        this.name = name;
        this.joinDate = joinDate;
        this.desigCode = desigCode;
        this.dept = dept;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public char getDesigCode() {
        return desigCode;
    }

    public String getDept() {
        return dept;
    }

    public int getBasic() {
        return basic;
    }

    public int getHra() {
        return hra;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public void setDesigCode(char desigCode) {
        this.desigCode = desigCode;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    public void setHra(int hra) {
        this.hra = hra;
    }

    public void setIt(int it) {
        this.it = it;
    }

    public int getIt() {
        return it;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", Name=" + name +
                ", joinDate='" + joinDate + '\'' +
                ", desigCode=" + desigCode +
                ", dept='" + dept + '\'' +
                ", basic=" + basic +
                ", hra=" + hra +
                ", it=" + it +
                '}';
    }
}
