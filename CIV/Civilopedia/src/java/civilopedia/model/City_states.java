package civilopedia.model;

import java.util.Objects;

/*
 * @author Басков Марат
 */
public class City_states 
{
    private int ID;
    private String NAME;
    private String UNIQUE_ABILITY;
    private String HISTORICAL_CONTEXT;
    private String IMAGE;
    private String TYPE;
    

    public City_states() {
    }

    public City_states(int id, String name, String unique_ability, 
                         String historical_context,  String image, String type)
    {
        this.ID = id;
        this.NAME = name;
        this.UNIQUE_ABILITY = unique_ability;
        this.HISTORICAL_CONTEXT = historical_context;
        this.IMAGE = image;
        this.TYPE = type;
    }
 
    /* getters */
    public int getID() {
        return ID;
    }
    public String getNAME() {
        return NAME;
    }
   public String getUNIQUE_ABILITY() {
        return UNIQUE_ABILITY;
    }
   public String getHISTORICAL_CONTEXT() {
        return HISTORICAL_CONTEXT;
    }   
   public String getIMAGE() {
        return IMAGE;
    }
   public String getTYPE() {
        return TYPE;
    }
   
    /* setters */
    public void setID(int id) {
        this.ID = id;
    }
    public void setNAME(String name) {
       this.NAME = name;
    }
   public void setUNIQUE_ABILITY(String unique_ability) {
        this.UNIQUE_ABILITY = unique_ability;
    }
   public void setHISTORICAL_CONTEXT(String historical_context) {
        this.HISTORICAL_CONTEXT = historical_context;
    }   
   public void setIMAGE(String image) {
        this.IMAGE = image;
    }
   public void setTYPE(String type) {
        this.TYPE = type;
    }

    /* Переопределение hashCode и equals toString */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 8 * hash + this.ID;
        hash = 8 * hash + Objects.hashCode(this.NAME);
        hash = 8 * hash + Objects.hashCode(this.UNIQUE_ABILITY);
        hash = 8 * hash + Objects.hashCode(this.HISTORICAL_CONTEXT);
        hash = 8 * hash + Objects.hashCode(this.IMAGE);
        hash = 8 * hash + Objects.hashCode(this.TYPE);
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
        final City_states other = (City_states) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (!Objects.equals(this.NAME, other.NAME)) {
            return false;
        }
        if (!Objects.equals(this.UNIQUE_ABILITY, other.UNIQUE_ABILITY)) {
            return false;
        }
        if (!Objects.equals(this.HISTORICAL_CONTEXT, other.HISTORICAL_CONTEXT)) {
            return false;
        }
        if (!Objects.equals(this.IMAGE, other.IMAGE)) {
            return false;
        }
        if (!Objects.equals(this.TYPE, other.TYPE)) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "City_states{" + "ID= " + ID + ", NAME= " + NAME + ", UNIQUE_ABILITY= " + UNIQUE_ABILITY + 
                ", HISTORICAL_CONTEXT= " + HISTORICAL_CONTEXT +", IMAGE= " + IMAGE +", TYPE= " + TYPE +"}";
    }
}
