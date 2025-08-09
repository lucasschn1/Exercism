class Badge {
    public String print(Integer id, String name, String department) {

       String formattedID = id == null ? "" : "[" + id + "]";
       String formattedDepartment = department == null ? "OWNER" : department.toUpperCase();
       String formatteName = id == null ? "" : " - " + name + " - ";
       return formattedID  + formatteName  + formattedDepartment;
    }
}
