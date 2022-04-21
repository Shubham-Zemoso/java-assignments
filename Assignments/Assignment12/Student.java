package JavaAssignments.Assignment12;

public class Student {
    int sid;
    String sname;
    int age;
    String gender;
    String dept;
    int batch;
    double aggregate;
    public Student(int sid, String sname, int age, String gender, String dept, int batch, double aggregate) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
        this.dept = dept;
        this.batch = batch;
        this.aggregate = aggregate;
    }

    public Student() {

    }

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDept() {
        return dept;
    }

    public int getBatch() {
        return batch;
    }

    public double getAggregate() {
        return aggregate;
    }
    void display(){
        System.out.println(sid+" "+
                sname+" "+
                age+" "+
                gender+" "+
                dept+" "+
                batch+" "+
                aggregate);
    }
}
