package nl.han.ica.oose.dea.testedfizzbuzz;

public class FizzBuzzExecutor {

    public String execute(int i){

        String answr = "";
        if (i % 3 == 0) {
            answr += "Fizz";
        }
        if (i % 5 == 0) {
            answr += "Buzz";
        }
        if(answr.isEmpty()){
            answr = String.valueOf(i);
        }
        return answr;

//        return null;
    }
}
