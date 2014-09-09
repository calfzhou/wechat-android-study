package b.a.a.b.a;

import java.io.IOException;

public final class b extends IOException
{
  private b(String paramString)
  {
    super(paramString);
  }

  static b beE()
  {
    return new b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
  }

  static b beF()
  {
    return new b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }

  static b beG()
  {
    return new b("CodedInputStream encountered a malformed varint.");
  }

  static b beH()
  {
    return new b("Protocol message contained an invalid tag (zero).");
  }

  static b beI()
  {
    return new b("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     b.a.a.b.a.b
 * JD-Core Version:    0.6.2
 */