public class DocumentAdapter implements DocumentConverter {

    AdvancedDocumentReader advancedDocumentReader;

    public DocumentAdapter(String inputFormat) {
        if (inputFormat.equalsIgnoreCase("docx")) {
            advancedDocumentReader = new WordDocumentReader();
        } else if (inputFormat.equalsIgnoreCase("rtf")) {
            advancedDocumentReader = new RtfDocumentReader();
        }
    }

    @Override
    public void convert(String inputFormat, String inputFile) {
        if (inputFormat.equalsIgnoreCase("docx")) {
            advancedDocumentReader.readDocx(inputFile);
        } else if (inputFormat.equalsIgnoreCase("rtf")) {
            advancedDocumentReader.readRtf(inputFile);
        }
    }
}

