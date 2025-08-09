class Badge {
    public String print(Integer id, String name, String department) {

       String formattedID = id == null ? null : "[" + id + "]";
       String formattedDepartment = department == null ? "OWNER" : department.toUpperCase();

       return formattedID + " - " + name + " - " + formattedDepartment;
    }
}
