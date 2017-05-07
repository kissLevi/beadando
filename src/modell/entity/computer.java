package modell.entity;

import java.io.Serializable;

public class computer implements Serializable{

	private final int id;
	private final operationSystem operationSystem;
	private String information;
	private boolean availability;
        
        //épitő minta
        public static class builder{
            private final int id;
            private final operationSystem operationSystem;
            private String information = "";
            private boolean availability = true;
            
            public builder(int id,operationSystem os){
                this.id = id;
                this.operationSystem = os;
            } 
            
            public builder information(String val){
                information = val;
                return this;
            }
            public builder availability(boolean val){
                availability = val;
                return this;
            }
            public computer bulid(){
                return new computer(this);
            }
        }
          
	public computer(builder builder){
		id = builder.id;
                operationSystem = builder.operationSystem;
                information = builder.information;
                availability = builder.availability;
	}

	public int getId() {
		return this.id;
	}

	public String getInformation() {
		return this.information;
	}
        
        public boolean getAvailability() {
		return this.availability;
	}

	public void setInformation(String information) {
		this.information = information;
	}


        public void setAvailability(boolean availability) {
		this.availability = availability;
	}
        
        @Override 
        public boolean equals(Object o){
            if(o == this){
                return true;
            }
            if(!(o instanceof computer)){
                return false;
            }
            computer other = (computer)o;
            return other.id == this.id && other.operationSystem == this.operationSystem && other.information.equals(this.operationSystem);
        }
        @Override 
        public int hashCode(){
            return this.id;
        }
        @Override 
        public String toString(){
            String st ="";
            st += Integer.toString(this.id) + this.operationSystem + this.availability + this.information ;
            
            return st;
        }

}