//Q.2 Debug the code to rectify the compile time error thrown by the given code.

// class NoDefConst {
//     NoDefConst(String s) 
//     {
//         System.out.println("fsdf")
//     }
// }
// class SubClass extends NoDefConst 
// {
// }

//Errors:
//Missing semicolon (syntax error)
//Main.java:17: error: ';' expected
//         System.out.println("fsdf")
//SubClass calls super("default value") in its constructor

//Fixed Code
class NoDefConst {
    NoDefConst(String s) 
    {
        System.out.println("fsdf");
    }
}
class SubClass extends NoDefConst 
{
    SubClass(){
        super("default value");
    }
}

public class Main2 {
    public static void main(String[] args) {
            SubClass obj = new SubClass();
        }
}