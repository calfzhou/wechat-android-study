package com.tencent.mm.q;

import com.tencent.mm.sdk.platformtools.z;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  public int dqk;

  public static f fu(String paramString)
  {
    z.d("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "HardwareBizInfo = " + paramString);
    f localf = new f();
    if ((paramString == null) || (paramString.length() <= 0))
      return localf;
    try
    {
      localf.dqk = new JSONObject(paramString).getInt("hardware_flag");
      return localf;
    }
    catch (JSONException localJSONException)
    {
    }
    return localf;
  }

  public final boolean uE()
  {
    return (0x1 & this.dqk) > 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.f
 * JD-Core Version:    0.6.2
 */