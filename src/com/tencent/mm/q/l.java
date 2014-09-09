package com.tencent.mm.q;

import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class l
{
  public String description;
  public String dpL;
  public String dqE;

  public static List c(JSONArray paramJSONArray)
  {
    LinkedList localLinkedList = new LinkedList();
    if (paramJSONArray == null);
    while (true)
    {
      return localLinkedList;
      int i = 0;
      try
      {
        int j = paramJSONArray.length();
        while (i < j)
        {
          l locall = new l();
          JSONObject localJSONObject = paramJSONArray.optJSONObject(i);
          locall.dpL = localJSONObject.optString("icon");
          locall.description = localJSONObject.optString("description");
          locall.dqE = localJSONObject.optString("description_key");
          localLinkedList.add(locall);
          i++;
        }
      }
      catch (Exception localException)
      {
      }
    }
    return localLinkedList;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.l
 * JD-Core Version:    0.6.2
 */