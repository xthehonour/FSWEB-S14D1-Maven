package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[10];
        this.midDevelopers = new MidDeveloper[10];
        this.seniorDevelopers = new SeniorDeveloper[10];
    }

    public HRManager(int id, String name, double salary, int juniorSize, int midSize, int seniorSize) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[Math.max(0, juniorSize)];
        this.midDevelopers = new MidDeveloper[Math.max(0, midSize)];
        this.seniorDevelopers = new SeniorDeveloper[Math.max(0, seniorSize)];
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
        setSalary(getSalary() + 5000);
    }

    public void addEmployee(JuniorDeveloper developer, int index) {
        if (!isValidIndex(juniorDevelopers, index)) {
            System.out.println("Invalid index for juniorDevelopers");
            return;
        }
        if (juniorDevelopers[index] != null) {
            System.out.println("juniorDevelopers index is already occupied");
            return;
        }
        juniorDevelopers[index] = developer;
    }

    public void addEmployee(JuniorDeveloper developer) {
        int index = firstEmptyIndex(juniorDevelopers);
        if (index == -1) {
            System.out.println("juniorDevelopers array is full");
            return;
        }
        juniorDevelopers[index] = developer;
    }

    public void addEmployee(MidDeveloper developer, int index) {
        if (!isValidIndex(midDevelopers, index)) {
            System.out.println("Invalid index for midDevelopers");
            return;
        }
        if (midDevelopers[index] != null) {
            System.out.println("midDevelopers index is already occupied");
            return;
        }
        midDevelopers[index] = developer;
    }

    public void addEmployee(MidDeveloper developer) {
        int index = firstEmptyIndex(midDevelopers);
        if (index == -1) {
            System.out.println("midDevelopers array is full");
            return;
        }
        midDevelopers[index] = developer;
    }

    public void addEmployee(SeniorDeveloper developer, int index) {
        if (!isValidIndex(seniorDevelopers, index)) {
            System.out.println("Invalid index for seniorDevelopers");
            return;
        }
        if (seniorDevelopers[index] != null) {
            System.out.println("seniorDevelopers index is already occupied");
            return;
        }
        seniorDevelopers[index] = developer;
    }

    public void addEmployee(SeniorDeveloper developer) {
        int index = firstEmptyIndex(seniorDevelopers);
        if (index == -1) {
            System.out.println("seniorDevelopers array is full");
            return;
        }
        seniorDevelopers[index] = developer;
    }

    private boolean isValidIndex(Object[] array, int index) {
        return array != null && index >= 0 && index < array.length;
    }

    private int firstEmptyIndex(Object[] array) {
        if (array == null) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
