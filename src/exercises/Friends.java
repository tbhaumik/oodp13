package exercises;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Friends {
    public static void main(String[] args) {
        Map<String, Set<String>> friends = new HashMap<>();
        Set<String> sueGroup = new HashSet<>();
        sueGroup.add("Bob");
        sueGroup.add("Jose");
        sueGroup.add("Alex");
        sueGroup.add("Cathy");
        friends.put("Sue", sueGroup);
        Set<String> cathyGroup = new HashSet<>();
        cathyGroup.add("Bob");
        cathyGroup.add("Alex");
        friends.put("Cathy", cathyGroup);
        Set<String> bobGroup = new HashSet<>();
        bobGroup.add("Jerry");
        bobGroup.add("Jose");
        bobGroup.add("Alex");
        friends.put("Bob", bobGroup);
        String name = JOptionPane.showInputDialog("Enter a name: ");
        Set<String> group = friends.get(name);
        if (group != null) {
            System.out.println("Here are the friends of " + name + ":");
            System.out.println(group);
        } else {
            System.out.println("The name " + name + " is not listed.");
        }
    }
}