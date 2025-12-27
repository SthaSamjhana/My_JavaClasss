class Student{
  int roll_no;
  String name;
  int marks;

}


public class ArrObj {

  public static void main(String[] args) {

    Student s1 = new Student();
    s1.roll_no = 1;
    s1.name = "samjhana stha";
    s1.marks = 98;

     Student s2 = new Student();
    s2.roll_no = 3;
    s2.name = "kiran";
    s2.marks = 93;

     Student s3 = new Student();
    s3.roll_no = 3;
    s3.name = "sanjooo";
    s3.marks = 98;

    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    for(int i=0; i<students.length; i++){
      System.out.println(students[i].name + ":" + students[i].marks);
    }

        for(Student stud : students){
          System.out.println(stud.name + ":" + stud.marks);
        }
    // int nums[] = new int[3];

    //     nums[0] = 4;
    //     nums[1] = 3;
    //     for(int n: nums){ //Enhanced for loop   
    //     System.out.println(n);
    // }

        
    //     for(int i =0; i<nums.length; i++)
    //     {
    //       System.out.println(nums[i]);
    //     }

    
  }
  
}
