class ReturnstatementDemo{
public static void main(String[] args){

System.out.println("main started...!");

int result=add(2,3);

System.out.println("result= " +result);

System.out.println("main ended");
}

static int add(int a, int b){
int c=a+b;
return c;
}
}