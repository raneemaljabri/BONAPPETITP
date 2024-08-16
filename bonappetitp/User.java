package bonappetitp;

class User {  
    
private String Email;  
private String Password;   

    public User() {}
    public User(String Email, String Password) {
        this.Email = Email;
        this.Password = Password;
    }
    
    User(String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getEmail() {
        return Email;
    }
    public String getPassword() {
        return Password;
}}