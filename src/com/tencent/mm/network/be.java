package com.tencent.mm.network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class be
{
  private HttpURLConnection dTS;
  private Map dTT = null;
  private int dTh;
  private URL url;

  public be(URL paramURL, int paramInt)
  {
    this.url = paramURL;
    this.dTh = paramInt;
    this.dTS = ((HttpURLConnection)this.url.openConnection());
    if (1 == this.dTh)
      this.dTS.setInstanceFollowRedirects(false);
  }

  public final void De()
  {
    this.dTS.setDoInput(true);
  }

  public final void Df()
  {
    this.dTS.setDoOutput(true);
  }

  public final void connect()
  {
    if ((1 == this.dTh) && (this.dTT == null))
      this.dTT = this.dTS.getRequestProperties();
    this.dTS.connect();
  }

  public final void disconnect()
  {
    this.dTS.disconnect();
  }

  public final String getHeaderField(String paramString)
  {
    if ((1 == this.dTh) && (this.dTT == null))
      this.dTT = this.dTS.getRequestProperties();
    return this.dTS.getHeaderField(paramString);
  }

  public final Map getHeaderFields()
  {
    if ((1 == this.dTh) && (this.dTT == null))
      this.dTT = this.dTS.getRequestProperties();
    return this.dTS.getHeaderFields();
  }

  public final InputStream getInputStream()
  {
    if (1 == this.dTh)
    {
      if (this.dTT == null)
        this.dTT = this.dTS.getRequestProperties();
      getResponseCode();
    }
    return this.dTS.getInputStream();
  }

  public final OutputStream getOutputStream()
  {
    if (1 == this.dTh)
    {
      if (this.dTT == null)
        this.dTT = this.dTS.getRequestProperties();
      getResponseCode();
    }
    return this.dTS.getOutputStream();
  }

  public final String getRequestProperty(String paramString)
  {
    return this.dTS.getRequestProperty(paramString);
  }

  public final int getResponseCode()
  {
    while (true)
    {
      if ((1 == this.dTh) && (this.dTT == null))
        this.dTT = this.dTS.getRequestProperties();
      int i = this.dTS.getResponseCode();
      String str1;
      if ((1 == this.dTh) && (302 == i))
      {
        str1 = this.dTS.getHeaderField("Location");
        if (str1 != null);
      }
      else
      {
        return i;
      }
      this.url = new URL(this.url, str1);
      this.dTS = ((HttpURLConnection)this.url.openConnection());
      this.dTS.setInstanceFollowRedirects(false);
      if (this.dTT != null)
      {
        Iterator localIterator = this.dTT.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str2 = (String)localIterator.next();
          if ((!str2.equals("Host")) && (!str2.equals("X-Online-Host")))
          {
            List localList = (List)this.dTT.get(str2);
            for (int j = 0; j < localList.size(); j++)
              this.dTS.setRequestProperty(str2, (String)localList.get(j));
          }
        }
      }
      this.dTS.setRequestProperty("Host", this.url.getHost());
      this.dTS.setRequestProperty("X-Online-Host", this.url.getHost());
    }
  }

  public final void setConnectTimeout(int paramInt)
  {
    this.dTS.setConnectTimeout(paramInt);
  }

  public final void setReadTimeout(int paramInt)
  {
    this.dTS.setReadTimeout(paramInt);
  }

  public final void setRequestMethod(String paramString)
  {
    this.dTS.setRequestMethod(paramString);
  }

  public final void setRequestProperty(String paramString1, String paramString2)
  {
    this.dTS.setRequestProperty(paramString1, paramString2);
  }

  public final void setUseCaches(boolean paramBoolean)
  {
    this.dTS.setUseCaches(paramBoolean);
  }

  public final String toString()
  {
    return this.dTS.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.be
 * JD-Core Version:    0.6.2
 */