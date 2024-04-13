public class Patient {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String phone;
    private int medicalCardNumber;
    private String diagnosis;

    // Конструктор з усіма полями
    public Patient(int id, String lastName, String firstName, String middleName, String address, String phone, int medicalCardNumber, String diagnosis) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.phone = phone;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

    // Геттери і сеттери для кожного поля
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(int medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // Метод для створення масиву об'єктів пацієнтів
    public static Patient[] createPatientsArray() {
        Patient[] patients = new Patient[5]; // Створюємо масив з 5 об'єктів
        patients[0] = new Patient(8777772, "Белоус", "Антон", "Олександрович", "ул. Куклик 43", "+380658338423", 746, "Гонорея");
        patients[1] = new Patient(8777773, "Волошин", "Денис", "Олексійовович", "ул. Шевченко 7", "+380658789423", 721, "Пререлом ключиці");
        patients[2] = new Patient(8777774, "Цимбал", "Макар", "Володимирович", "ул. Дорошенко 3", "+380988338423", 787, "Грип");
        patients[3] = new Patient(8777775, "Бублик", "Давид", "Вікторович", "ул. Празька 36", "+380658337123", 708, "Бронхит");
        patients[4] = new Patient(8777776, "Бондаренко", "Максим", "Сергійович", "ул. Рибалка 20", "+380658338523", 777, "Ангіна");
        return patients;
    }

    public static void main(String[] args) {
        Patient[] patientsArray = Patient.createPatientsArray();

        // Виводимо список пацієнтів
        for (Patient patient : patientsArray) {
            System.out.println("Пацієнт " + patient.getId() + ": Прізвище " + patient.getLastName() + ", Ім'я " + patient.getFirstName() +
                    ", По батькові " + patient.getMiddleName() + ", Адреса " + patient.getAddress() + ", Телефон " + patient.getPhone() +
                    ", Номер медичної карти " + patient.getMedicalCardNumber() + ", Діагноз " + patient.getDiagnosis());
        }
    }
}
