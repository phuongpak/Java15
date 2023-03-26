package Object;

public class Dog {


    //instance variable define object
     static String name;
    int age;
    String breed = "husky"; //the third way


   static int food = 20;//if using static, it belongs to class, whatever change, it will affect all




    public String speak(int numberOfWords){
        setAge(numberOfWords);
        System.out.println("The dog is speaking " + numberOfWords + " words");
        return "Here are the words" + numberOfWords;
       // System.out.println();//cannot use it after return, return is the end of the method
    }

    public void play(){
        System.out.println("Dog is playing");
        food-=1;
    }

    public void feed(String foodType, int foodAmount){

        //if the food type is x, cost for each pound is 0.50
        //if the food type is y, cost for each pound is 10

        if(foodType.equalsIgnoreCase("x")) {
            double number = .50 * foodAmount;
        }else{
            double number = 10 * foodAmount;
        }
        System.out.println("Dog is getting food");
    }

    //3 way of initialize instance variable
    public void setAge (int age1){
        age = age1;
    }

    public static void bath(){
        System.out.println("Getting clean");
    }



    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name ="Brody";
        System.out.println(dog1.breed);

        System.out.println(dog1.age);//0 now so we call the method to set age

        dog1.setAge(1);
        System.out.println(dog1.age);//1 now

        Dog dog2 = new Dog();//different dog
        System.out.println(dog2.age);//0

        //make dog speak

        String str = dog2.speak(7);//The dog is speaking 7 words, string type
        // we use speak method and pass 7 to dog2.age

        System.out.println(dog2.age);// 7 now cuz setAge inside speak class
        System.out.println(str);//return : Here are the words7

        System.out.println(dog1.food);//20
        dog1.play();//play 1, down 1 pound of food
        dog1.play();//play second time,
        System.out.println(dog1.food);//18

        System.out.println(dog2.food);//20
        dog2.play();
        dog2.play();
        dog2.play();
        dog2.play();
        dog2.play();
        System.out.println(dog2.food);//15
        //if we want them to share food, use Static int food = 20, then
        //System.out.println(dog2.food);//15 will become 13

        //make name static

        System.out.println("dog1 name >>" + dog1.name);//Brody
        System.out.println("dog2 name >>>>"+  dog2.name);//Brody also cuz static

        dog2.name = "Abby";
        System.out.println("dog2 name >>>>"+  dog2.name);//Abby
        System.out.println("dog1 name >>" + dog1.name);//Abby

    // bath method is static, main method is static so if we do bath()  in main, it work, does not need to create object
        bath();




    }



}
