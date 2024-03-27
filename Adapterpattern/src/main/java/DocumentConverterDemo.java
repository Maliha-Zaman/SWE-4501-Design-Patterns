public class DocumentConverterDemo {
    public static void main(String[] args) {
        DocumentConverter documentConverter = new TextDocumentConverter();

        documentConverter.convert("txt", "document.txt");
        documentConverter.convert("docx", "document.docx");
        documentConverter.convert("rtf", "document.rtf");
        documentConverter.convert("pdf", "document.pdf");
    }
}
