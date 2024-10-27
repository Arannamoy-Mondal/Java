// package pc;

public class PC {
     
	public String serialNo;
	public double HDSize,RAM,VRam;
	public boolean hasGpu,isReserved;
	public String reservedBy;
	
	public PC(String serialNo,double HDSize,double RAM,double VRam ,boolean hasGpu)
	{
		this.serialNo=serialNo;
		this.HDSize=HDSize;
		this.RAM=RAM;
		this.VRam=VRam;
		this.hasGpu=hasGpu;
		isReserved=false;
		reservedBy="";
	}
	
	public String getSerialNo() {
		return serialNo;
	}
	public double getHDSize() {
		return HDSize;
	}
	public double getRAM() {
		return RAM;
	}
	public double getVRam() {
		return VRam;
	}
	public boolean gethasGpu() {
		return hasGpu;
	}
	public boolean getisReserved() {
		return isReserved;
	}
	public String getReservedBy() {
		return reservedBy;
	}
	public void resevePc(String reservedBy) {
		this.isReserved=true;
		this.reservedBy=reservedBy;
	}
	public void releasePC() {
        this.isReserved = false;
        this.reservedBy = "";
    }
	 public String toString() {
	        String details = "PC [Serial No: " + serialNo + ", HD: " + HDSize + " GB, RAM: " + RAM + " GB";
	        if (hasGpu) {
	            details += ", GPU: Yes, VRAM: " + VRam + " GB";
	        } else {
	            details += ", GPU: No";
	        }
	        details += ", Status: " + (isReserved ? "Reserved by " + reservedBy : "Available") + "]";
	        return details;
	    }
}

