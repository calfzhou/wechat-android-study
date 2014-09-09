package com.tencent.mm.ui.account;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.c.a.c;
import com.tencent.mm.ui.c.a.h;
import com.tencent.mm.ui.c.a.m;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import org.json.JSONObject;

final class eh
  implements c
{
  eh(ef paramef)
  {
  }

  public final void BA(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!44@/B4Tb64lLpLASVHfQRzXfIKtwR0LMq/9o2AZ+OSS5lE=", "response is null or nil");
      ef.a(this.iQd, 1, "response is null or nil");
      return;
    }
    if ((paramString.contains("access_token")) && (paramString.length() > 12))
      try
      {
        Bundle localBundle = m.CY(paramString);
        if (localBundle.containsKey("access_token"))
        {
          ef.a(this.iQd, localBundle);
          return;
        }
      }
      catch (Exception localException2)
      {
        ef.a(this.iQd, 2, "decodeUrl fail");
        return;
      }
    JSONObject localJSONObject1;
    do
    {
      try
      {
        if (paramString.equals("false"))
          throw new h("request failed");
      }
      catch (Exception localException1)
      {
        z.e("!44@/B4Tb64lLpLASVHfQRzXfIKtwR0LMq/9o2AZ+OSS5lE=", "parseJson exception : " + localException1.getMessage());
        ef.a(this.iQd, 2, "parseJson error");
        return;
        if (paramString.equals("true"))
          paramString = "{value : true}";
        localJSONObject1 = new JSONObject(paramString);
        if (localJSONObject1.has("error"))
        {
          JSONObject localJSONObject2 = localJSONObject1.getJSONObject("error");
          throw new h(localJSONObject2.getString("message"), localJSONObject2.getString("type"), 0);
        }
      }
      catch (h localh)
      {
        String str = "errCode = " + localh.getErrorCode() + ", errType = " + localh.aYC() + ", errMsg = " + localh.getMessage();
        z.e("!44@/B4Tb64lLpLASVHfQRzXfIKtwR0LMq/9o2AZ+OSS5lE=", "parseJson facebookerror, " + str);
        ef.a(this.iQd, 3, str);
        return;
      }
      if ((localJSONObject1.has("error_code")) && (localJSONObject1.has("error_msg")))
        throw new h(localJSONObject1.getString("error_msg"), "", Integer.parseInt(localJSONObject1.getString("error_code")));
      if (localJSONObject1.has("error_code"))
        throw new h("request failed", "", Integer.parseInt(localJSONObject1.getString("error_code")));
      if (localJSONObject1.has("error_msg"))
        throw new h(localJSONObject1.getString("error_msg"));
    }
    while (!localJSONObject1.has("error_reason"));
    throw new h(localJSONObject1.getString("error_reason"));
  }

  public final void a(FileNotFoundException paramFileNotFoundException)
  {
    z.e("!44@/B4Tb64lLpLASVHfQRzXfIKtwR0LMq/9o2AZ+OSS5lE=", "onFileNotFoundException");
    ef.a(this.iQd, 2, paramFileNotFoundException.getMessage());
  }

  public final void a(IOException paramIOException)
  {
    z.e("!44@/B4Tb64lLpLASVHfQRzXfIKtwR0LMq/9o2AZ+OSS5lE=", "onIOException");
    ef.a(this.iQd, 2, paramIOException.getMessage());
  }

  public final void a(MalformedURLException paramMalformedURLException)
  {
    z.e("!44@/B4Tb64lLpLASVHfQRzXfIKtwR0LMq/9o2AZ+OSS5lE=", "onMalformedURLException");
    ef.a(this.iQd, 2, paramMalformedURLException.getMessage());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.eh
 * JD-Core Version:    0.6.2
 */