class SwitchconditionDemo{

public static void main(String args[]){

int num = 7;

switch(num){

case 1: System.out.println("1st day of the week is Sunday");
	break;
case 2: System.out.println("2nd day of the week is Monday");
	break;
case 3: System.out.println("3rd day of the week is Tuesday");
	break;
case 4: System.out.println("4th day of the week is Wednesday");
	break;
case 5: System.out.println("5th day of the week is Thursday");
	break;
case 6: System.out.println("6th day of the week is Friday");
	break;
case 7: System.out.println("7th day of the week is saturday");
	break;
default: System.out.println("invalid input, please provide the number range between 1-7");
	break;
}
}
}