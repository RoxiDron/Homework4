public class Main {
    public static void main(String[] args) {
        //Задание 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то, он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то, он не достиг совершеннолетия, нужно немного подождать");

        }
        //Задание 2
        int degrees = 5;
        if (degrees >= 5 && 5 >= degrees) {
            System.out.println("На улице меньше " + degrees + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице больше " + degrees + " градусов, можно идти без шапки");
        }
        //Задание 3
        int speed = 60;
        if (speed >= 60 && 60 >= speed) {
            System.out.println("Если скорость " + speed + " км то, можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + " км то придётся заплатить штраф.");
        }

        //Задание 4
        int personsAge = 8;
        if (personsAge < 8) {
            System.out.println("Если возраст человека равен" + personsAge + " , то пора идти гулять");
        } else if (personsAge >= 2 && personsAge <= 6) {
            System.out.println("Если возраст человека равен " + personsAge + " ,то ему нужно ходить в детский сад");
        } else if (personsAge >= 7 && personsAge <= 17) {
            System.out.println("Если возраст человека равен " + personsAge + " ,то ему нужно ходить в школу");
        } else if (personsAge >= 18 && personsAge <= 24) {
            System.out.println("Если возраст человека равен " + personsAge + " ,то ему нужно ходить в универсетет");
        }
        //Задание 5
        int age2 = 12;
        boolean attractionRating = true;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + " ,то ему нельзя кататься на аттракционе");
        } else if (age2 > 5 && age2 < 14 && attractionRating == true) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то ему нельзя кататься на аттракционе без сопровождении взрослого");
        } else if (age2 > 14 && attractionRating == false) {
            System.out.println("Если возраст ребенка равен " + age2 + " то, ему можно кататься на аттракционе без сопровождения взрослого");
        }
        // Задание 6
        int trainCarriage = 102;
        if (trainCarriage >= 102) {
            System.out.println("В вагоне есть места");
        } else if (trainCarriage < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (trainCarriage > 60 && trainCarriage < 102) {
            System.out.println("В вагоне есть стоячие места");
        } else if (trainCarriage < 60 && trainCarriage > 102) {
            System.out.println("В вагоне нет мест");
        }
        //Задание 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        } else {
            if (two > three) {
                System.out.println(two);
            } else {
                System.out.println(three);
            }
        }
    }
}







