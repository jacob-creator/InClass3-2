public class Nice {

    public static void main(String[] args) {
        int i = 1;
        int factorial = 1;

        for(i=1; i<=5;i++){
            factorial=factorial*i;

        }
        System.out.println(factorial);

        int num = 10;
        int total = 1;
        int exp =4;
        for(int x = 1; x <= exp; x++ ){
            total *= num;
        }
        System.out.println(total);

     int Array1[] = {12, 24};
     int Array2[] = {13, 48};
     int slope;

     slope = ((Array2[1]-Array1[1])/(Array2[0]-Array1[0]));
     System.out.println(slope);
     int intercept = slope*(-Array1[0])+Array1[1];
     System.out.println(intercept);

     System.out.println("y = " + slope + "x+(" + intercept + ')');
    }


}