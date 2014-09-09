package c.a.f;

import c.a.g.c;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class a
  implements b
{
  public final String B(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      c.a.g.d.bX(paramString1, "Base string cant be null or empty string");
      c.a.g.d.bX(paramString2, "Api secret cant be null or empty string");
      SecretKeySpec localSecretKeySpec = new SecretKeySpec((c.encode(paramString2) + '&' + c.encode(paramString3)).getBytes("UTF-8"), "HmacSHA1");
      Mac localMac = Mac.getInstance("HmacSHA1");
      localMac.init(localSecretKeySpec);
      String str = new String(c.a.g.a.dr(localMac.doFinal(paramString1.getBytes("UTF-8")))).replace("\r\n", "");
      return str;
    }
    catch (Exception localException)
    {
      throw new c.a.b.d(paramString1, localException);
    }
  }

  public final String bfS()
  {
    return "HMAC-SHA1";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     c.a.f.a
 * JD-Core Version:    0.6.2
 */