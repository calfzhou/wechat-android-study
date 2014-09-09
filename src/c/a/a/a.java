package c.a.a;

import c.a.d.h;
import c.a.g.d;
import java.io.OutputStream;

public final class a
{
  private String iDi;
  private String klP;
  private String klQ;
  private String klR = "oob";
  private c.a.a.a.a klS;
  private h klT = h.kmm;
  private OutputStream klU = null;

  private static c.a.a.a.a f(Class paramClass)
  {
    d.b(paramClass, "Api class cannot be null");
    try
    {
      c.a.a.a.a locala = (c.a.a.a.a)paramClass.newInstance();
      return locala;
    }
    catch (Exception localException)
    {
      throw new c.a.b.b("Error while creating the Api object", localException);
    }
  }

  public final a DT(String paramString)
  {
    d.b(paramString, "Callback can't be null");
    this.klR = paramString;
    return this;
  }

  public final a DU(String paramString)
  {
    d.bX(paramString, "Invalid Api key");
    this.klP = paramString;
    return this;
  }

  public final a DV(String paramString)
  {
    d.bX(paramString, "Invalid Api secret");
    this.klQ = paramString;
    return this;
  }

  public final c.a.e.b bfu()
  {
    d.b(this.klS, "You must specify a valid api through the provider() method");
    d.bX(this.klP, "You must provide an api key");
    d.bX(this.klQ, "You must provide an api secret");
    return this.klS.a(new c.a.d.a(this.klP, this.klQ, this.klR, this.klT, this.iDi, this.klU));
  }

  public final a e(Class paramClass)
  {
    this.klS = f(paramClass);
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     c.a.a.a
 * JD-Core Version:    0.6.2
 */