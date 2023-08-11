package FootballerExample;

public class FootballerExample {

        public static void main(String[] args) {
            Footballer footballer = new Footballer();
            footballer.name = "Leo";
            footballer.surname = "Messi";
            footballer.club =  "Inter Miami";
            footballer.betterFoot = "left";
            footballer.age = 36;
            footballer.shirtNumber = 10;
            footballer.weekSalary = 400000;

            footballer.printInfo();

            Footballer footballer1 = new Footballer();
            footballer1.name = "Louis";
            footballer1.surname = "Suarez";
            footballer1.club =  "Atletico";
            footballer1.betterFoot = "right";
            footballer1.age = 37;
            footballer1.shirtNumber = 9;
            footballer1.weekSalary = 320000;



            footballer1.printInfo();

        }
    }



