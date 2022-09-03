import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Main1 {
    public static void main(String[]args) {
        try {
            MongoClient client = MongoClients.create("mongodb+srv://langay:nopass098@cluster1.flu4hjg.mongodb.net/?retryWrites=true&w=majority");
            System.out.println("connection established");
            MongoDatabase database = client.getDatabase("Data1");
            System.out.println("pulling the database");
            MongoCollection<Document> collection = database.getCollection("coll");
            System.out.println("getting the collection file access");
            Document doc = new Document("Id ","001").append("name","brian");
            System.out.println("inserting document ");
            collection.insertOne(doc);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
