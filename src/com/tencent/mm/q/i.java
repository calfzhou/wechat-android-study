package com.tencent.mm.q;

import com.tencent.mm.sdk.platformtools.z;
import org.json.JSONException;
import org.json.JSONObject;

public final class i
{
  public String dqu;
  public String dqv;

  public static i fw(String paramString)
  {
    z.d("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "EnterpriseBizInfo = " + paramString);
    i locali = new i();
    if ((paramString == null) || (paramString.length() <= 0))
      return locali;
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      locali.dqu = localJSONObject.optString("belong");
      locali.dqv = localJSONObject.optString("freeze_wording");
      return locali;
    }
    catch (JSONException localJSONException)
    {
    }
    return locali;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.i
 * JD-Core Version:    0.6.2
 */