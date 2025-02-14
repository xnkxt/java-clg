//Q.1 Following code should return the name when the method getName() is called. Modify the code to achieve the desired result.

// public class Main
// {
// 	class ReturnValue {
//         public String name = "Tom";
    
//         public String getName() {
//             return name;
//         }
    
//         public static void main(String[] args) {
//             ReturnValue rv = new ReturnValue();
//             System.out.println(rv.getName());
//         }
//     }

// }

//Error:
// Main.java:19: error: non-static variable this cannot be referenced from a static context
//             ReturnValue rv = new ReturnValue();
//Answer
//error class Return Value is must be "static class ReturnValue"
//scope of main class is wrong it should be outside of ReturnValue Function scope

//Fixed Program
public class Main
{
	static class ReturnValue {
        public String name = "Tom";
    
        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
            ReturnValue rv = new ReturnValue();
            System.out.println(rv.getName());
    }

}


