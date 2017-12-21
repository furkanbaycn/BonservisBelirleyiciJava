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
public class Models {
    private int positionCount;
    private int ageCount;
    private int leagueSelect;
    private int overallCount;
    private int specialityCount;
    
    public Models (int positionCount, int ageCount, int leagueSelect, int overallCount, int specialityCount) {
        this.positionCount = positionCount;
        this.ageCount = ageCount;
        this.leagueSelect = leagueSelect;
        this.overallCount = overallCount;
        this.specialityCount = specialityCount;
    }

    public int getPositionCount() {
        return positionCount;
    }

    public void setPositionCount(int positionCount) {
        this.positionCount = positionCount;
    }

    public int getAgeCount() {
        return ageCount;
    }

    public void setAgeCount(int ageCount) {
        this.ageCount = ageCount;
    }

    public int getLeagueSelect() {
        return leagueSelect;
    }

    public void setLeagueSelect(int leagueSelect) {
        this.leagueSelect = leagueSelect;
    }

    public int getOverallCount() {
        return overallCount;
    }

    public void setOverallCount(int overallCount) {
        this.overallCount = overallCount;
    }

    public int getSpecialityCount() {
        return specialityCount;
    }

    public void setSpecialityCount(int specialityCount) {
        this.specialityCount = specialityCount;
    }
    
}
