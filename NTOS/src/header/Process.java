package header;

import java.io.IOException;
import java.io.PrintWriter;
// Make it better
//Class to represent a process.
class Process
{ 
	public static final int RUNNING = 0;
	public static final int WAIT    = 1;
	public static final int IDLE    = 2;

	private String[] args;       // The calling arguments.
	private long id;             // Process Id number (pid).
	private int  priority;       // Priority.
	private long startTime;      // Set the start time.
	private int  status;         // Process status.

	Class   className;           // Bytecode name of class.
	Program classInstance;       // Class instance that can be called.

	public Process next;         // Links for next and previous list entries.
	public Process previous;

	// Constructors and methods.
	public Process(String[] args, int priority, long id)  
			throws ClassNotFoundException, IOException
	{	this.args=args;
			//className=ByteCodeChange(args[0]);
	}
	public String run(PrintWriter out) throws InstantiationException, IllegalAccessException
	{
		return"";
	}
	public void setPriority(int priority)
	{

	}
	public long getId()
	{
		return 0;
	}
	public int getPriority()
	{
		return 0;
	}
	public String getName()
	{
		return "";
	}
	public String[] getArgs()
	{
		return null;
	}
	public long getRunTime() 
	{
		return 0;
	}
	public String getStatus() 
	{
		return "";
	}
	public String toString()
	{
		return "";
	}
}
