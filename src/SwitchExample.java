class SwitchExample {
    public static void main(String args[]) {
        String day = "Mon";

        switch (day) {
            case "Mon":
                System.out.println("It is monday");
                break;
            case "Tue":
                System.out.println("it is tuesday");
                break;
            case "Wed":
                System.out.println("ITis wednesday");
                break;

            default:
                System.out.println("invalid day");
        }
    }
}