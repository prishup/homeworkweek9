package inheritance_Q1;
/*
1. Write a Java program to create a class called codebuster with a method called
groupName(). Create a subclass called codebusterGroups() that overrides the
groupName() method.*/
public class Codebuster {  //parent class
    public void groupname(){
        System.out.println("our group name was Selenium before");
    }
    public static void main(String[] args) {
      Codebuster t = new Codebuster(); //Object of codebuster
      t.groupname();
    }
}
