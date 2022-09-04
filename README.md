# maven-mongodb-connection
//For practice "First" you need a empty java project
2.You need to add Maven Framework support
3.locate the pom.xml to add the dependency 
//this is the current new mongo driver dependency 2022 
       <dependency>
            <groupId>org.mongodb</groupId>
            <artifactId>mongodb-driver</artifactId>
            <version>3.12.11</version>
        </dependency>
//you need to log in to your mongodb and setup your cluster and database 
//then create a connection dont forgert to add the current ipaddress your using to your network setting in mongodb
//then create a connection select to app you will have a link to a connection
//also create the database in collection for testing
4.back to the java file here is the list of classes you need to establish the connection to your mongodb database
//MongoClient,MongoDatabase,MongoCollection "Document(Bson)" 
5.Now will start by using the MOngoClient class as follows by help of "MongoClients" to create the connection
MongoClient object1 = MongoClients.create(""); //inside the brackets paste the connection link of database replace <password> with your password
6.MongoDatabase this calass will be used to get database from the Mongoclient by use of the Mongo client object as follows
MongoDatabase object2 = object1.getDatabase(""); //inside you pass in the database name you created in your mongodb collections
7.MongoCollection in this clas will be able to get the collection data from the mongodb as follows by help of MongoDatabase object
MongoCollection<Document> object3 = object2.getCollection(""); //inside you pass in the collection name of your data
8.Extra knwledge on how to update the collection by inserting a document to your Mongodb is by use of Bson<Document> as follow
Document document1 = new Document("id","1").append("name","john");
//to insert this document we use the MongoCollection object as follows
object3.insertOne(document1);
//after this run it and go the mongodb collection refresh and this document will be there
