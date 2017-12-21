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
public class JsonModel {
    
    private String positionCount;
    private String ageCount;
    private String leagueSelect;
    private String overallCount;
    private String specialityCount;
    
    public JsonModel(String positionCount, String ageCount, String leagueSelect, String overallCount, String specialityCount) {
        this.positionCount = positionCount;
        this.ageCount = ageCount;
        this.leagueSelect = leagueSelect;
        this.overallCount = overallCount;
        this.specialityCount = specialityCount;
    }

    public String getPositionCount() {
        return positionCount;
    }

    public void setPositionCount(String positionCount) {
        this.positionCount = positionCount;
    }

    public String getAgeCount() {
        return ageCount;
    }

    public void setAgeCount(String ageCount) {
        this.ageCount = ageCount;
    }

    public String getLeagueSelect() {
        return leagueSelect;
    }

    public void setLeagueSelect(String leagueSelect) {
        this.leagueSelect = leagueSelect;
    }

    public String getOverallCount() {
        return overallCount;
    }

    public void setOverallCount(String overallCount) {
        this.overallCount = overallCount;
    }

    public String getSpecialityCount() {
        return specialityCount;
    }

    public void setSpecialityCount(String specialityCount) {
        this.specialityCount = specialityCount;
    }
    
    
}
