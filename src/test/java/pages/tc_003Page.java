package pages;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

public class tc_003Page {
    private Workbook workbook;
    private Row headerRow;

    public void openExcelFile() {
        try {
            FileInputStream file = new FileInputStream(new File("ruta/del/archivo.xlsx"));
            workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);
            headerRow = sheet.getRow(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadColumnHeaders() {
        // Method to ensure headerRow is initialized and ready for testing
        if (headerRow == null) throw new IllegalStateException("Header row not initialized.");
    }

    public boolean isEstadoCodigoColumnInRightPosition() {
        Iterator<Cell> cellIterator = headerRow.cellIterator();
        boolean foundI = false;
        while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();
            if (foundI && cell.getStringCellValue().equals("Estado Código")) {
                return true;
            }
            if (cell.getStringCellValue().equals("i")) {
                foundI = true;
            }
        }
        return false;
    }

    public boolean isEstadoCodigoColumnInExactPosition() {
        // Assuming column 'i' is in position 8 (9th column, zero-indexed system)
        // therefore 'Estado Código' should be in position 9 (10th column, zero-indexed system)
        Cell cell = headerRow.getCell(9);
        return cell != null && "Estado Código".equals(cell.getStringCellValue());
    }
}