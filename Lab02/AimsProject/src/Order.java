class Order {

	public static final int MAX_NUMBERS_ORDERED=10;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
     
	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		while(this.itemsOrdered[this.qtyOrdered]==null && this.qtyOrdered<=this.MAX_NUMBERS_ORDERED){
			itemsOrdered[this.qtyOrdered]= disc;
			this.qtyOrdered++;
			break;
		}

		if(this.qtyOrdered>this.MAX_NUMBERS_ORDERED){
			System.out.println("You have reached max disc can be ordered");
		}else{
			int total = this.MAX_NUMBERS_ORDERED-this.qtyOrdered;
			System.out.println("The disc has been added");
			System.out.println("You have more "+ total+" discs to order");
		}
		
	}
	
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i=0; i<this.itemsOrdered.length; i++){
			if(disc.getTitle().equals(itemsOrdered[i].getTitle())){
				itemsOrdered[i]=null;
				this.qtyOrdered--;
				int total = this.MAX_NUMBERS_ORDERED-this.qtyOrdered;
				System.out.println("The disc with title "+disc.getTitle()+" has been deleted");
				System.out.println("You have more "+total+" discs to order again");
				break;
			}
		}
	}
	public float totalCost() {
		float total = 0;
		for(int i=0; i<itemsOrdered.length; i++) {
			if(itemsOrdered[i]!=null){
				total+=itemsOrdered[i].getCost();
			}
		}
		return total;
	}
}