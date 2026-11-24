class employee {
    String name;
    int id;
    String department;
    
    employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
    }
    
    void displayEmployee() {
        System.out.println("Employee Name: " + name + ", ID: " + id);
    }
}
class Task_20 {
    public static void main(String[] args) {
        employee emp1 = new employee("Arani", 101, "IT");
        employee emp2 = new employee("Yogeswari", 102, "HR");
        
        emp1.displayEmployee();
        emp2.displayEmployee();
    }
}
