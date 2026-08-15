public class index
{ //main class initialization
    public static void main(String[] args)
    { //main class has been initialized
        System.out.println("My new Project");
        System.out.println("Hello, " + args[0]);
        int i;
        i=1;
        while (i<10)
        {
            System.out.println("This is an infinite loop,... BUt has End condition:  "+i);
            i++;
        }    
    }
}