class UserData {
    private String name;
    private String NIM;
    private int age;
    private String email;

    public UserData(String name, String NIM, int age, String email) {
        this.name = name;
        this.NIM = NIM;
        this.age = age;
        this.email = email;
    }

    public String getName() { return name; }
    public String getNIM() { return NIM; }
    public int getAge() {return age;}
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Nama: " + name + "\n   NIM: " + NIM + "\n   Umur:" + age + "\n   Email: " + email;
    }
}