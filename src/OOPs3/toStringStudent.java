package OOPs3;

public class toStringStudent {

    String name;
    int age;

    toStringStudent (String name, int age ){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString (){
        return "Name is : "+name + " and age is : "+ age ;

    }

}
