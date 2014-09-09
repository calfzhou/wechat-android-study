package com.tencent.mm.network;

import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public final class bf
{
  private HttpsURLConnection dTU = null;

  public bf(String paramString)
  {
    this(new URL(paramString));
  }

  private bf(URL paramURL)
  {
    try
    {
      this.dTU = ((HttpsURLConnection)paramURL.openConnection());
      return;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localMalformedURLException.getMessage();
      z.e("!44@/B4Tb64lLpItFYLAoHJ8bg0Xl+6QlhW5VHbm1Z2uYrw=", "MalformedURLException : %s", arrayOfObject2);
      return;
    }
    catch (IOException localIOException)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localIOException.getMessage();
      z.e("!44@/B4Tb64lLpItFYLAoHJ8bg0Xl+6QlhW5VHbm1Z2uYrw=", "IOException : %s", arrayOfObject1);
      return;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpItFYLAoHJ8bg0Xl+6QlhW5VHbm1Z2uYrw=", "Exception :" + localException.getMessage());
    }
  }

  public final void disconnect()
  {
    this.dTU.disconnect();
  }

  public final InputStream getInputStream()
  {
    return this.dTU.getInputStream();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.bf
 * JD-Core Version:    0.6.2
 */