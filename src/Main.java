public class Main {
    public static void main(String[] args) {
        //Задание 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то, он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то, он не достиг совершеннолетия, нужно немного подождать");
        }

        int age2 = 7;
        if (age2 >= 18) {
            System.out.println("Если возраст человека равен " + age2 + " то, он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age2 + " то, он не достиг совершеннолетия, нужно немного подождать");
        }

        //Задание 2
        int degrees = 5;
        if (degrees >= 5 && 5 >= degrees) {
            System.out.println("На улице меньше " + degrees + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице больше " + degrees + " градусов, можно идти без шапки");
        }
        int degrees1 = 10;
        if (degrees1 >= 5 && 5 >= degrees1) {
            System.out.println("На улице меньше " + degrees1 + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице больше " + degrees1 + " градусов, можно идти без шапки");
        }
        //Задание 3
        int speed = 60;
        if (speed >= 60 && 60 >= speed) {
            System.out.println("Если скорость " + speed + " км то, можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + " км то придётся заплатить штраф.");
        }
        int speed1 = 80;
        if (speed1 >= 60 && 60 >= speed1) {
            System.out.println("Если скорость " + speed1 + " км то, можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed1 + " км то придётся заплатить штраф.");
        }

        //Задание 4
        int personsAge = 5;
        if (personsAge < 1) {
            System.out.println("Если возраст человека равен" + personsAge + " , то пора идти гулять");
        } else if (personsAge >= 2 && personsAge <= 6) {
            System.out.println("Если возраст человека равен " + personsAge + " ,то ему нужно ходить в детский сад");
        } else if (personsAge >= 7 && personsAge <= 17) {
            System.out.println("Если возраст человека равен " + personsAge + " ,то ему нужно ходить в школу");
        } else if (personsAge >= 18 && personsAge <= 24) {
            System.out.println("Если возраст человека равен " + personsAge + " ,то ему нужно ходить в универсетет");
        }
        int personsAge1 = 8;
        if (personsAge1 < 1) {
            System.out.println("Если возраст человека равен" + personsAge1 + " , то пора идти спать");
        } else if (personsAge1 >= 2 && personsAge1 <= 6) {
            System.out.println("Если возраст человека равен " + personsAge1 + " ,то ему нужно ходить в детский сад");
        } else if (personsAge1 >= 7 && personsAge1 <= 17) {
            System.out.println("Если возраст человека равен " + personsAge1 + " ,то ему нужно ходить в школу");
        } else if (personsAge1 >= 18 && personsAge1 <= 24) {
            System.out.println("Если возраст человека равен " + personsAge1 + " ,то ему нужно ходить в универсетет");
        }
        int personsAge2 = 18;
        if (personsAge2 < 1) {
            System.out.println("Если возраст человека равен" + personsAge2 + " , то пора идти спать");
        } else if (personsAge2 >= 2 && personsAge2 <= 6) {
            System.out.println("Если возраст человека равен " + personsAge2 + " ,то ему нужно ходить в детский сад");
        } else if (personsAge2 >= 7 && personsAge2 <= 17) {
            System.out.println("Если возраст человека равен " + personsAge2 + " ,то ему нужно ходить в школу");
        } else if (personsAge2 >= 18 && personsAge2 <= 24) {
            System.out.println("Если возраст человека равен " + personsAge2 + " ,то ему нужно ходить в универсетет");
        }
        //Задание 5
        int childsAge = 4;
        boolean attractionRating = true;
        if (childsAge < 5) {
            System.out.println("Если возраст ребенка равен " + childsAge + " ,то ему нельзя кататься на аттракционе");
        } else if (childsAge > 5 && childsAge < 14 && attractionRating == true) {
            System.out.println("Если возраст ребенка равен " + childsAge + " , то ему нельзя кататься на аттракционе без сопровождении взрослого");
        } else if (childsAge > 14 && attractionRating == false) {
            System.out.println("Если возраст ребенка равен " + childsAge + " то, ему можно кататься на аттракционе без сопровождения взрослого");
        }
        int childsAge1 = 12;
        boolean attractionRating1 = true;
        if (childsAge1 < 5) {
            System.out.println("Если возраст ребенка равен " + childsAge1 + " ,то ему нельзя кататься на аттракционе");
        } else if (childsAge1 > 5 && childsAge1 < 14 && attractionRating1 == true) {
            System.out.println("Если возраст ребенка равен " + childsAge1 + " , то ему нельзя кататься на аттракционе без сопровождении взрослого");
        } else if (childsAge1 > 14 && attractionRating1 == false) {
            System.out.println("Если возраст ребенка равен " + childsAge1 + " то, ему можно кататься на аттракционе без сопровождения взрослого");
        }
        int childsAge2 = 18;
        boolean attractionRating2 = true;
        if (childsAge2 < 5) {
            System.out.println("Если возраст ребенка равен " + childsAge2 + " ,то ему нельзя кататься на аттракционе");
        } else if (childsAge2 > 5 && childsAge1 < 14 && attractionRating2 == false) {
            System.out.println("Если возраст ребенка равен " + childsAge2 + " , то ему нельзя кататься на аттракционе без сопровождении взрослого");
        } else if (childsAge2 > 14 && attractionRating2 == true) {
            System.out.println("Если возраст ребенка равен " + childsAge2 + " то, ему можно кататься на аттракционе без сопровождения взрослого");
        }
        // Задание 6
        int trainCarriage = 102;
        if (trainCarriage >= 102) {
            System.out.println("В вагоне есть места");
        } else if (trainCarriage < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (trainCarriage > 60 && trainCarriage < 102) {
            System.out.println("В вагоне есть стоячие места");
        }

        int trainCarriage1 = 40;
        if (trainCarriage1 >= 102) {
            System.out.println("В вагоне есть места");
        } else if (trainCarriage1 < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (trainCarriage1 > 60 && trainCarriage1 < 102) {
            System.out.println("В вагоне есть стоячие места");
        }

        int trainCarriage2 = 70;
        if (trainCarriage2 >= 102) {
            System.out.println("В вагоне есть места");
        } else if (trainCarriage2 < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (trainCarriage2 > 60 && trainCarriage2 < 102) {
            System.out.println("В вагоне есть стоячие места");
        }

        //Задание 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше остальных");
        } else if (two > one && two > three) {
            System.out.println("Число " +  two + "больше остальных");
        } else {
            System.out.println("Число " + three + " больше остальных");
        }

    }
}








