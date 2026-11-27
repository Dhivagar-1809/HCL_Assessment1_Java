import java.util.Scanner;
public class employeeAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int roleType = sc.nextInt();
        int requiredLevel = sc.nextInt();

        AccessControl user = null;

        if (roleType == 1) {
            user = new Developer();
        } else if (roleType == 2) {
            user = new Manager();
        } else if (roleType == 3) {
            user = new Administrator();
        }

        if (user != null) {
            System.out.println("Role: " + user.getRole());
            System.out.println("Access Level: " + user.getAccessLevel());
            System.out.println("Can Access: " + user.canAccess(requiredLevel));
        }

        sc.close();
    }
}
interface AccessControl {
    String getRole();
    int getAccessLevel();
    boolean canAccess(int requiredLevel);
}

class Developer implements AccessControl {
    @Override
    public String getRole() {
        return "Developer";
    }

    @Override
    public int getAccessLevel() {
        return 1;
    }

    @Override
    public boolean canAccess(int requiredLevel) {
        return getAccessLevel() >= requiredLevel;
    }
}

class Manager implements AccessControl {
    @Override
    public String getRole() {
        return "Manager";
    }

    @Override
    public int getAccessLevel() {
        return 2;
    }

    @Override
    public boolean canAccess(int requiredLevel) {
        return getAccessLevel() >= requiredLevel;
    }
}

class Administrator implements AccessControl {
    @Override
    public String getRole() {
        return "Administrator";
    }

    @Override
    public int getAccessLevel() {
        return 3;
    }

    @Override
    public boolean canAccess(int requiredLevel) {
        return getAccessLevel() >= requiredLevel;
    }
}


