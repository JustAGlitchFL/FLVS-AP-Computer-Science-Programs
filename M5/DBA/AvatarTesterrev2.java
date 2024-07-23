package M5.DBA;

import java.util.Scanner;

public class AvatarTesterrev2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Avatarrev2 player = new Avatarrev2();
        System.out.print("Enter your Avatar's name: ");
        player.setname(in.nextLine());
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter the level for game " + i + ": ");
            player.updatelevel(in.nextInt());
            in.nextLine();
        }

        in.close();

        System.out.println("Avatar name: " + player.getname());
        System.out.println("Avatar level: " + player.getlevel());
    }
}
