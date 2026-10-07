class calculator{
    public class add(int num1,int num2){
        int result=num1+num2;
        return result;
    }
}
class Demo{
    public static void main(String args[]){
        int num3=90;
        int num4=56;
        calculator calc=new calculator();
        int result1=calc.add(num3,num4);
        System.out.println(result1);
    }
}