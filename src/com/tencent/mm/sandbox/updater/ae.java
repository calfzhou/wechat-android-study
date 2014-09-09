package com.tencent.mm.sandbox.updater;

import android.os.AsyncTask;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.sandbox.c;
import com.tencent.mm.sdk.platformtools.z;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;

final class ae extends AsyncTask
{
  private HttpClient fDJ = null;
  private c iBJ;
  private int iBX;
  private HttpPost iBY = null;
  private HttpResponse iBZ = null;
  private OutputStream iCa = new af(this);
  private int size;

  public ae(aa paramaa, int paramInt1, int paramInt2, c paramc)
  {
    this.size = paramInt1;
    this.iBX = paramInt2;
    this.iBJ = paramc;
  }

  private Integer B(String[] paramArrayOfString)
  {
    String str = paramArrayOfString[0];
    Object localObject1;
    if ((str == null) || (str.length() == 0))
      localObject1 = Integer.valueOf(-1);
    while (true)
    {
      return localObject1;
      z.i("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "current download url=" + str + ", range=" + this.iBX);
      this.fDJ = new DefaultHttpClient();
      this.fDJ.getParams().setIntParameter("http.connection.timeout", 15000);
      this.iBY = new HttpPost(str);
      HttpPost localHttpPost = this.iBY;
      StringBuilder localStringBuilder = new StringBuilder("bytes=").append(this.iBX).append("-");
      Object localObject2;
      if (this.size - this.iBX > 1048576)
      {
        localObject2 = Integer.valueOf(-1 + (1048576 + this.iBX));
        label155: localHttpPost.addHeader("RANGE", localObject2);
      }
      try
      {
        this.iBJ.cM(50L);
        this.iBZ = this.fDJ.execute(this.iBY);
        int i = this.iBZ.getStatusLine().getStatusCode();
        if ((i != 200) && (i != 206))
        {
          z.e("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "HttpClient return code:" + i);
          if (i == 416)
          {
            Integer localInteger4 = Integer.valueOf(-2);
            localObject1 = localInteger4;
            return localObject1;
            localObject2 = "";
            break label155;
          }
          Integer localInteger5 = Integer.valueOf(-1);
          localObject1 = localInteger5;
          return localObject1;
        }
        if ((aa.g(this.iBV)) && (ao.dVN) && (Math.random() > 0.2D))
        {
          z.d("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "simulateNetworkFault");
          Integer localInteger3 = Integer.valueOf(-1);
          localObject1 = localInteger3;
          return localObject1;
        }
        Header[] arrayOfHeader = this.iBZ.getHeaders("Content-Length");
        if (arrayOfHeader.length > 0)
          Integer.parseInt(arrayOfHeader[0].getValue());
        if (this.iBX > this.size)
        {
          z.e("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "range out of size");
          Integer localInteger2 = Integer.valueOf(-2);
          localObject1 = localInteger2;
          return localObject1;
        }
        HttpEntity localHttpEntity = this.iBZ.getEntity();
        localHttpEntity.writeTo(this.iCa);
        localHttpEntity.consumeContent();
        Integer localInteger1 = Integer.valueOf(0);
        localObject1 = localInteger1;
        return localObject1;
      }
      catch (Exception localException)
      {
        z.printErrStackTrace("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", localException, "exception current in download pack", new Object[0]);
        return Integer.valueOf(-1);
      }
      finally
      {
        if (this.fDJ != null)
          this.fDJ.getConnectionManager().shutdown();
      }
    }
  }

  protected final void onCancelled()
  {
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "AsyncTask had been canceled.");
    if (this.iBY != null)
      this.iBY.abort();
    if (this.fDJ != null)
    {
      z.d("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "connection shutdown.");
      this.fDJ.getConnectionManager().shutdown();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.ae
 * JD-Core Version:    0.6.2
 */