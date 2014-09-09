package com.tencent.mm.sandbox.monitor;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import java.io.PrintStream;
import java.util.Map;
import java.util.Timer;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;

final class b
  implements Runnable
{
  b(int paramInt, String paramString1, String paramString2, PByteArray paramPByteArray)
  {
  }

  public final void run()
  {
    SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences("system_config_prefs", 0);
    String str1 = "http://" + localSharedPreferences.getString("support.weixin.qq.com", "support.weixin.qq.com");
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(str1 + "/cgi-bin/mmsupport-bin/stackreport?version=");
    localStringBuffer.append(Integer.toHexString(a.hrn));
    localStringBuffer.append("&devicetype=");
    localStringBuffer.append(a.hrg);
    localStringBuffer.append("&filelength=");
    localStringBuffer.append(this.gRB);
    localStringBuffer.append("&sum=");
    localStringBuffer.append(this.gRC);
    localStringBuffer.append("&reporttype=");
    localStringBuffer.append(1);
    if ((this.dmX != null) && (!this.dmX.equals("")))
    {
      localStringBuffer.append("&username=");
      localStringBuffer.append(this.dmX);
    }
    z.d("!32@/B4Tb64lLpJJjWiGupgZbcuzfFJRKwOo", "dkcrash sb:" + localStringBuffer.toString());
    String str2 = localStringBuffer.toString();
    byte[] arrayOfByte = this.gRD.value;
    z.e("!32@/B4Tb64lLpJJjWiGupgZbcuzfFJRKwOo", "doPost : url = " + str2 + ", data.length = " + arrayOfByte.length);
    DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient();
    HttpPost localHttpPost = new HttpPost(str2);
    try
    {
      ByteArrayEntity localByteArrayEntity = new ByteArrayEntity(arrayOfByte);
      localByteArrayEntity.setContentType("binary/octet-stream");
      localHttpPost.setEntity(localByteArrayEntity);
      String str3 = ch.b(localDefaultHttpClient.execute(localHttpPost).getEntity().getContent());
      if ((str3 != null) && (str3.length() > 0))
      {
        Map localMap = x.bB(str3, "Response");
        if (("-1000".equalsIgnoreCase((String)localMap.get(".Response.retCode"))) && (localMap.get(".Response.url") != null))
          new Timer().schedule(new c(localMap), 500L);
      }
      System.out.println(str3);
      return;
    }
    catch (Exception localException)
    {
    }
    catch (IllegalStateException localIllegalStateException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.monitor.b
 * JD-Core Version:    0.6.2
 */