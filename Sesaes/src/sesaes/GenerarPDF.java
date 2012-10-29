
package sesaes;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GenerarPDF
{
    private File ruta_destino=null;
    
    public GenerarPDF(){  
    
    }
    
 public void print(JTable tabla, String t) {
     
     Colocar_Destino();
     
     if(this.ruta_destino!=null){

     Document document = new Document(PageSize.LETTER.rotate());
   
     
    try {
      //PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C:\\informe.pdf"));
      PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(this.ruta_destino + ".pdf"));
     
      //writer.setBoxSize("art", new Rectangle(document.left(), document.bottom(), document.right(), document.top()));
      //writer.setBoxSize("art",new Rectangle (10,10,10,10));
      document.open();

      
      Chunk title=new Chunk(t, FontFactory.getFont(FontFactory.defaultEncoding, 20, Font.BOLD, Color.BLACK));
               
      document.add(Chunk.NEWLINE);
      document.add(Chunk.NEWLINE);
      document.add(Chunk.NEWLINE);
   
      document.add(title);
      PdfContentByte cb = writer.getDirectContent();
    
      cb.saveState();

      Graphics2D g2 = cb.createGraphicsShapes(500, 500);
      g2.translate(150, 0);
       
      //g2.clipRect(0, 0, 500, 500);
      Shape oldClip = g2.getClip();
      tabla.print(g2);

      g2.setClip(oldClip);    

      g2.dispose();
      cb.restoreState();
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    
    document.close();
    
     }
     
     int respuesta = JOptionPane.showConfirmDialog(null,"Se ha generado el documento " +this.ruta_destino+", ¿Desea abrirlo?","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
     GenerarPDF pdf = new GenerarPDF();
                if(respuesta == JOptionPane.OK_OPTION)
                  pdf.abrirPDF();  
  }

 public void Colocar_Destino(){
       FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo PDF","pdf","PDF");
       JFileChooser fileChooser = new JFileChooser();       
       fileChooser.setFileFilter(filter);
       int result = fileChooser.showSaveDialog(null);
       if ( result == JFileChooser.APPROVE_OPTION ){   
           this.ruta_destino = fileChooser.getSelectedFile().getAbsoluteFile();
        }
       
    }  
 
    public void abrirPDF(){
        /* Abrir el archivo PDF */
       try
        {
            //File ruta=this.ruta_destino;
        
           //File path = new File (""+ruta);
            //Runtime.getRuntime().exec("C:\\Archivos de Programa\\Adobe\\Reader 10.0\\Reader\\AcroRd32.exe " + this.ruta_destino);
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + this.ruta_destino);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }  
      /*  File ruta=this.ruta_destino;
        try {
        File path = new File (""+ruta);
        Desktop.getDesktop().open(path);
        }catch (IOException ex) {
        }*/
    } 
}