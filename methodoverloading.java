class calculator{
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
    public double add(double n1,int n2){
        return n1+n2;
    }
}
 class robin{

    public static void main(String args[]){
        calculator obj=new calculator();
        int result1=obj.add(4,6,7);
        double result2=obj.add(6.7,5);
        System.out.println(result1);
        System.out.println(result2);
    }
 }
