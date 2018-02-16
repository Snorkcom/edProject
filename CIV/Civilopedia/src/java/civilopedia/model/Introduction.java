package civilopedia.model;

import java.util.Objects;

/*
 * @author Валерия Чайкина
 */
public class Introduction
{
    private int ID;
    private String INTR_NAME;
    private String INTR_TEXT;
    

    public Introduction() {
    }

    public Introduction(int id, String intr_name, String intr_text)
    {
        this.ID = id;
        this.INTR_NAME = intr_name;
        this.INTR_TEXT = intr_text;        
    }
 
    /* getters */
    public int getID() {
        return ID;
    }
    public String getINTR_NAME() {
        return INTR_NAME;
    }
   public String getINTR_TEXT() {
        return INTR_TEXT;
    }
      
    /* setters */
    public void setID(int id) {
        this.ID = id;
    }
    public void setINTR_NAME(String intr_name) {
       this.INTR_NAME = intr_name;
    }
   public void setINTR_TEXT(String intr_text) {
       this.INTR_TEXT = intr_text;
    }

    /* Переопределение hashCode и equals toString */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 8 * hash + this.ID;
        hash = 8 * hash + Objects.hashCode(this.INTR_NAME);
        hash = 8 * hash + Objects.hashCode(this.INTR_TEXT);      
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
        final Introduction other = (Introduction) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (!Objects.equals(this.INTR_NAME, other.INTR_NAME)) {
            return false;
        }
        if (!Objects.equals(this.INTR_TEXT, other.INTR_TEXT)) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "Introduction{" + " ID= " + ID + ", INTR_NAME= " + INTR_NAME + ", INTR_TEXT= " + INTR_TEXT+"}";
    }
}
