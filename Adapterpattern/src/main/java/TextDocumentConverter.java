public class TextDocumentConverter implements DocumentConverter {
    DocumentAdapter documentAdapter;

    @Override
    public void convert(String inputFormat, String inputFile) {
        if (inputFormat.equalsIgnoreCase("txt")) {
            System.out.println("Converting TXT file to PDF. Name: " + inputFile);
        } else if (inputFormat.equalsIgnoreCase("docx") || inputFormat.equalsIgnoreCase("rtf")) {
            documentAdapter = new DocumentAdapter(inputFormat);
            documentAdapter.convert(inputFormat, inputFile);
        } else {
            System.out.println("Invalid format. " + inputFormat + " format not supported");
        }
    }
}
