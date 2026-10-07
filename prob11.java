// class problem11{
//     public static void main(String args[]){
//         for(int i=1;i<21;i++){
//             System.out.println(i);
            
//         }
//     }
// }
// classproblem12{
//     public static void main(String args[]){
//         for(int i=20;i>0;i--){
//             System.out.println(i);
//         }
//     }
// }
// class problem13{
//     public static void main(String args[]){
//         for(int i=2;i<101;i++){
//             if(i%2==0){
//             System.out.println(i);
//             }
            
//         }
//     }
// }
// class prob14{
//     public static void main(String args[]){
        
//     }
// }

// class oop8{
//     public static void main(String args[]){
//         String name="Amer Noushad";
//         name=name + " " + "Ali";
//         System.out.println("hello" +" " +  name);
//     }
// }
//  class mobile{
//     String brand;
//     int price;
//      static String name="smart phone";

//   public void show (){
//     System.out.println(brand+ " : "+ price+ " : "+ name);
//   }
// }
// class real{
//     public static void main(String args[]){
//         mobile obj=new mobile();
//         obj.brand="Apple";
//         obj.price=900;
//         mobile obj1=new mobile();
//         obj1.brand="Samsung";
//         obj1.price=1000;
//         obj.show();
//         obj1.show();
        
    
//     }
// }
// class duplicate{
//     String name;
//     int age;
//     String location;
//     public duplicate(){
//         int age=12;
//         String name="please enter your name"
//         System.out.println("To access this application age must be greater than 12";)
//     }
    
// }
// public real{
//     public static void main(String args[]){
//         duplicate obj=new duplicate();
//         duplicate obj1=new duplicate();

//         System.out.println(obj.duplicate);
//           System.out.println(obj1.duplicate);


//     }
// class Duplicate{
//     int age;
//     String name;
//     String location;
//     public Duplicate(){
//         age=12;
//         name="please enter your name";
//         location="please enter a valid location";
//         System.out.println(name );
//         System.out.println(age );
//         System.out.println(location );
        
//     }
// }
// class real{
//     public static void main(String args[]){
//         Duplicate obj=new Duplicate();
//         System.out.println("object ");
//         System.out.println(obj.name);
//         System.out.println(obj.age);
//         System.out.println(obj.location);
//          Duplicate obj1=new Duplicate();
//         System.out.println("object 1");
//         System.out.println(obj1.name);
//         System.out.println(obj1.age);
//         System.out.println(obj1.location);

//     }
// }
// class student{
//     String name;
//     int age;
//     String location;
//     double gpa;
//     student(String name,int age,String location,double gpa){
//         this.name=name;
//         this.age=age;
//         this.location=location;
//         this.gpa=gpa;
//     }
//         void show(){
//             System.out.println("Name : "+ name);
//              System.out.println("Age : "+ age);
//               System.out.println("location : "+ location);
//                System.out.println("Gpa : "+ gpa);

//         }
    
// }
// class Main{
//     public static void main(String args[]){
//         student s1=new student("Robin",24,"new york",8.9);
//          student s2=new student("gorin",24,"Richmond",7.9);
//          s1.show();
//         // System.out.println();
//          s2.show();

//     }
// }
// class New{
//     String name;
//     int age;
//     static String university="SBIT";}

// class intelligent{
//     public static void main(String args[]){
//         New obj=new New();
//         obj.name="david";
//         obj.age=23;
//         New obj1=new New();
//         obj1.name="robin";
//         obj1.age=24;
//         System.out.println(obj.name+"\n"+obj.age+ "\n"+New.university);
//         System.out.println();
//          System.out.println(obj1.name+"\n"+obj1.age+ "\n"+New.university);
        
//     }
// }
// class listen{
//     static{
//         System.out.println("I'm static block");
//     }
// }
// class heard{
//     public static void main(String args[]){
//         System.out.println("I'm main block");
//     }
// }
// class result{
//     int count=0;
//     int count1=0;
//     int sum=0;
//     public static void main(String args[]){
//         for(int i=0;i<=21;i++){
//             System.out.println(i);
//             sum=sum+i;
//             if(i%2==0){
//                 System.out.println("even");
//                 count+=1;
//             }
//             else{
//                 System.out.println("odd");
//                 count+=1;
//             }
//             System.out.println(sum);

//         }
//     }
// }
// class robin{
//     String name;
//     int age;
// }
// class reema{
//     public static void main(String args[]){
//         robin obj=new robin();
//         obj.name="raechal";
//         obj.age=34;
//         System.out.println(obj.name);
//         System.out.println(obj.age);
//     }
// }
class room{
    private int strength;
    private String teacher;
    private String subject;
    public int getstrength(){
        return strength;
    }
    public void setstrength(int b){
        strength=b;
    }
    public String getteacher(){
        return teacher;
    }
    public void setteacher(String t){
        teacher=t;
    }
    public String getsubject(){
        return subject;
    }
    public void setsubject(String sub){
        subject=sub;
    }
}
class exam{
    public static void main(String args[]){
        room obj=new room();
        obj.setstrength(45);
        obj.setteacher("leela");
        obj.setsubject("English");
        System.out.println(obj.getstrength());
        System.out.println(obj.getteacher());
        System.out.println(obj.getsubject());



    }
}