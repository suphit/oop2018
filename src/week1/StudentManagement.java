package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student students[] = new Student[100];

    public  boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    void studentsByGroup() {
        // TODO:
        System.out.println("List of student in classroom INT 22041");
        for(int i=0;students[i]!=null;i++)
        {
            if(this.students[i].getGroup().equals("INT 22041"))
            {
                System.out.println(this.students[i].getInfo());
            }
        }
        System.out.println("List of student in classroom INT 22042");
        for(int i=0;students[i]!=null;i++)
        {
            if(this.students[i].getGroup().equals("INT 22042"))
            {
                System.out.println(this.students[i].getInfo());
            }
        }

    }

    void removeStudent(String id) {
        // TODO:
        int vitri = 0 , n = students.length;
        for(int i=0;i<n;i++)
        {
            if(this.students[i].getId().equals(id))
            {
                vitri = i;
                break;
            }
        }
        for(int i = vitri ; i<n-1;i++)
        {
            this.students[i] = this.students[i+1];
        }
        this.students[n-1] = null;
        n--;
    }
    public static void main(String[] args) {
        // TODO:
        Student hocSinh1 = new Student();

        Student hocSinh2 = new Student("arm" , "17020190" , "arm@vnu.edu.vn");

        Student hocSinh3 = new Student(hocSinh2);

        StudentManagement st = new StudentManagement();

        st.students[0]= new Student();
        st.students[0].setName("tink");
        st.students[0].setId("19020191");
        st.students[0].setGroup("INT 22041");
        st.students[0].setEmail("tink@vnu.edu.vn");

        st.students[1] = new Student();
        st.students[1].setName("pda");
        st.students[1].setId("19020190");
        st.students[1].setGroup("INT 22041");
        st.students[1].setEmail("19020195@vnu.edu.vn");

        st.students[2] = new Student();
        st.students[2].setName("kham");
        st.students[2].setId("19020190");
        st.students[2].setGroup("INT 22042");
        st.students[2].setEmail("19020190@vnu.edu.vn");

        System.out.println(st.sameGroup(hocSinh1,hocSinh2) + "\n"+ st.sameGroup(hocSinh2,hocSinh3));
        st.removeStudent("19020190");
        System.out.println("List of students : " + "\n");
        st.studentsByGroup();

    }

}