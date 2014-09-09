package c.a.d;

import c.a.b.a;
import c.a.b.b;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class f
{
  private HttpURLConnection dTS;
  private j kma;
  private e kmb;
  private e kmc;
  private Map kmd;
  private String kme = null;
  private String kmf;
  private byte[] kmg = null;
  private boolean kmh = false;
  private Long kmi = null;
  private Long kmj = null;
  private String url;

  public f(j paramj, String paramString)
  {
    this.kma = paramj;
    this.url = paramString;
    this.kmb = new e();
    this.kmc = new e();
    this.kmd = new HashMap();
  }

  private byte[] bfO()
  {
    if (this.kmg != null)
      return this.kmg;
    String str;
    if (this.kme != null)
      str = this.kme;
    try
    {
      while (true)
      {
        byte[] arrayOfByte = str.getBytes(bfH());
        return arrayOfByte;
        str = this.kmc.bfM();
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new b("Unsupported Charset: " + bfH(), localUnsupportedEncodingException);
    }
  }

  private void c(HttpURLConnection paramHttpURLConnection)
  {
    Iterator localIterator = this.kmd.keySet().iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return;
      String str = (String)localIterator.next();
      paramHttpURLConnection.setRequestProperty(str, (String)this.kmd.get(str));
    }
  }

  public void addHeader(String paramString1, String paramString2)
  {
    this.kmd.put(paramString1, paramString2);
  }

  public void bV(String paramString1, String paramString2)
  {
    this.kmb.bW(paramString1, paramString2);
  }

  public e bfE()
  {
    try
    {
      e locale = new e();
      locale.DY(new URL(this.url).getQuery());
      locale.a(this.kmb);
      return locale;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      throw new b("Malformed URL", localMalformedURLException);
    }
  }

  public j bfF()
  {
    return this.kma;
  }

  public String bfG()
  {
    return this.kmb.DX(this.url);
  }

  public String bfH()
  {
    if (this.kmf == null)
      return Charset.defaultCharset().name();
    return this.kmf;
  }

  public g bfI()
  {
    try
    {
      String str1 = bfG();
      if (this.dTS == null)
        if (!this.kmh)
          break label205;
      label205: for (String str2 = "true"; ; str2 = "false")
      {
        System.setProperty("http.keepAlive", str2);
        this.dTS = ((HttpURLConnection)new URL(str1).openConnection());
        this.dTS.setRequestMethod(this.kma.name());
        if (this.kmi != null)
          this.dTS.setConnectTimeout(this.kmi.intValue());
        if (this.kmj != null)
          this.dTS.setReadTimeout(this.kmj.intValue());
        c(this.dTS);
        if ((this.kma.equals(j.kms)) || (this.kma.equals(j.kmr)))
        {
          HttpURLConnection localHttpURLConnection = this.dTS;
          byte[] arrayOfByte = bfO();
          localHttpURLConnection.setRequestProperty("Content-Length", String.valueOf(arrayOfByte.length));
          if (localHttpURLConnection.getRequestProperty("Content-Type") == null)
            localHttpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
          localHttpURLConnection.setDoOutput(true);
          localHttpURLConnection.getOutputStream().write(arrayOfByte);
        }
        return new g(this.dTS);
      }
    }
    catch (Exception localException)
    {
      throw new a(localException);
    }
  }

  public e bfJ()
  {
    return this.kmc;
  }

  public String bfK()
  {
    return this.url.replaceAll("\\?.*", "").replace("\\:\\d{4}", "");
  }

  public String getUrl()
  {
    return this.url;
  }

  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = bfF();
    arrayOfObject[1] = getUrl();
    return String.format("@Request(%s %s)", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     c.a.d.f
 * JD-Core Version:    0.6.2
 */