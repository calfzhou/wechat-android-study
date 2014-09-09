package com.tencent.mm.platformtools;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mm.a.c;
import com.tencent.mm.a.f;
import com.tencent.mm.a.m;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.io.FileInputStream;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public final class am
{
  public static boolean Z(String paramString1, String paramString2)
  {
    return a(c.b(paramString1, 0, -1), paramString1, paramString2, 20002);
  }

  private static boolean a(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    if (128000 < paramInt2 + 4)
      return false;
    paramArrayOfByte[paramInt2] = ((byte)(0xFF & paramInt1 >> 24));
    paramArrayOfByte[(paramInt2 + 1)] = ((byte)(0xFF & paramInt1 >> 16));
    paramArrayOfByte[(paramInt2 + 2)] = ((byte)(0xFF & paramInt1 >> 8));
    paramArrayOfByte[(paramInt2 + 3)] = ((byte)(paramInt1 & 0xFF));
    return true;
  }

  private static boolean a(String paramString1, String paramString2, boolean paramBoolean, int paramInt)
  {
    if ((ch.jb(paramString1)) || (ch.jb(paramString2)))
    {
      z.e("!44@/B4Tb64lLpK6yOMee/eotB6K2Auynr4VmZLtkzi/1aw=", "uploadFile param err file:%s  user:%s", new Object[] { paramString1, paramString2 });
      return false;
    }
    int i = c.ab(paramString1);
    if (i <= 0)
    {
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = paramString1;
      arrayOfObject3[1] = Integer.valueOf(i);
      z.e("!44@/B4Tb64lLpK6yOMee/eotB6K2Auynr4VmZLtkzi/1aw=", "uploadFile err len file:%s len:%d", arrayOfObject3);
      return false;
    }
    if (i <= 128000)
    {
      byte[] arrayOfByte3 = c.b(paramString1, 0, -1);
      boolean bool2 = a(arrayOfByte3, paramString1, paramString2, paramInt);
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Boolean.valueOf(bool2);
      if (arrayOfByte3 != null);
      for (int i1 = arrayOfByte3.length; ; i1 = -1)
      {
        arrayOfObject2[1] = Integer.valueOf(i1);
        arrayOfObject2[2] = paramString1;
        z.d("!44@/B4Tb64lLpK6yOMee/eotB6K2Auynr4VmZLtkzi/1aw=", "uploadFile ret:%b size:%d file:%s", arrayOfObject2);
        if ((bool2) && (paramBoolean))
          c.a(new File(paramString1));
        return bool2;
      }
    }
    int j = 1 + i / 127988;
    byte[] arrayOfByte1 = new byte[128000];
    int k = (int)ch.CM();
    try
    {
      FileInputStream localFileInputStream = new FileInputStream(paramString1);
      int m = 0;
      if (m < j)
      {
        int n = localFileInputStream.read(arrayOfByte1, 12, 127988);
        if (n < 0)
        {
          z.e("!44@/B4Tb64lLpK6yOMee/eotB6K2Auynr4VmZLtkzi/1aw=", "uploadFile read failed file:%s", new Object[] { paramString1 });
          localFileInputStream.close();
          return false;
        }
        a(k, arrayOfByte1, 0);
        a(m, arrayOfByte1, 4);
        a(n, arrayOfByte1, 8);
        byte[] arrayOfByte2;
        if (n < 127988)
        {
          arrayOfByte2 = new byte[n + 12];
          System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte2.length);
        }
        for (boolean bool1 = a(arrayOfByte2, paramString1, paramString2, paramInt); ; bool1 = a(arrayOfByte1, paramString1, paramString2, paramInt))
        {
          Object[] arrayOfObject1 = new Object[6];
          arrayOfObject1[0] = Integer.valueOf(m);
          arrayOfObject1[1] = Integer.valueOf(j);
          arrayOfObject1[2] = Integer.valueOf(n);
          arrayOfObject1[3] = Boolean.valueOf(bool1);
          arrayOfObject1[4] = Integer.valueOf(i);
          arrayOfObject1[5] = paramString1;
          z.d("!44@/B4Tb64lLpK6yOMee/eotB6K2Auynr4VmZLtkzi/1aw=", "uploadFile idx:%d(%d) read:%d ret:%b size:%d file:%s", arrayOfObject1);
          m++;
          break;
        }
      }
      localFileInputStream.close();
      if (paramBoolean)
        c.a(new File(paramString1));
      return true;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpK6yOMee/eotB6K2Auynr4VmZLtkzi/1aw=", "uploadFile read except file:%s", new Object[] { paramString1 });
    }
    return false;
  }

  public static boolean a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    if (paramBoolean2)
    {
      Thread localThread = new Thread(new an(paramString1, paramString2, paramBoolean1, paramInt2), "!44@/B4Tb64lLpK6yOMee/eotB6K2Auynr4VmZLtkzi/1aw=");
      localThread.setPriority(paramInt1);
      localThread.start();
      return true;
    }
    return a(paramString1, paramString2, paramBoolean1, paramInt2);
  }

  private static boolean a(byte[] paramArrayOfByte, String paramString1, String paramString2, int paramInt)
  {
    if (ch.B(paramArrayOfByte))
    {
      z.e("!44@/B4Tb64lLpK6yOMee/eotB6K2Auynr4VmZLtkzi/1aw=", "read file failed:%s", new Object[] { paramString1 });
      return false;
    }
    if (paramArrayOfByte.length > 128000)
    {
      Object[] arrayOfObject4 = new Object[2];
      arrayOfObject4[0] = paramString1;
      arrayOfObject4[1] = Integer.valueOf(paramArrayOfByte.length);
      z.e("!44@/B4Tb64lLpK6yOMee/eotB6K2Auynr4VmZLtkzi/1aw=", "file :%s data len error:%d", arrayOfObject4);
      return false;
    }
    int i = paramArrayOfByte.length;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(com.tencent.mm.protocal.a.hrn);
    arrayOfObject1[1] = Integer.valueOf(i);
    String str1 = f.d(String.format("weixin#$()%d%d", arrayOfObject1).getBytes()).toLowerCase();
    byte[] arrayOfByte1 = m.f(paramArrayOfByte);
    if (ch.B(arrayOfByte1))
    {
      z.e("!44@/B4Tb64lLpK6yOMee/eotB6K2Auynr4VmZLtkzi/1aw=", "zip data failed file:%s", new Object[] { paramString1 });
      return false;
    }
    PByteArray localPByteArray = new PByteArray();
    com.tencent.mm.a.a.a(localPByteArray, arrayOfByte1, str1.getBytes());
    byte[] arrayOfByte2 = localPByteArray.value;
    if (ch.B(arrayOfByte2))
      z.e("!44@/B4Tb64lLpK6yOMee/eotB6K2Auynr4VmZLtkzi/1aw=", "encrypt data failed file:%s", new Object[] { paramString1 });
    SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences("system_config_prefs", 0);
    String str2 = "http://" + localSharedPreferences.getString("support.weixin.qq.com", "support.weixin.qq.com");
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(str2 + "/cgi-bin/mmsupport-bin/stackreport?version=");
    localStringBuffer.append(Integer.toHexString(com.tencent.mm.protocal.a.hrn));
    localStringBuffer.append("&devicetype=");
    localStringBuffer.append(com.tencent.mm.protocal.a.hrg);
    localStringBuffer.append("&filelength=");
    localStringBuffer.append(i);
    localStringBuffer.append("&sum=");
    localStringBuffer.append(str1);
    localStringBuffer.append("&reporttype=");
    localStringBuffer.append(paramInt);
    localStringBuffer.append("&reportvalue=");
    localStringBuffer.append(ch.CM() + ".0.1");
    if ((paramString2 != null) && (!paramString2.equals("")))
    {
      localStringBuffer.append("&username=");
      localStringBuffer.append(paramString2);
    }
    DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient();
    HttpPost localHttpPost = new HttpPost(localStringBuffer.toString());
    HttpResponse localHttpResponse;
    try
    {
      ByteArrayEntity localByteArrayEntity = new ByteArrayEntity(arrayOfByte2);
      localByteArrayEntity.setContentType("binary/octet-stream");
      localHttpPost.setEntity(localByteArrayEntity);
      localHttpResponse = localDefaultHttpClient.execute(localHttpPost);
      if ((localHttpResponse == null) || (localHttpResponse.getStatusLine() == null))
      {
        z.e("!44@/B4Tb64lLpK6yOMee/eotB6K2Auynr4VmZLtkzi/1aw=", "execute http failed resp null");
        return false;
      }
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localException.getMessage();
      z.d("!44@/B4Tb64lLpK6yOMee/eotB6K2Auynr4VmZLtkzi/1aw=", "execute post failed msg:%s", arrayOfObject2);
      return false;
    }
    if (localHttpResponse.getStatusLine().getStatusCode() != 200)
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(localHttpResponse.getStatusLine().getStatusCode());
      z.e("!44@/B4Tb64lLpK6yOMee/eotB6K2Auynr4VmZLtkzi/1aw=", "error response code:%d ", arrayOfObject3);
      return false;
    }
    return true;
  }

  public static boolean c(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    return a(paramString1, paramString2, paramBoolean1, paramBoolean2, 1, 20003);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.am
 * JD-Core Version:    0.6.2
 */