package Deneme;

public class Course {

    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;

    Course(String name, String code, String prefix) {

        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;

    }
    void addTeacher(Teacher teacher) {

        if(this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;

        }
        else
            System.out.println("Ders ve Ogretmen Uyumsuz");
    }

    void printTeacher() {
        System.out.println("Ogremen Adi:" + this.teacher.name);
        System.out.println("Ogremen Brans:" + this.teacher.branch);
        System.out.println("Ogremen Numara:" + this.teacher.mnpo);
    }

}
