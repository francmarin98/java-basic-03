import javax.swing.*;

public class ForContinueBreak {
    public static void main(String[] args) {
        // String people[] = {"Juan", "Maria", "Pepe", "José"};

        String[] people = {"Juan", "Maria", "Pepe", "José"};

        for (int i = 0; i < people.length; i++) {
            System.out.println("people = " + people[i]);
        }


        for (int i = 0; i < people.length; i++) {
            if(people[i].equalsIgnoreCase("pepe")){
                continue;
            }

            System.out.println("people with continue = " + people[i]);
        }

        String personToSearch = JOptionPane.showInputDialog("Ingrese el nombre a buscar, ej: \"Maria\" ");

        for (int i = 0; i < people.length; i++) {
            if(people[i].equalsIgnoreCase(personToSearch)){
                JOptionPane.showMessageDialog(null, personToSearch + " si existe");
                break;
            }
        }
    }
}
