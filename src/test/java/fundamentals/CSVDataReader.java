package fundamentals;

import com.opencsv.CSVParser;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import frameworks.Person;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.List;

public class CSVDataReader {
    public List<Person> csvRead(String path){
        String[] columns = new String[] { "firstName","lastName","email","password","address","state","city","zip","mobile" };
        final ColumnPositionMappingStrategy<Person> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Person.class);
        strategy.setColumnMapping(columns);
        CSVReader csvReader = null;
        try {
            URL resource = getClass().getClassLoader().getResource(path);
            csvReader = new CSVReader(new FileReader(resource.getFile()), CSVParser.DEFAULT_SEPARATOR,
                    CSVParser.DEFAULT_QUOTE_CHARACTER, 1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        CsvToBean csvToBean = new CsvToBean();
        List<Person> list = csvToBean.parse(strategy, csvReader);
        return list;
    }

}
