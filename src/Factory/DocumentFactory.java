package Factory;

import CasosDeUso.Document;
import CasosDeUso.DocxDocument;
import CasosDeUso.PDFDocument;

public class DocumentFactory {
    public static Document createDocument(String extension){
        if(extension.equals("pdf")){
            return new PDFDocument();
        } else if(extension.equals("docx")){
            return new DocxDocument();
        }
        throw new UnsupportedOperationException("Formato no soportado");
    }
}
