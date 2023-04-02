package controller;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

import java.util.ArrayList;
import java.util.List;

public class ControllerAnimal {
    public static void main(String[] args) {
        System.out.println("\nInstanciando animais");
        Animal peixe1 = new Peixe(0,0,0);
        Animal peixe2 = new Peixe(1,1,1);
        Animal peixe3 = new Peixe(2,2,2);
        System.out.println(peixe1 + "" + "" + peixe2 + "" + "" + peixe3);

        Animal passaro1 = new Passaro(0,0,0);
        Animal passaro2 = new Passaro(1,1,1);
        Animal passaro3 = new Passaro(2,2,2);
        System.out.println(passaro1 + "" + "" + passaro2 + "" + "" + passaro3);

        Animal dog1 = new Cachorro(0,0);
        Animal dog2 = new Cachorro(1,1);
        Animal dog3 = new Cachorro(2,2);
        System.out.println(dog1 + "" + "" + dog2 + "" + "" + dog3);


        System.out.println("\nListando os bichinho");
        List<Animal> animals = new ArrayList<>();
        animals.add(peixe1);
        animals.add(peixe2);
        animals.add(peixe3);
        animals.add(passaro1);
        animals.add(passaro2);
        animals.add(passaro3);
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);
        System.out.println(animals);

        System.out.println("\nMovendo todo mundo pra x=2, y=2");
        animals.forEach(a->{
            a.mover(2,2);
            a.desenhar();
            System.out.println(a);
        });

        System.out.println("\nMovendo os cachorrinho pra x=8, y=8");
        animals.forEach(a->{
            if(a instanceof Cachorro){
                a.mover(8,8);
                a.desenhar();
                System.out.println(a);
            }
        });

        System.out.println("\nMovendo peixinho e o prupru");
        animals.forEach(a->{
            if(a instanceof Peixe){
                ((Peixe)a).mover(5,5,5);
                a.desenhar();
                System.out.println(a);

            } else if (a instanceof Passaro) {
                ((Passaro)a).mover(5,5,5);
                a.desenhar();
                System.out.println(a);
            }
        });
    }
}
