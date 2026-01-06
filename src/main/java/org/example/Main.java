package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    public class Person {
        private String firstName;
        private String lastName;
        private int age;

        private String gonder;
        private String email;
        private String phoneNumber;
    }

    public Person(String firstName, String lastName, int age) {
        this.fistName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName, age);
        this.gonder = gonder;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int age() {
        return age;
    }

    public boolean getTrue() {
        return age >= 18;
    }

    public boolean getFalse() {
        return age < 18;
    }


    public class Wall{
        private  double width;
        private  double height;
        publiv Wall(double width,double height){
            if (width < 0) {
                this.width = 0;
            } else{
                this.width = width;
            }
        }
        if (height < 0){
            this.height = 0;
        } else{
            this.height = height;
        }
    }
    public double getWidth(){
        return width;
    }
    public  double getHeight(){
        return height;
    }
    public  void  setWidth(double width){
       if(width < 0) {
           this.width = 0;
       } else {
           this.width = width;
       }
       public void setHeight(double height){
           if(height < 0) {
               this.height = 0;
           } else {
               this.height = height;
           }
        }
       public double getArea(){
           return width  *  height;
        }
    }
}