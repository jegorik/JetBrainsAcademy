// Posted from EduTools plugin
class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? this.firstName : firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? this.lastName : lastName;
    }

    public String getFullName() {
        String result = "";
        result = firstName.isEmpty() && lastName.isEmpty() ? "Unknown" : result;
        result = firstName.isEmpty() ? result : result.concat(firstName + " ");
        result = lastName.isEmpty() ? result : result.concat(lastName + " ");
        return result.trim();
    }
}