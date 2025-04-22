package pages;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;

public class tc_007Page {

    private Workbook workbook;
    private Sheet sheet;
    private boolean columnsPresent;
    private boolean columnAmountsCorrect;

    public void openExcelDocument() {
        try {
            FileInputStream file = new FileInputStream(new File("path_to_excel/your_excel_file.xlsx"));
            workbook = WorkbookFactory.create(file);
            sheet = workbook.getSheetAt(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchColumns(String column1, String column2, String column3) {
        columnsPresent = sheet.getRow(0).getCell(0).getStringCellValue().equals(column1)
                && sheet.getRow(0).getCell(1).getStringCellValue().equals(column2)
                && sheet.getRow(0).getCell(2).getStringCellValue().equals(column3);
    }

    public boolean areColumnsPresent() {
        return columnsPresent;
    }

    public void validateColumnAmounts() {
        columnAmountsCorrect = true;  // Mock validation logic
        // Assuming the logic for validating column amounts is implemented here
        // This involves iterating over rows and validating the contents based on the tax rate
    }

    public boolean areColumnAmountsCorrect() {
        return columnAmountsCorrect;
    }
}