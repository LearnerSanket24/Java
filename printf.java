public class printf {
    
    public static void main(String[] args){
        int x = 5;
        double y = 60000.89;
        double k = 10000.90;
        double t = -56.89;
        String san = "samke";                
        boolean isStudent = true;
        System.out.printf("My name is %d and %f with %s and %b",x,y,san,isStudent);
        System.out.printf("\n%+.2f  %,.3f  %(.2f",y,k,t);
//flags
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive
        


        

    }
}
