import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружиеям,"
                        + " введите номер, чтобы выстрелитьб"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            slot = scanner.nextInt();
            if (slot == -1) {
                System.out.println("You exited from game");
                break;
            }
            player.shotWithWeapon(slot - 1);
        }
    }
}