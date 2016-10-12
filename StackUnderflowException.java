/**
   Mohammed Raza
   CSC 236 - Lab4 #2 (class3)
*/

public class StackUnderflowException extends StackException
{
	public StackUnderflowException()
	{
		super("Stack Underflow");
	}

	public StackUnderflowException(String msg)
	{
		super(msg);
	}
}