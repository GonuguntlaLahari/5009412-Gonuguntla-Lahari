public class App {
    public static void main(String[] args) throws Exception {
        DocumentFactory documentFactory=new WordFactory();
        Document wDocument=documentFactory.createDocument();
        wDocument.disp();
        wDocument.open();
        wDocument.save();
        wDocument.close();
        System.out.println();
        DocumentFactory pdfDocumentFactory=new PdfFactory();
        Document pdfDocument=pdfDocumentFactory.createDocument();
        pdfDocument.disp();
        pdfDocument.open();
        pdfDocument.save();
        pdfDocument.close();
        System.out.println();
        DocumentFactory excelDocumentFactory=new ExcelFactory();
        Document excelDocument=excelDocumentFactory.createDocument();
        excelDocument.disp();
        excelDocument.open();
        excelDocument.save();
        excelDocument.close();
    }
}
