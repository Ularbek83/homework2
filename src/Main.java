import java.util.Random;


public class Main {

    public static void main(String[] args) {

        int age = getRandomAge();
        String res = permission(age, -30);
        System.out.println( "age = " + age + " temp=  -30 " + "  " + res);

        age = getRandomAge();
        res = permission(8, 5);
        System.out.println("age = " +age+ " temp= 5 " + "  " + res);

        age = getRandomAge();
        res = permission(80, -10);
        System.out.println("age = " +age+ " temp= -10 " + "  " + res);

        age = getRandomAge();
        res = permission(25, -10);
        System.out.println("age = " +age+ " temp=  -10 " + "  " + res);

        age = getRandomAge();
        res = permission(46, -5);
        System.out.println("age = " +age+ " temp= -5 " + "  " + res);

    }


    public static String permission(int age, int temp)
    {
        String result = "Можно идти гулять";

        if( ( age > 20 && 45 > age ) && ( temp > -20 && 30 > temp))
        {
            return result;
        }

        if (age < 20 && (temp > 0 && temp < 28)){
            return result;
        }

        if(age > 45 && (temp > -10 && temp < 25)){
            return result;
        }

        return "дома";

    }

    static int getRandomAge() {
        Random random = new Random();
        return random.nextInt(101);

    }


}