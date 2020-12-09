package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport reportText = new TextReport();
        String text = reportText.generate("Report's name", "Report's body");
        System.out.println(text);
        System.out.println("----------------------");
        HtmlReport reportHtml = new HtmlReport();
        String html = reportHtml.generate("Report's name", "Report's body");
        System.out.println(html);
        System.out.println("----------------------");
        JSONReport reportJson = new JSONReport();
        String json = reportJson.generate("Report's name", "Report's body");
        System.out.println(json);
    }
}
