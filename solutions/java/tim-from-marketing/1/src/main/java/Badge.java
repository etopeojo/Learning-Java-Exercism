class Badge {
    public String print(Integer id, String name, String department) {
        String badge = "";
        if (id == null && department == null) {
            badge += name;
            badge += " - " + "OWNER";
        } else if (id == null) {
            badge += name;
            badge += " - " + department.toUpperCase();
        } else if (department == null) {
            badge += "[" + id + "]";
            badge += " - " + name;
            badge += " - " + "OWNER";
        } else {
            badge += "[" + id + "]";
            badge += " - " + name;
            badge += " - " + department.toUpperCase();
        }

        return badge;
    }
}
