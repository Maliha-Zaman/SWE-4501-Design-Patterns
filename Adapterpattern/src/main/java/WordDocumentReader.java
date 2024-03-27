public class WordDocumentReader implements AdvancedDocumentReader {
    @Override
    public void readDocx(String fileName) {
        System.out.println("Reading DOCX file. Name: " + fileName);
    }

    @Override
    public void readRtf(String fileName) {
        // Do nothing
    }
}
