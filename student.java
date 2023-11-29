import java.util.List;
 class student {
    private String Firstname;
    private  String LastName;
    private int age;
    private int ID;
    private int UID;
    private int LastSemesterGPA;

        public student(String FirstName,String LastName, int age,int ID, int UID,int LastSemesterGPA) {
        this.Firstname = FirstName;
        this.LastName = LastName;
        this.age = age;
        this.ID = ID;
        this.UID = UID;
        this.LastSemesterGPA = LastSemesterGPA;
    }

    public String getFirstName() {
        return Firstname;
    }
     public String getLastName() {
         return LastName;
     }

    public int getAge() {
        return age;
    }
    public int getID() {
        return ID;
    }
    public int getUID(){
            return UID;
    }
    public int getLastSemesterGPA(){
            return LastSemesterGPA;
    }
 }

