package com.group4.main;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDataHandler {

    private static final String CSV_FILE_PATH = "employees.csv";

    public static List<String[]> readEmployeeData() {
        List<String[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                data.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static void writeEmployeeData(List<String[]> data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CSV_FILE_PATH))) {
            for (String[] record : data) {
                bw.write(String.join(",", record));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addEmployee(String[] newEmployee) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CSV_FILE_PATH, true))) {
            bw.write(String.join(",", newEmployee));
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void updateEmployee(int rowIndex, String[] updatedEmployee) {
        List<String[]> data = readEmployeeData();
        if (rowIndex >= 0 && rowIndex < data.size()) {
            data.set(rowIndex, updatedEmployee);
            writeEmployeeData(data);
        }
    }

    public static void deleteEmployee(int rowIndex) {
        List<String[]> data = readEmployeeData();
        if (rowIndex >= 0 && rowIndex < data.size()) {
            data.remove(rowIndex);
            writeEmployeeData(data);
        }
    }
}
