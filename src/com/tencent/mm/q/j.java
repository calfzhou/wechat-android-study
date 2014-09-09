package com.tencent.mm.q;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import org.json.JSONObject;

public final class j
{
  public int dqw = 0;
  public String dqx;
  public String dqy;
  public String dqz;

  public static j fx(String paramString)
  {
    if (ch.jb(paramString))
      return null;
    z.i("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "biz verify info is [%s]", new Object[] { paramString });
    j localj = new j();
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      localj.dqw = localJSONObject.getInt("Type");
      localj.dqx = localJSONObject.getString("Description");
      localj.dqy = localJSONObject.optString("Name");
      localj.dqz = localJSONObject.optString("IntroUrl");
      label81: Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = Integer.valueOf(localj.dqw);
      arrayOfObject[1] = localj.dqx;
      arrayOfObject[2] = localj.dqy;
      arrayOfObject[3] = localj.dqz;
      z.i("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "type[%d],desc[%s],name[%s],url[%s]", arrayOfObject);
      return localj;
    }
    catch (Exception localException)
    {
      break label81;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.j
 * JD-Core Version:    0.6.2
 */