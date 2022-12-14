package dao;

import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface FileDao {
    List<String> getLinesInFiles(File file) throws IOException;

    void replaceCaracters(String[] splitLine);

    void showInfoFile(String[] splitLine, double costeTotal, double beneficio, String invoiceName);

    void writeInFile(String nombreFactura, String[] splitLine, double totalCost, double benefit);

    void writeInResultFile(String nombreFactura, int cantidadArticulos, double totalBeneficio, String[] splitLine);

    void createExcelInDisk(Workbook workbook, String path, String new_path) throws IOException;
}