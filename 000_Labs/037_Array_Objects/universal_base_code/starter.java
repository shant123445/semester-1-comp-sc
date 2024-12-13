/*
 *	Author:  
 *  Date: 
*/


import pkg.*;
import java.util.*;

class starter {
    public static void main(String[] args) {
        Warrior[] warriors = new Warrior[100];
        Sorcerer[] sorcerers = new Sorcerer[100];

        for (int i = 0; i < 100; i++) {
            warriors[i] = new Warrior("Warrior " + (i + 1));
            sorcerers[i] = new Sorcerer("Sorcerer " + (i + 1));
        }

        int warriorIndex = 0;
        int sorcererIndex = 0;
        int aliveWarriors = 100;
        int aliveSorcerers = 100;

        while (aliveWarriors > 0 && aliveSorcerers > 0) {
            Warrior warrior = warriors[warriorIndex];
            Sorcerer sorcerer = sorcerers[sorcererIndex];

            if (!warrior.isDead()) sorcerer.attack(warrior);
            if (!sorcerer.isDead()) warrior.attack(sorcerer);

            if (warrior.isDead()) {
                System.out.println(warrior.getName() + " is defeated!");
                warriorIndex++;
                aliveWarriors--;
            }

            if (sorcerer.isDead()) {
                System.out.println(sorcerer.getName() + " is defeated!");
                sorcererIndex++;
                aliveSorcerers--;
            }
        }

        if (aliveWarriors == 0) {
            System.out.println("Sorcerers win with " + aliveSorcerers + " remaining!");
        } else {
            System.out.println("Warriors win with " + aliveWarriors + " remaining!");
        }
    }
}
