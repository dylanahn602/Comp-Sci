public class Student {
    
    private String name;
    private String id;
    private int grade;

    public Student(String newName) {
        name = newName;
        grade = 10;
        id = generateId();
    }
    public Student(String newName, int newGrade) {
        name = newName;
        grade = newGrade;
        id = generateId();
    }

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }
    public String getId() {
        return id;
    }
    public void setId(String newId) {
        id = newId;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int newGrade) {
        grade = newGrade;
    }

    public String toString() {
        return name+ "is in grade "+grade+" and their id is "+id; 
    }
    public boolean equals(Student other) {
        return (id.equals(other.id) && grade == other.grade && name.equals(other.name));
    }
    public String generateId() {
        return ((int) (Math.random() * 799) + 100) + "-" + ((int) (Math.random() * 8999) + 1000);
    }

}
