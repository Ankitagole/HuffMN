package fixedLengthEncodingDecoding;
import java.io.IOException;
public class client {

    public static void main(String[] args) throws IOException {
        UniqueCharacter uniqueCharacter = new UniqueCharacter();
        Encoder encoder = new Encoder();
        Bits bits =new Bits();
        BitsTable bitsTable = new BitsTable();
        FileReader fileReader = new FileReader();
        Table table = new Table();
        Writer fileWriter = new Writer();

        byte[] encodingTable = encoder.encode(fileReader.reader("/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/fixedLengthEncodingDecoding/ReadFile"), table.generateUpperBinaryTable());
        fileWriter.write(encodingTable, "/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/fixedLengthEncodingDecoding/Write");
        System.out.println(fileReader.reader("/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/fixedLengthEncodingDecoding/Write"));
        Integer countCharacter = uniqueCharacter.countCharacter(fileReader.reader("/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/fixedLengthEncodingDecoding/ReadFile"));
        System.out.println(bits.getBites(countCharacter));
    }
}
