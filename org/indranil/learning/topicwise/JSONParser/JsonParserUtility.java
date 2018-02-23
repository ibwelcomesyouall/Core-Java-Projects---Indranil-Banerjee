package org.indranil.learning.topicwise.JSONParser;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
 
public class JsonParserUtility 
{
    public static void main(String[] args) throws Exception 
    {
        // parsing file "JSONExample.json"
        Object obj = new JSONParser().parse(new FileReader("C:\\Users\\user\\Desktop\\issuesample.json"));
         
        // typecasting obj to JSONObject
        JSONObject jo = (JSONObject) obj;
         
        
        System.out.println(jo.get("expand").toString());
        System.out.println(jo.get("id").toString());
        System.out.println(jo.get("self").toString());
        System.out.println(jo.get("key").toString());
        
        Map fields = (Map)jo.get("fields");
        Map issueType = (Map)fields.get("issuetype");
        
        System.out.println(issueType.get("name"));
        
        Map status = (Map)fields.get("status");
        
        System.out.println(status.get("name"));
        
        Map project = (Map)fields.get("project");
        
        System.out.println(project.get("name"));
        
        System.out.println(fields.get("description"));
        
        System.out.println(fields.get("summary"));
        
        System.out.println(fields.get("created"));
        
       /* Iterator<Map.Entry> itr1 = fields.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }*/
        
        
        
        //System.out.println(jo.get("fields").toString());
        
        
        
        
       /* jdao.setJIRAnum(jo.get("key").toString());
        
        Map issueType = ((Map)jo.get("issuetype"));
        System.out.println(issueType);
        
        Iterator<Map.Entry> itr1 = issueType.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
        
        //jdao.setIssueType(issueType.get("name"));
        
       
         
        System.out.println(jdao.getJIRAnum());
       // System.out.println(jdao.getIssueType());
         
        // getting age
        long age = (long) jo.get("age");
        System.out.println(age);
         
        // getting address
        Map address = ((Map)jo.get("address"));
         
        // iterating address Map
        Iterator<Map.Entry> itr1 = address.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
         
        // getting phoneNumbers
        JSONArray ja = (JSONArray) jo.get("phoneNumbers");
         
        // iterating phoneNumbers
        Iterator itr2 = ja.iterator();
         
        while (itr2.hasNext()) 
        {
            itr1 = ((Map) itr2.next()).entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        }*/
    }
}
