  class Human {
    String name;
    int age;
    public Human(){ // default
    //constructor is a speacial method
    //  and it has same name as its class
    // it does not return anything unlike another method
    //whenever object is created it calls constructor eveytime 

        age = 12;
        name = "john";
    }

    public Human(String name, int a){ //parameterized cunstructor
        age =  a;
        this.name = name;
    }


    public int getAge(){
    return age;
  }
   public void setAge(int age ){
    this.age = age;
   }

    public String getName(){
    return name;
  }
   public void Name(String n){
    name = n;
   }


  }



  public class DandParaCons {
    
    public static void main(String[] args) {
      Human obj1 = new Human();
      Human obj2 = new Human( "sam", 19);
      System.out.println(obj1.getAge() + ":" + obj1.getName());
      System.out.println(obj2.getAge() + ":" + obj2.getName());
      
    }
  }
