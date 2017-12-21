/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Furkan BAYCAN
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/**
 *
 * @author Furkan BAYCAN
 */
public class JsonText {
    JsonText(List<JsonModel> veriler, List<String> sonuclar) {
        try{
            JSONObject kok = new JSONObject();
            JSONArray list = new JSONArray();
            int i = 0;
            for(JsonModel veri : veriler){
                JSONObject obj = new JSONObject();
                obj.put("OynadigiBolge", veri.getPositionCount());
                obj.put("BegeniSayisi", veri.getAgeCount());
                obj.put("ProfilZiyaretSayisi", veri.getLeagueSelect());
                obj.put("ReklamKategorisi", veri.getOverallCount());
                obj.put("ReklamYayinlamaSikligi", veri.getSpecialityCount());
                obj.put("Sonuc", sonuclar.get(i));
                i++;
                System.out.println(obj);
                list.put(obj);
            }
            kok.put("Veriler", list);
            System.out.println(list);
            System.out.println(kok);
            try (FileWriter file = new FileWriter("C:\\Users\\Furkan BAYCAN\\Desktop\\text.json")) {
                file.write(kok.toString());
                file.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
