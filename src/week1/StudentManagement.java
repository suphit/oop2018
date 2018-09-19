public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public Student[] students = new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    void studentsByGroup() {
        // TODO:
        int k = this.students.length;
        System.out.println("Danh sach sinh vien lop INT22041:");
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getGroup().equals("INT22041") && this.students[i].getName()!= "Student") {
                System.out.println(this.students[i].getInfo());
            }
        }
        System.out.println("Danh sach sinh vien lop INT22044:");
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getGroup().equals("INT22044") && this.students[i].getName()!= "Student") {
                System.out.println(this.students[i].getInfo());
            }
        }
    }

    void removeStudent(String id) {
        // TODO:
        int i,j;
        for (i = 0; i < this.students.length; i++) {
            if (this.students[i].getID().equals(id)) {
                break;
            }
        }
        for (j = i; j < (this.students.length)-1; j++) {
            this.students[j] = this.students[j + 1];
        }
        this.students[(this.students.length)-1] = new Student();
    }


    public static void main(String[] args) {
        // TODO:
   
        Student s = new Student();
        
        
        
        Student s1 = new Student();
        s1.setName("Su phit Phom machan");
        s1.setID("17020190");
        s1.setGroup("INT22044");
        s1.setEmail("souphitpmc@gmail.com");
        System.out.println(s1.getInfo());
        
        
        
        
        Student s2 = new Student();
        Student s3 = new Student("Kham may","15020190","khammay@gmail.com");
        Student s4 = new Student(s3);
        System.out.println(s2.getInfo());
        System.out.println(s3.getInfo());
        System.out.println(s4.getInfo());
        
        
        
        StudentManagement stdm = new StudentManagement();
        Student s5 = new Student("Som phong","14020190","somphong@gmail.com");
        System.out.println(stdm.sameGroup(s1,s3));
        System.out.println(stdm.sameGroup(s3,s5));
        
        
        
        Student[] stlist = stdm.students;
        for (int i=0;i<100;i++){
            stlist[i] = new Student();
        }
       
        
        
        
        stlist[0]=s1;
        stlist[1]=s3;
        stlist[2]=s5;
        stdm.studentsByGroup();
        System.out.println("Danh sach sinh vien sau khi xoa ID: 15020190");
        stdm.removeStudent("15020190");
        for (int i=0;i<stdm.students.length;i++){
            if (stdm.students[i].getName()!="Student"){
                System.out.println(stdm.students[i].getInfo());
            }
        }

    }
}
