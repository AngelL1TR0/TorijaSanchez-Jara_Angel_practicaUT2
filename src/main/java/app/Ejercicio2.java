package app;

import service.FileService;

import java.io.IOException;

public class Ejercicio2 {

    private final static String PATH = "src/main/resources/invoice_202009.txt";
    public static void main(String[] args) throws IOException {
        FileService fileService = new FileService();
        fileService.makeInvoice(PATH);
    }
}
