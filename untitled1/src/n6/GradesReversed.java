package n6;

import java.util.ArrayList;
import java.util.List;

public class GradesReversed {

    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": return "5";
            case "Потрясающе": return "4";
            case "Восхитительно": return "3";
            case "Прекрасно": return "2";
            default: return "1";
        }
    }

    public String serializeGrades(String[] grades) {
        if (grades == null) {
            return "";
        }

        List<String> records = new ArrayList<>();

        for (String line : grades) {
            if (line == null || line.trim().isEmpty()) {
                continue;
            }

            String[] parts = line.split(" — ", 2);
            if (parts.length != 2) {
                continue;
            }

            String gradeText = parts[1].trim();

            String[] nameSubject = parts[0].trim().split("\\s+", 4);
            if (nameSubject.length < 3) {
                continue;
            }

            String name = nameSubject[0].toLowerCase();
            String surname = nameSubject[1].toLowerCase();
            String subject = nameSubject[2].toLowerCase();
            String grade = gradeStringToInt(gradeText);

            String record = String.join(",", name, surname, subject, grade);
            records.add(record);
        }

        return String.join(";", records);
    }
    public static void main(String[] args) {
        GradesReversed gr = new GradesReversed();
        String[] input = {
                "Вероника Чехова физика — Безупречно",
                "Анна Строкова математика — Потрясающе",
                "Иван Петров геометрия — Безупречно"
        };
        System.out.println(gr.serializeGrades(input));
    }
}