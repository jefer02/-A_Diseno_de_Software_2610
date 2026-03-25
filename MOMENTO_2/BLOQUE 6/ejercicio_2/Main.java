public class Main {
    public static void main(String[] args) {
        // Prueba Person
        Person p = new Person("Ana García", "Calle 10 #5-20");
        System.out.println("Person: " + p);

        // Prueba Student
        Student s = new Student("Carlos López", "Av. Principal 45", "Ingeniería", 2, 1500000.0);
        System.out.println("\nStudent: " + s);
        System.out.println("Programa: " + s.getProgram());
        System.out.println("Año: " + s.getYear());
        System.out.println("Matrícula: " + s.getFee());

        // Prueba Staff
        Staff st = new Staff("María Torres", "Calle 8 #3-15", "Facultad de Ingeniería", 3500000.0);
        System.out.println("\nStaff: " + st);
        System.out.println("Escuela: " + st.getSchool());
        System.out.println("Salario: " + st.getPay());
    }
}
