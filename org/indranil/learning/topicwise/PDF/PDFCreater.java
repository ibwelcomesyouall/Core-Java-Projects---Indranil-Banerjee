package org.indranil.learning.topicwise.PDF;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PDFCreater {
    
    public static void main(String [] args) throws DocumentException
    {
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        /*The first argument is the page size. 
        The next arguments are left, right, top, and bottom margins, respectively. 
        The type of this document is not yet defined. 
        It depends on the type of writer you create. 
        For our sample, we choose com.itextpdf.text.pdf.PdfWriter. 
        Other writers are HtmlWriter, RtfWriter, XmlWriter, and several others. 
        Their names explain their purposes self-sufficiently.*/
        try
        {
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("F:\\Study\\Programming language\\MyFirstPdf.pdf"));
        document.open();
        Anchor anchorTarget = new Anchor("First page of the document.");
        anchorTarget.setName("BackToTop");
        Paragraph paragraph1 = new Paragraph();
        paragraph1.setSpacingBefore(50);
        paragraph1.add(anchorTarget);
        document.add(paragraph1);
        document.add(new Paragraph("Some more text on the first page with different color and font type.",FontFactory.getFont(FontFactory.COURIER, 14, Font.BOLD, new CMYKColor(0, 255, 0, 0))));
        Paragraph title1 = new Paragraph("Chapter 1",FontFactory.getFont(FontFactory.HELVETICA,18, Font.BOLDITALIC, new CMYKColor(0, 255, 255,17)));
        Chapter chapter1 = new Chapter(title1, 1);
        chapter1.setNumberDepth(0);
        Paragraph title11 = new Paragraph("This is Section 1 in Chapter 1", FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD,new CMYKColor(0, 255, 255,17)));  
        Section section1 = chapter1.addSection(title11);
        Paragraph someSectionText = new Paragraph("This text comes as part of section 1 of chapter 1.");
        section1.add(someSectionText);
        someSectionText = new Paragraph("Following is a 3 X 2 table.");
        section1.add(someSectionText);
        PdfPTable t = new PdfPTable(3);
        t.setSpacingBefore(25);
        t.setSpacingAfter(25);
        PdfPCell c1 = new PdfPCell(new Phrase("Header1"));  
        t.addCell(c1);
        PdfPCell c2 = new PdfPCell(new Phrase("Header2"));
        t.addCell(c2);
        PdfPCell c3 = new PdfPCell(new Phrase("Header3"));
        t.addCell(c3);
        t.addCell("1.1");
        t.addCell("1.2");
        t.addCell("1.3");
        section1.add(t);
        List l = new List(true, false, 10);
        l.add(new ListItem("First item of list"));
        l.add(new ListItem("Second item of list"));
        section1.add(l);
        Image image2 = Image.getInstance("F:\\Study\\Programming language\\batman-logo-big.bmp");
        image2.scaleAbsolute(120f, 120f);
        section1.add(image2);
        Paragraph title2 = new Paragraph("Using Anchor",FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD,new CMYKColor(0, 255, 0, 0)));
        section1.add(title2);
        title2.setSpacingBefore(5000);
        Anchor anchor2 = new Anchor("Back To Top");
        anchor2.setReference("#BackToTop");
        section1.add(anchor2);
        document.add(chapter1);
        document.close();
        }
        catch(FileNotFoundException e)
        {
        System.out.println("The file is not found");
        } catch (BadElementException | IOException ex) {
            Logger.getLogger(PDFCreater.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

