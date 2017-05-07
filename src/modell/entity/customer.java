package modell.entity;

public class customer {

	private final String userName;
	private int points;
	private int balance;
	private boolean status;
	private String idNumberFromPassport;

        public static class builder{
            private final String userName;
            private int points;
            private int balance;
            private boolean status;
            private String idNumberFromPassport;
            
            public builder(String userName){
                this.userName = userName;
            } 
            
            public builder points(int val){
                points = val;
                return this;
            }
            public builder balance(int val){
                balance = val;
                return this;
            }
            public builder status(boolean val){
                status = val;
                return this;
            }
            public builder idNumberFromPassport(String val){
                idNumberFromPassport = val;
                return this;
            }
            public customer bulid(){
                return new customer(this);
            }
        }
          

	public customer(builder builder) {
                userName = builder.userName;
                points = builder.points;
                balance = builder.balance;
                status = builder.status;
                idNumberFromPassport = builder.idNumberFromPassport;
	}

	public String getUserName() {
		return this.userName;
	}

	public int getPoints() {
		return this.points;
	}

	public int getBalance() {
		return this.balance;
	}

	public boolean getStatus() {
		return this.status;
	}


	public void setBalance(int money) {
		this.balance += money;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setPoints(int points) {
		this.points += points;
	}

	public String idNumberFromPassport() {
		return this.idNumberFromPassport;
	}


	public void setId(String id) {
		this.idNumberFromPassport = id;
	}
        @Override
        public boolean equals(Object o){
            if(o == this){
                return true;
            }
            if(!(o instanceof computer)){
                return false;
            }
            customer other = (customer)o;
            return other.userName.equals(this.userName);
        }
        @Override
        public int hashCode(){
            return this.balance*this.points;
        }
        @Override
        public String toString(){
            String st = "";
            st += this.userName +" "+this.idNumberFromPassport +" "+this.balance+" "+this.points+" "+this.status;          
            return st;
        }
        

}