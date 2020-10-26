package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        //System.out.println(text);
        JSONReport jsonReport = new JSONReport();
        String text1 = jsonReport.generate("Report's name", "Report's body");
        String text2 = jsonReport.generateWithLineSeparator("Report's name", "Report's body");
        System.out.println("GenerateWithoutLineSeparator");
        System.out.println(text1);
        System.out.println("\nGenerateWithLineSeparator");
        System.out.println(text2);
    }
}