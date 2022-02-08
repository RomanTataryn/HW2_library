package com.tataryn;

import lombok.Data;

@Data
public class Hive {
    private final int BAZE_VALUE = 30;
    private int number;
    private int countOfFrames;
    private String breedoOfBees;
    static int kilkist;

    public Hive(int number, int countOfFrames, String breedoOfBees) {
        this.number = number;
        this.countOfFrames = countOfFrames;
        this.breedoOfBees = breedoOfBees;
        kilkist++;
    }

    public void futureCountOFHoney() {
        {
            System.out.println("Projected amount of honey from hive № " + number + " is " +
                    (BAZE_VALUE * getCoefficientStrengthBeesFamily() * getBreedsProductivity()) + " kg");
        }
    }

    private double getBreedsProductivity() {
        double x = 1;
        if (breedoOfBees.equals("Karpatka")) {
            x *= 1.2;
        } else if (breedoOfBees.equals("Karnika")) {
            x *= 1.3;
        } else if (breedoOfBees.equals("Bacfast")) {
            x *= 1.5;
        }
        return x;
    }

    private double getCoefficientStrengthBeesFamily() {
        double y = 1;
        if (countOfFrames <= 5) {
            y *= 0.7;
        } else if (countOfFrames > 5 && countOfFrames <= 7) {
            y *= 1.1;
        } else if (countOfFrames > 7) {
            y *= 1.5;
        }
        return y;
    }
}


