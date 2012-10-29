/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesaes;

import java.io.FileOutputStream;
import javax.swing.JTable;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author Milii2
 */
public class GeneraExcel {
    
   
    public GeneraExcel(JTable table) {
                HSSFWorkbook libro = new HSSFWorkbook();
	        HSSFSheet hoja = libro.createSheet();
	        for (int i = 0; i < table.getRowCount()-1; i++) {
	            HSSFRow fila = hoja.createRow(i);          	            if(i==0){
	                for (int j = 0; j < table.getColumnCount()-1; j++) {
	                    HSSFCell celda = fila.createCell(j);
	                    celda.setCellValue(new HSSFRichTextString(table.getColumnModel().getColumn(j).getHeaderValue().toString()));
	                }
	            }else{
	                for (int j = 0; j < table.getColumnCount()-1; j++) {
	                    HSSFCell celda = fila.createCell(j);
	                    if(table.getValueAt(i, j)!=null)
	                        celda.setCellValue(new HSSFRichTextString(table.getValueAt(i, j).toString()));
	                }
	            }
	            try {
	                FileOutputStream elFichero = new FileOutputStream("C:\\holamundo.xls");
                        libro.write(elFichero);
	                elFichero.close();
	            } catch (Exception e) {
                        System.out.println("no se pudo crear el fichero");
	            }
	        }
	    }

    

}
