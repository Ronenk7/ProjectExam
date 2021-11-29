package utilities;

import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ManageDDT extends CommonOps{
    /*
    ###################################################################################
    Method name: getDataObject
    Method description: This method call the csv file
    Method Return: Object[][]
    ###################################################################################
     */
    @DataProvider(name = "data-provider-mortgage")
    public Object[][] getDataObject(){
        return getDataFromCSV(getData("DDTFile"));
    }
    /*
    ###################################################################################
    Method name: readCSV
    Method description: This method get the data from csv mortgage file
    Method parameters : String
    Method Return: List<String>
    ###################################################################################
     */
    public static List<String> readCSV(String csvFile){
        List<String> lines = null;
        File file = new File(csvFile);
        try {
            lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
    /*
    ###################################################################################
    Method name: getDataFromCSV
    Method description: This method get the file path and return the data(from the csv file)
    Method parameters : String
    Method Return: Object[][]
    ###################################################################################
     */
    public static Object[][] getDataFromCSV(String filePath){
        Object[][] data = new Object[2][5];
        List<String> csvData = readCSV(filePath);
        for (int i=0; i<csvData.size(); i++){
            data[i][0] = csvData.get(i).split(",")[0];
            data[i][1] = csvData.get(i).split(",")[1];
            data[i][2] = csvData.get(i).split(",")[2];
            data[i][3] = csvData.get(i).split(",")[3];
            data[i][4] = csvData.get(i).split(",")[4];
        }
        return data;
    }
}
