// package pc;

import java.util.*;

public class PCMAN {

	Vector<PC> PcList;

	public PCMAN() {
		PcList = new Vector<PC>();
	}

	public PC FindSerialNo(String serialNo) {
		for (PC p : PcList) {
			if (p.getSerialNo().equals(serialNo)) {
				return p;
			}
		}
		return null;
	}

	public void Addpc(PC p) {
		PcList.add(p);
	}

	public void ReservedPc(String serialNo, String reservedBy) {
		PC p = FindSerialNo(serialNo);
		if (p != null) {
			if (!p.getisReserved()) {
                 p.resevePc(reservedBy);
			}
			else
			{
				System.out.println("already reversed");
			}
		}
		else
		{
			System.out.println("not found");
		}
	}
	
	public void Specific(String serialNo)
	{
		PC p = FindSerialNo(serialNo);
		if(p!=null)
		{
			System.out.println(p.toString());
		}
		else
		{
			System.out.println("not");
		}
	}
	
	public void ALL() {
		for(PC p : PcList) {
			System.out.println(p.toString());
		}
	}
	public void AvailablePC(String serialNo) {
		PC p = FindSerialNo(serialNo);
		if (p != null) {
			if (p.getisReserved()) {
                 p.releasePC();
			}
			else
			{
				System.out.println("not reserved");
			}
		}
		else
		{
			System.out.println("not found");
		}
	}
}
