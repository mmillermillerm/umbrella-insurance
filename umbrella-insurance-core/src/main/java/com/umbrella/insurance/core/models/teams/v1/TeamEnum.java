package com.umbrella.insurance.core.models.teams.v1;

public enum TeamEnum {
    Arizona_Cardinals,
    Atlanta_Falcons,
    Baltimore_Ravens,
    Buffalo_Bills,
    Carolina_Panthers,
    Chicago_Bears,
    Cincinnati_Bengals,
    Cleveland_Browns,
    Dallas_Cowboys,
    Denver_Broncos,
    Detroit_Lions,
    Green_Bay_Packers,
    Houston_Texans,
    Indianapolis_Colts,
    Jacksonville_Jaguars,
    Kansas_City_Chiefs,
    Las_Vegas_Raiders,
    Los_Angeles_Chargers,
    Los_Angeles_Rams,
    Miami_Dolphins,
    Minnesota_Vikings,
    New_England_Patriots,
    New_Orleans_Saints,
    New_York_Giants,
    New_York_Jets,
    Philadelphia_Eagles,
    Pittsburgh_Steelers,
    San_Francisco_49ers,
    Seattle_Seahawks,
    Tampa_Bay_Buccaneers,
    Tennessee_Titans,
    Washington_Commanders;
    public String toString() {
        return this.name().replace("_", " ");
    }
}
