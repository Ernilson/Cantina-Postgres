/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.zUtils;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JTable;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/**
 *
 * @author S60254831168
 */
public class Exporter {

    private File file;
    private List<JTable> tabla;
    private List<String> nome_files;

    public Exporter() {
    }

    public Exporter(File file, List<JTable> tabla, List<String> nome_files) throws Exception {
        this.file = file;
        this.tabla = tabla;
        this.nome_files = nome_files;
        if (nome_files.size() != tabla.size()) {
            throw new Exception("Erro");
        }
    }

    public boolean export() {
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
            WritableWorkbook w = Workbook.createWorkbook(file);
            for (int index = 0; index < tabla.size(); index++) {
                JTable table = tabla.get(index);
                WritableSheet s = w.createSheet(nome_files.get(index), 0);
                for (int i = 0; i < table.getColumnCount(); i++) {
                    for (int j = 0; j < table.getRowCount(); j++) {
                        Object obj = table.getValueAt(j, i);
                        s.addCell(new Label(i, j, String.valueOf(obj)));
                    }

                }
            }
            w.write();
            w.close();

            return true;

        } catch (Exception e) {
            return false;
        }

    }
}
