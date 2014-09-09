package com.tencent.mm.q;

import com.tencent.mm.sdk.platformtools.z;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class g
{
  public int dql;
  public List dqm = null;

  public static g fv(String paramString)
  {
    z.d("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "MenuInfo = " + paramString);
    g localg = new g();
    if ((paramString == null) || (paramString.length() <= 0))
      return localg;
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      localg.dql = localJSONObject.getInt("update_time");
      localg.dqm = h.b(localJSONObject.optJSONArray("button_list"));
      return localg;
    }
    catch (JSONException localJSONException)
    {
    }
    return localg;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.g
 * JD-Core Version:    0.6.2
 */