package com.xworkz.abstraction.app.printingMachine;

public class DeepikaPadukone extends HPPrinter{
	  private PrintingMachine printingMachine;

	    public DeepikaPadukone(PrintingMachine printingMachine) {
	        this.printingMachine = printingMachine;
	    }

	    public void print() {
	        if (printingMachine != null) {
	            printingMachine.printDocument();
	        } else {
	            System.out.println("Printing machine is null");
	        }
}
}
