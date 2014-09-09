package com.tencent.mm.q;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h
{
  public static String dqn = "menu_click";
  public static String dqo = "menu_action_start";
  public static String dqp = "menu_action_success";
  public String content;
  public String dqq;
  public List dqr = null;
  public String dqs;
  public int dqt;
  public int id;
  public String name;
  public int type;
  public String value;

  public static List b(JSONArray paramJSONArray)
  {
    z.v("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "menuItem.jsonArray : " + paramJSONArray);
    if (paramJSONArray != null);
    try
    {
      ArrayList localArrayList = new ArrayList();
      int i = paramJSONArray.length();
      z.v("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "menuItem.jsonArray.length : " + i);
      int j = 0;
      while (j < i)
      {
        JSONObject localJSONObject = paramJSONArray.getJSONObject(j);
        h localh = new h();
        localh.id = localJSONObject.getInt("id");
        z.d("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "menuItem.id : " + localh.id);
        localh.type = localJSONObject.getInt("type");
        z.d("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "menuItem.type : " + localh.type);
        localh.name = localJSONObject.getString("name");
        z.d("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "menuItem.name : " + localh.name);
        localh.dqq = localJSONObject.getString("key");
        z.d("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "menuItem.key : " + localh.dqq);
        localh.value = localJSONObject.optString("value");
        z.d("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "menuItem.value : " + localh.value);
        localh.dqr = b(localJSONObject.optJSONArray("sub_button_list"));
        localh.dqt = localJSONObject.optInt("acttype");
        z.d("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "menuItem.acttype : " + localh.dqt);
        localArrayList.add(localh);
        j++;
        continue;
        localArrayList = null;
      }
      return localArrayList;
    }
    catch (JSONException localJSONException)
    {
    }
    return null;
  }

  public static LinkedList d(Map paramMap)
  {
    int i = 0;
    if (paramMap == null)
      return null;
    int j = ch.getInt((String)paramMap.get(".msg.appmsg.buttonlist.$count"), 0);
    if (j > 0)
      try
      {
        LinkedList localLinkedList = new LinkedList();
        z.v("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "menuItem.jsonArray.length : " + j);
        if (i < j)
        {
          h localh = new h();
          StringBuilder localStringBuilder = new StringBuilder(".msg.appmsg.buttonlist.button");
          if (i == 0);
          String str1;
          for (Object localObject = ""; ; localObject = str1)
          {
            String str2 = (String)localObject;
            localh.id = ch.getInt((String)paramMap.get(str2 + ".id"), 0);
            localh.type = ch.getInt((String)paramMap.get(str2 + ".type"), 0);
            localh.name = ((String)paramMap.get(str2 + ".name"));
            localh.dqq = ((String)paramMap.get(str2 + ".key"));
            localh.value = ((String)paramMap.get(str2 + ".value"));
            localh.dqt = ch.getInt((String)paramMap.get(str2 + ".acttype"), 0);
            localLinkedList.add(localh);
            i++;
            break;
            str1 = String.valueOf(i);
          }
        }
        return localLinkedList;
      }
      catch (Exception localException)
      {
        return null;
      }
    return null;
  }

  public final void d(ArrayList paramArrayList)
  {
    if (paramArrayList.size() == 0)
    {
      z.e("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "value null!");
      return;
    }
    JSONArray localJSONArray;
    try
    {
      localJSONArray = new JSONArray();
      Iterator localIterator = paramArrayList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        JSONObject localJSONObject2 = new JSONObject();
        localJSONObject2.put("pic_md5", str);
        localJSONArray.put(localJSONObject2);
      }
    }
    catch (JSONException localJSONException)
    {
      z.e("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", localJSONException.toString());
      return;
    }
    JSONObject localJSONObject1 = new JSONObject();
    localJSONObject1.put("pics", localJSONArray);
    this.content = localJSONObject1.toString();
    z.v("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", this.content);
  }

  public final String getInfo()
  {
    if (this.content == null)
      this.content = "";
    if (this.dqs == null)
      if (this.type != 4)
        break label83;
    label83: for (this.dqs = dqo; ; this.dqs = dqn)
    {
      Object[] arrayOfObject = new Object[5];
      arrayOfObject[0] = "#bizmenu#";
      arrayOfObject[1] = Integer.valueOf(this.id);
      arrayOfObject[2] = this.dqq;
      arrayOfObject[3] = this.dqs;
      arrayOfObject[4] = this.content;
      return String.format("%s<info><id><![CDATA[%d]]></id><key><![CDATA[%s]]></key><status><![CDATA[%s]]></status><content><![CDATA[%s]]></content></info>", arrayOfObject);
    }
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = Integer.valueOf(this.id);
    arrayOfObject[1] = Integer.valueOf(this.dqt);
    arrayOfObject[2] = Integer.valueOf(this.type);
    String str1;
    String str2;
    label60: String str3;
    if (this.name == null)
    {
      str1 = "";
      arrayOfObject[3] = str1;
      if (this.dqq != null)
        break label112;
      str2 = "";
      arrayOfObject[4] = str2;
      if (this.value != null)
        break label120;
      str3 = "";
      label75: arrayOfObject[5] = str3;
      if (this.content != null)
        break label129;
    }
    label129: for (String str4 = ""; ; str4 = this.content)
    {
      arrayOfObject[6] = str4;
      return String.format("id:%d, type:%d, acttype:%s, name:%s, key:%s, value:%s, content:%s", arrayOfObject);
      str1 = this.name;
      break;
      label112: str2 = this.dqq;
      break label60;
      label120: str3 = this.value;
      break label75;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.h
 * JD-Core Version:    0.6.2
 */