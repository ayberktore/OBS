package Deneme;

public class Main {

    public static void main(String []args) {

        Teacher sadi = new Teacher("Sadi","000","FZK");
        Teacher ali = new Teacher("Ali","000","MAT");
        Teacher veli= new Teacher("Veli","000","BİO");

        Course mat = new Course("Fizik","101","MAT");
        mat.addTeacher(ali);

        Course fizik = new Course("Fizik","101","FZK");
        fizik.addTeacher(sadi);

        Course biyoloji = new Course("Biyoloji", "101","BİO");
        biyoloji.addTeacher(veli);

        Student ahmet = new Student("Ahmet","2424","4", mat, fizik, biyoloji);
        ahmet.addBulkExamNote(90,200,50);
        ahmet.isPass();

        Student faruk = new Student("Faruk","222","4", mat, fizik, biyoloji);
        faruk.addBulkExamNote(60,60,60);
        faruk.isPass();
    }
}
