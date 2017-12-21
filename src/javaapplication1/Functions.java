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
public class Functions {
    
    public int Functions(Models models){
        int bf = belirleyiciFiyat(models.getPositionCount(),models.getAgeCount(),models.getOverallCount());
        int lf = ligFiyat(models.getLeagueSelect());
        int ozf = ozellikFiyat(models.getSpecialityCount());
        float pointFunc = funcs(bf,lf,ozf);  
        return (int) pointFunc;
        
    }
    
    int belirleyiciFiyat (int positionCount, int ageCount, int overallCount){
        int point = 0;
    
        if(overallCount == 0){
            if (positionCount == 0 && ageCount == 0){
                point += 5;
            }
            else if(positionCount == 0 && ageCount == 1){
                point += 4;
            }
            else if(positionCount == 0 && ageCount == 2){
                point += 3;              
            }
            else if(positionCount == 0 && ageCount == 3) {
                point += 1;
            }
            if(positionCount == 1 && ageCount == 0){
                point += 7;
            }
            else if(positionCount == 1 && ageCount == 1){
                point += 5;
            }
            else if(positionCount == 1 && ageCount == 2){
                point += 3;
            }
            else if(positionCount == 1 && ageCount == 3){
                point += 1;
            }
            if(positionCount == 2 && ageCount == 0){
                point += 10;
            }
            else if(positionCount == 2 && ageCount == 1){
                point += 8;
            }
            else if(positionCount == 2 && ageCount == 2){
                point += 5;
            }
            else if(positionCount == 2 && ageCount == 3){
                point += 2;
            }
            if(positionCount == 3 && ageCount == 0){
                point += 13;
            }
            else if(positionCount == 3 && ageCount == 1){
                point += 7;
            }
            else if(positionCount == 3 && ageCount == 2){
                point += 5;
            }
            else if(positionCount == 3 && ageCount == 3){
                point += 2;
            }
        }
        if(overallCount == 1){
            if (positionCount == 0 && ageCount == 0){
                point += 8;
            }
            else if(positionCount == 0 && ageCount == 1){
                point += 6;
            }
            else if(positionCount == 0 && ageCount == 2){
                point += 4;              
            }
            else if(positionCount == 0 && ageCount == 3) {
                point += 2;
            }
            if(positionCount == 1 && ageCount == 0){
                point += 10;
            }
            else if(positionCount == 1 && ageCount == 1){
                point += 8;
            }
            else if(positionCount == 1 && ageCount == 2){
                point += 5;
            }
            else if(positionCount == 1 && ageCount == 3){
                point += 3;
            }
            if(positionCount == 2 && ageCount == 0){
                point += 13;
            }
            else if(positionCount == 2 && ageCount == 1){
                point += 10;
            }
            else if(positionCount == 2 && ageCount == 2){
                point += 8;
            }
            else if(positionCount == 2 && ageCount == 3){
                point += 5;
            }
            if(positionCount == 3 && ageCount == 0){
                point += 18;
            }
            else if(positionCount == 3 && ageCount == 1){
                point += 14;
            }
            else if(positionCount == 3 && ageCount == 2){
                point += 10;
            }
            else if(positionCount == 3 && ageCount == 3){
                point += 6;
            }
        }
        if(overallCount == 2){
            if (positionCount == 0 && ageCount == 0){
                point += 35;
            }
            else if(positionCount == 0 && ageCount == 1){
                point += 31;
            }
            else if(positionCount == 0 && ageCount == 2){
                point += 28;              
            }
            else if(positionCount == 0 && ageCount == 3) {
                point += 22;
            }
            if(positionCount == 1 && ageCount == 0){
                point += 40;
            }
            else if(positionCount == 1 && ageCount == 1){
                point += 36;
            }
            else if(positionCount == 1 && ageCount == 2){
                point += 32;
            }
            else if(positionCount == 1 && ageCount == 3){
                point += 26;
            }
            if(positionCount == 2 && ageCount == 0){
                point += 47;
            }
            else if(positionCount == 2 && ageCount == 1){
                point += 42;
            }
            else if(positionCount == 2 && ageCount == 2){
                point += 36;
            }
            else if(positionCount == 2 && ageCount == 3){
                point += 21;
            }
            if(positionCount == 3 && ageCount == 0){
                point += 58;
            }
            else if(positionCount == 3 && ageCount == 1){
                point += 50;
            }
            else if(positionCount == 3 && ageCount == 2){
                point += 40;
            }
            else if(positionCount == 3 && ageCount == 3){
                point += 29;
            }
        }
        if(overallCount == 3){
            if (positionCount == 0 && ageCount == 0){
                point += 45;
            }
            else if(positionCount == 0 && ageCount == 1){
                point += 39;
            }
            else if(positionCount == 0 && ageCount == 2){
                point += 34;              
            }
            else if(positionCount == 0 && ageCount == 3) {
                point += 27;
            }
            if(positionCount == 1 && ageCount == 0){
                point += 60;
            }
            else if(positionCount == 1 && ageCount == 1){
                point += 54;
            }
            else if(positionCount == 1 && ageCount == 2){
                point += 48;
            }
            else if(positionCount == 1 && ageCount == 3){
                point += 37;
            }
            if(positionCount == 2 && ageCount == 0){
                point += 70;
            }
            else if(positionCount == 2 && ageCount == 1){
                point += 64;
            }
            else if(positionCount == 2 && ageCount == 2){
                point += 58;
            }
            else if(positionCount == 2 && ageCount == 3){
                point += 43;
            }
            if(positionCount == 3 && ageCount == 0){
                point += 75;
            }
            else if(positionCount == 3 && ageCount == 1){
                point += 67;
            }
            else if(positionCount == 3 && ageCount == 2){
                point += 60;
            }
            else if(positionCount == 3 && ageCount == 3){
                point += 48;
            }
        }
        if(overallCount == 4){
            if (positionCount == 0 && ageCount == 0){
                point += 80;
            }
            else if(positionCount == 0 && ageCount == 1){
                point += 69;
            }
            else if(positionCount == 0 && ageCount == 2){
                point += 55;              
            }
            else if(positionCount == 0 && ageCount == 3) {
                point += 46;
            }
            if(positionCount == 1 && ageCount == 0){
                point += 100;
            }
            else if(positionCount == 1 && ageCount == 1){
                point += 90;
            }
            else if(positionCount == 1 && ageCount == 2){
                point += 80;
            }
            else if(positionCount == 1 && ageCount == 3){
                point += 70;
            }
            if(positionCount == 2 && ageCount == 0){
                point += 110;
            }
            else if(positionCount == 2 && ageCount == 1){
                point += 96;
            }
            else if(positionCount == 2 && ageCount == 2){
                point += 85;
            }
            else if(positionCount == 2 && ageCount == 3){
                point += 67;
            }
            if(positionCount == 3 && ageCount == 0){
                point += 130;
            }
            else if(positionCount == 3 && ageCount == 1){
                point += 115;
            }
            else if(positionCount == 3 && ageCount == 2){
                point += 89;
            }
            else if(positionCount == 3 && ageCount == 3){
                point += 75;
            }
        }
        
        return point;  
    }
    
    int ligFiyat(int leagueSelect){
        int point = 0;
        if(leagueSelect == 0){
            point += 30;
        }
        else if(leagueSelect == 1){
            point += 27;
        }
        else if(leagueSelect == 2){
            point += 18;
        }
        else if(leagueSelect == 3){
            point += 21;
        }
        else if(leagueSelect == 4){
            point += 24;
        }
        else{
            point += 12;
        }
        return point;
    }
    
    int ozellikFiyat(int specialityCount){
        int point = 0;
        if(specialityCount == 0){
            point += 1;
        }
        if (specialityCount == 1){
            point += 40;
        }
        else if (specialityCount == 2){
            point += 80;
        }
        else{
            point += 120;
        }
        return point;
    }
    float funcs(int bf, int lf, int ozf){
        float sonuc;
        sonuc = (bf*70)/100 + (lf*5)/100 + (ozf*25)/100;
        return sonuc;
    }
}
