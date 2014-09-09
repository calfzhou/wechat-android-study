package com.tencent.mm.q;

import com.tencent.mm.sdk.platformtools.ch;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class k
{
  public int dqA;
  public String dqB;
  public List dqC;
  public String dqD;

  public static k fy(String paramString)
  {
    if (ch.jb(paramString))
      return null;
    try
    {
      k localk = new k();
      JSONObject localJSONObject = new JSONObject(paramString);
      localk.dqA = localJSONObject.optInt("reputation_level", -1);
      localk.dqB = localJSONObject.optString("scope_of_business");
      localk.dqD = localJSONObject.optString("guarantee_detail_h5_url");
      JSONArray localJSONArray = localJSONObject.optJSONArray("guarantee_info");
      if (localJSONArray != null)
      {
        int i = localJSONArray.length();
        if (i > 0)
        {
          localk.dqC = new ArrayList();
          for (int j = 0; j < i; j++)
          {
            String str = localJSONArray.getString(j);
            if (!ch.jb(str))
              localk.dqC.add(str);
          }
        }
      }
      return localk;
    }
    catch (Exception localException)
    {
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.k
 * JD-Core Version:    0.6.2
 */