package CourseWork1;

public class Main {

    public static void printList(Employee[] objects){
        for (int i = 0; i < objects.length; i++)
            System.out.println(objects[i]);
        }

    public static void printName(Employee[] objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].getFullName());
        }
    }

    public static void calculateSum(Employee[] objects) {
        double sum = 0;
        for (int i = 0; i < objects.length; i++) {
            sum = objects[i].getWage() + sum;
        }
        System.out.println("Сумма зарплат за месяц: " + sum);
    }

    public static void countAverageWage(Employee[] objects) {
        double sum = 0;
        for (int i = 0; i < objects.length; i++) {
            sum = objects[i].getWage() + sum;
        }
        double averageValue = sum / objects.length;
        System.out.println("Среднее значение зарплат: " + averageValue);
    }

    public static double findMinWage(Employee[] objects) {
        double min = 0;
        for (int i = 0; i < objects.length; i++) {
            if (min == 0 || objects[i].getWage() < min) {
                min = objects[i].getWage();
            }
        }
        return min;
    }

    public static double findNameMinWage(Employee[] objects) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].getWage() == findMinWage(objects)) {
                System.out.println("Сотрудник с минимальной зар. платой: " + objects[i].getFullName());
            }
        }
        return 0;
    }

    public static double findMaxWage(Employee[] objects) {
        double max = 0;
        for (int i = 0; i < objects.length; i++) {
            if (max == 0 || objects[i].getWage() > max) {
                max = objects[i].getWage();
            }
        }
        return max;
    }

    public static double findNameMaxWage(Employee[] objects) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].getWage() == findMaxWage(objects)) {
                System.out.println("Сотрудник с максимальной зар. платой: " + objects[i].getFullName());
            }
        }
        return 0;
    }

    public static double indexWage(Employee[] objects) {
        for (int i = 0; i < objects.length; i++) {
            double index = 0.1;
            double wage = objects[i].getWage();
            objects[i].setWage(wage + wage * index);
        }
        return 0;
    }

    public static void printListUnit(Employee[] objects, int unit) {
        System.out.println("Отдел: " + unit);
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].getUnit() == unit) {
                System.out.println("ФИО: " + objects[i].getFullName() + ", зп: " + objects[i].getWage() + ", id: " + objects[i].getId());
            }
        }
    }

    public static void calculateSumUnit(Employee[] objects, int unit) {
        System.out.println("Отдел: " + unit);
        double sum = 0;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].getUnit() == unit) {
                sum += objects[i].getWage();
            }
        }
        System.out.println("Сумма зарплат за месяц: " + sum);
    }

    public static void countAverageWageUnit(Employee[] objects, int unit) {
        System.out.println("Отдел: " + unit);
        double sum = 0;
        int l = 0;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].getUnit() == unit) {
                sum += objects[i].getWage();
                l++;
            }
        }
        double averageValue = sum / l;
        System.out.println("Среднее значение зарплат: " + averageValue);
    }

    public static double findMinWageUnit(Employee[] objects, int unit) {
        double min = 0;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].getUnit() == unit) {
                if (min == 0 || objects[i].getWage() < min) {
                    min = objects[i].getWage();
                }
            }
        }
        return min;
    }

    public static double printNameMinWageUnit(Employee[] objects, int unit) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].getWage() == findMinWageUnit((objects), unit)) {
                System.out.println("Сотрудник с минимальной зар. платой в отделе " + unit + ": " + objects[i].getFullName());
            }
        }
        return 0;
    }

    public static double findMaxWageUnit(Employee[] objects, int unit) {
        double max = 0;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].getUnit() == unit) {
                if (max == 0 || objects[i].getWage() > max) {
                    max = objects[i].getWage();
                }
            }
        }
        return max;
    }

    public static double printNameMaxWageUnit(Employee[] objects, int unit) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].getWage() == findMaxWageUnit((objects), unit)) {
                System.out.println("Сотрудник с максимальной зар. платой в отделе " + unit + ": " + objects[i].getFullName());
            }
        }
        return 0;
    }

    public static void indexWageUnit(Employee[] objects, int unit, double index) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].getUnit() == unit) {
                double wage = objects[i].getWage();
                objects[i].setWage(wage + wage * index);
                System.out.println(objects[i]);
            }
        }
    }

    public static void printListLowParameter(Employee[] objects, double parameter) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].getWage() < parameter) {
                System.out.println("id: " + objects[i].getId() + ", ФИО: " + objects[i].getFullName() + ", зп: " + objects[i].getWage());
            }
        }
    }

    public static void printListHighParameter(Employee[] objects, double parameter) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].getWage() >= parameter) {
                System.out.println("id: " + objects[i].getId() + ", ФИО: " + objects[i].getFullName() + ", зп: " + objects[i].getWage());
            }
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Кошкина Кошка Кошковна", 1, 11111);
        employees[1] = new Employee("Собакина Собака Собаковна", 2, 22222);
        employees[2] = new Employee("Попугаев Попугай Попугаевич", 3, 33333);
        employees[3] = new Employee("Носорогов Носорог Носорогович", 4, 44444);
        employees[4] = new Employee("Рыбакова Рыбка Рыбковна", 5, 55555);
        employees[5] = new Employee("Дельфинов Дельфин Дельфинович", 5, 66666);
        employees[6] = new Employee("Бегемотов Бегемот Бегемотович", 4, 77777);
        employees[7] = new Employee("Канарейкина Канарейка Канареевна", 3, 88888);
        employees[8] = new Employee("Джек Рассел Терьерович", 2, 99999);
        employees[9] = new Employee("Вислоухая Пушиня Сибировна", 1, 11111);

        printList(employees);
        calculateSum(employees);
        countAverageWage(employees);
        findNameMinWage(employees);
        findNameMaxWage(employees);
        printName(employees);
        System.out.println(indexWage(employees));
        printListUnit(employees, 4);
        calculateSumUnit(employees, 1);
        countAverageWageUnit(employees,5);
        printNameMinWageUnit(employees, 1);
        printNameMaxWageUnit(employees, 2);
        indexWageUnit(employees,3,0.05);
        printListLowParameter(employees, 20000);
        printListHighParameter(employees, 60000);
    }
}
