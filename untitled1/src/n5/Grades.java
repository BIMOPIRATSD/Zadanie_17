package n5;

public class Grades {

    private String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": return "Безупречно";
            case "4": return "Потрясающе";
            case "3": return "Восхитительно";
            case "2": return "Прекрасно";
            default:  return "Очаровательно";
        }
    }
    public void gradeBeautifier(String grades) {
        if (grades == null || grades.trim().isEmpty()) {
            return;
        }

        String[] records = grades.split(";");

        for (String record : records) {
            if (record == null || record.trim().isEmpty()) {
                continue;
            }

            String[] parts = record.split(",");
            if (parts.length < 4) {
                continue;
            }

            String name = capitalize(parts[0].trim());
            String surname = capitalize(parts[1].trim());
            String subject = parts[2].trim().toLowerCase();
            String gradeText = gradeToString(parts[3].trim());

            System.out.println(name + " " + surname + " " + subject + " — " + gradeText);
        }
    }
    public static void main(String[] args) {
        Grades g = new Grades();
        String input = "вероника,чехова,ФИЗИКА,5;анна,строкова,МАТЕМАТИКА,4;иван,петров,ГЕОМЕТРИЯ,5";
        g.gradeBeautifier(input);
    }
}