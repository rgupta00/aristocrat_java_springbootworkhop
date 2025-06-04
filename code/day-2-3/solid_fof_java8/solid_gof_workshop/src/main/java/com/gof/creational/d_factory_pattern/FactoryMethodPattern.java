package com.gof.creational.d_factory_pattern;
import java.io.File;
import java.util.List;
//factory method ex: batch processing app
/*
Defind an interface (abstract) for creating an object, but let subclass decide which object to instantiate,
		Factory method let a class defer instantiation to subclass using inheritance.
 */
abstract  class BatchProcessor {
    public abstract Parser getParser(String format);

    public void processBatch(String fileName, String format) {
        File file = openFile();
        Parser parser = getParser(format);
        List<Record> records = parser.parse();
        processorRecords(records);
        writeSummray();
        closeFile();

    }
    private void processorRecords(List<Record> records) {
        System.out.println("processing each record to db");
    }

    private void writeSummray() {
        System.out.println("writing summery report");
    }

    private void closeFile() {
        System.out.println("closing the file...");
    }

    private File openFile() {
        System.out.println("open the file...");
        return null;
    }
}

class Record {}

interface Parser {
    public List<Record> parse();
}
class XMLParser implements Parser {

    public XMLParser(File file) {
        System.out.println("creating XMLParser...");
    }

    public List<Record> parse() {
        System.out.println("creating record list using XML parser...");
        return null;
    }
}
class CSVParser  implements Parser {

    public CSVParser(File file) {
        System.out.println("creating CSVParser...");
    }

    public List<Record> parse() {
        System.out.println("creating record list using CSV parser...");
        return null;
    }
}

class TextParser  implements Parser {
    public TextParser(File file) {
        System.out.println("creating text parser...");
    }

    public List<Record> parse() {
        System.out.println("creating record list using text parser...");
        return null;
    }
}

class XMLBatchProcessor extends BatchProcessor {
    public Parser getParser(String format) {
        return new XMLParser(new File("demo.xml"));
    }
}

public class FactoryMethodPattern {
    public static void main(String[] args) {
        BatchProcessor batchProcessor=new XMLBatchProcessor();
        batchProcessor.processBatch("foo","xml");
    }
}
