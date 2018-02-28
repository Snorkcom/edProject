/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilopedia.model;

import java.util.Objects;

/**
 *
 * @author Anna
 */
public class Districts
{
    private int ID;
    private String NAME;
    private String DESCRIPTION;
    private String HISTORICAL_CONTEXT;
    private String IMAGE;
    private String FEATURES;
    private String REQUIREMENTS;
    private String UTILITY;

    public Districts() {
    }

    public Districts( int id,                     String name,        String description, 
                      String historical_context,  String image,       String features, 
                      String requirements,        String utility)
    {
        this.ID = id;
        this.NAME = name;
        this.DESCRIPTION = description;
        this.HISTORICAL_CONTEXT = historical_context;
        this.IMAGE = image;
        this.FEATURES = features;
        this.REQUIREMENTS = requirements;
        this.UTILITY = utility;        
    }
 
    /* getters */
    public int getID() {
        return ID;
    }
    public String getNAME() {
        return NAME;
    }
   public String getDESCRIPTION() {
        return DESCRIPTION;
    }
   public String getHISTORICAL_CONTEXT() {
        return HISTORICAL_CONTEXT;
    }   
   public String getIMAGE() {
        return IMAGE;
    }
   public String getFEATURES() {
        return FEATURES;
    }
   public String getREQUIREMENTS() {
        return REQUIREMENTS;
    }
   public String getUTILITY() {
        return UTILITY;
    }
   
    /* setters */
    public void setID(int id) {
        this.ID = id;
    }
    public void setNAME(String name) {
       this.NAME = name;
    }
   public void setDESCRIPTION(String description) {
        this.DESCRIPTION = description;
    }
   public void setHISTORICAL_CONTEXT(String historical_context) {
        this.HISTORICAL_CONTEXT = historical_context;
    }   
   public void setIMAGE(String image) {
        this.IMAGE = image;
    }
   public void setFEATURES(String features) {
        this.FEATURES = features;
    }
   public void setREQUIREMENTS(String requirements) {
        this.REQUIREMENTS = requirements;
    }
   public void setUTILITY(String utility) {
        this.UTILITY = utility;
    }
   
    /* Переопределение hashCode и equals toString */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 8 * hash + this.ID;
        hash = 8 * hash + Objects.hashCode(this.NAME);
        hash = 8 * hash + Objects.hashCode(this.DESCRIPTION);
        hash = 8 * hash + Objects.hashCode(this.HISTORICAL_CONTEXT);
        hash = 8 * hash + Objects.hashCode(this.IMAGE);
        hash = 8 * hash + Objects.hashCode(this.FEATURES);
        hash = 8 * hash + Objects.hashCode(this.REQUIREMENTS);
        hash = 8 * hash + Objects.hashCode(this.UTILITY);
        return hash;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Districts other = (Districts) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (!Objects.equals(this.NAME, other.NAME)) {
            return false;
        }
        if (!Objects.equals(this.DESCRIPTION, other.DESCRIPTION)) {
            return false;
        }
        if (!Objects.equals(this.HISTORICAL_CONTEXT, other.HISTORICAL_CONTEXT)) {
            return false;
        }
        if (!Objects.equals(this.IMAGE, other.IMAGE)) {
            return false;
        }
        if (!Objects.equals(this.FEATURES, other.FEATURES)) {
            return false;
        }
        if (!Objects.equals(this.REQUIREMENTS, other.REQUIREMENTS)) {
            return false;
        }
        if (!Objects.equals(this.UTILITY, other.UTILITY)) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "Districts{" + "ID= " + ID + ", NAME= " + NAME + ", DESCRIPTION= " + DESCRIPTION + 
                ", HISTORICAL_CONTEXT= " + HISTORICAL_CONTEXT +", IMAGE= " + IMAGE +
                ", FEATURES= " + FEATURES +", REQUIREMENTS= " + REQUIREMENTS +", UTILITY= " + UTILITY +"}";
    }
}

