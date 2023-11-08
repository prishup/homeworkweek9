package inheritance_Q1;

public class codebusterGroups extends Codebuster { //child class
    public static void main(String[] args) {
        codebusterGroups group = new codebusterGroups();
        group.groupname();

    }

    @Override
    public void groupname() {
        System.out.println("Now our group name is Agile");
    }
}
