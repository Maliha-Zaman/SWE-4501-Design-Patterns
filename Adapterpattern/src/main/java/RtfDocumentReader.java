public class RtfDocumentReader implements AdvancedDocumentReader {
    @Override
    public void readDocx(String fileName) {
        // Do nothing
    }

    @Override
    public void readRtf(String fileName) {
        System.out.println("Reading RTF file. Name: " + fileName);
    }
}

