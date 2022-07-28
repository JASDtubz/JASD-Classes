package jasd.error;

import java.io.IOException;

public class WrongFileTypeException extends IOException
{
    public static final long serialVersionUID = 4294967296L;

    public WrongFileTypeException() { super(); }

    public WrongFileTypeException(String s) { super(s); }

    public WrongFileTypeException(String location, String reason)
    {
        super(location + (reason == null ? "" : " (" + reason + ")"));
    }
}
