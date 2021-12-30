package Deneme;

public class Student {
    String name;
    String stuNo;
    Course c1,c2,c3;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3)
    {
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0.0;
        this.isPass=false;

    }
    void addBulkExamNote(int note1, int note2, int note3)
    {
        if(note1>=0 && note1<100)
        this.c1.note=note1;
        if(note2>=0 && note2<100)
        this.c2.note=note2;
        if(note3>=0 && note3<100)
        this.c3.note=note3;
    }
    void printNote()
    {
        System.out.println(this.c1.name+"Dersi Notu:"+this.c1.note);
        System.out.println(this.c2.name+"Dersi Notu:"+this.c2.note);
        System.out.println(this.c3.name+"Dersi Notu:"+this.c3.note);
        System.out.println("Ortalamanız"+ this.average);
    }

    void isPass()
    {
        this.average=(this.c1.note+this.c2.note+this.c3.note) / 3.0;
        if(this.average>50)
            System.out.println("Sınıfı Geçti");
        else
            System.out.println("Sınıfta Kaldınız");

        this.printNote();
    }
}
