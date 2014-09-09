package c.a.d;

import java.io.OutputStream;

public final class a
{
  private final String iDi;
  private final String klP;
  private final String klQ;
  private final String klR;
  private final h klT;
  private final OutputStream klU;

  public a(String paramString1, String paramString2, String paramString3, h paramh, String paramString4, OutputStream paramOutputStream)
  {
    this.klP = paramString1;
    this.klQ = paramString2;
    this.klR = paramString3;
    this.klT = paramh;
    this.iDi = paramString4;
    this.klU = paramOutputStream;
  }

  public final h bfA()
  {
    return this.klT;
  }

  public final String bfB()
  {
    return this.iDi;
  }

  public final boolean bfC()
  {
    return this.iDi != null;
  }

  public final String bfx()
  {
    return this.klP;
  }

  public final String bfy()
  {
    return this.klQ;
  }

  public final String bfz()
  {
    return this.klR;
  }

  public final void q(String paramString)
  {
    String str;
    if (this.klU != null)
      str = paramString + "\n";
    try
    {
      this.klU.write(str.getBytes("UTF8"));
      return;
    }
    catch (Exception localException)
    {
      throw new RuntimeException("there were problems while writting to the debug stream", localException);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     c.a.d.a
 * JD-Core Version:    0.6.2
 */