package com.tencent.mm.ui.bindgooglecontact;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.tencent.mm.modelfriend.ad;
import com.tencent.mm.sdk.platformtools.ch;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class z extends AsyncTask
{
  private String dwE;
  private y jiS = y.jiQ;
  private Context mContext;

  private z(GoogleFriendUI paramGoogleFriendUI, Context paramContext, String paramString)
  {
    this.mContext = paramContext;
    this.dwE = paramString;
  }

  private void Ca(String paramString)
  {
    JSONArray localJSONArray1 = new JSONObject(paramString).getJSONObject("feed").getJSONArray("entry");
    int i;
    String str1;
    JSONObject localJSONObject2;
    JSONArray localJSONArray2;
    JSONArray localJSONArray3;
    String str8;
    int n;
    if (localJSONArray1 != null)
    {
      i = 0;
      if (i < localJSONArray1.length())
      {
        str1 = "";
        JSONObject localJSONObject1 = localJSONArray1.getJSONObject(i).optJSONObject("id");
        localJSONObject2 = localJSONArray1.getJSONObject(i).optJSONObject("title");
        localJSONArray2 = localJSONArray1.getJSONObject(i).optJSONArray("gd$email");
        localJSONArray3 = localJSONArray1.getJSONObject(i).optJSONArray("link");
        if (localJSONObject1 == null)
          break label425;
        str8 = localJSONObject1.getString("$t");
        n = str8.lastIndexOf("/");
        if (n <= 0)
          break label425;
      }
    }
    label425: for (String str2 = str8.substring(n + 1); ; str2 = "")
    {
      if (localJSONObject2 != null);
      for (String str3 = localJSONObject2.getString("$t"); ; str3 = "")
      {
        if (localJSONArray3 != null)
          for (int k = 0; k < localJSONArray3.length(); k++)
          {
            String str6 = localJSONArray3.getJSONObject(k).getString("rel");
            int m = str6.lastIndexOf("#");
            if (m > 0)
            {
              String str7 = str6.substring(m + 1);
              if ((!TextUtils.isEmpty(str7)) && ("photo".equals(str7)))
                str1 = localJSONArray3.getJSONObject(k).getString("href");
            }
          }
        String str4 = str1;
        if (localJSONArray2 != null)
          for (int j = 0; j < localJSONArray2.length(); j++)
          {
            String str5 = localJSONArray2.getJSONObject(j).getString("address");
            if ((!TextUtils.isEmpty(str5)) && (ch.iX(str5)) && (!str5.equals(GoogleFriendUI.h(this.jiK))))
            {
              ad localad = new ad();
              localad.field_googleid = str2;
              localad.field_googleitemid = (str2 + str5);
              localad.field_googlename = str3;
              localad.field_googlephotourl = str4;
              localad.field_googlegmail = str5;
              if (!GoogleFriendUI.f(this.jiK).containsKey(str5))
              {
                GoogleFriendUI.e(this.jiK).add(localad);
                GoogleFriendUI.f(this.jiK).put(str5, localad);
              }
            }
          }
        i++;
        break;
        return;
      }
    }
  }

  private Void aTY()
  {
    com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLnMThevO0q+0UFTAwVDdIpvmU3fv1+sU0", "doInBackground");
    int i = 0;
    int j = 1;
    while (true)
    {
      int m;
      int n;
      try
      {
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Integer.valueOf(j);
        arrayOfObject1[1] = Integer.valueOf(i);
        com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLnMThevO0q+0UFTAwVDdIpvmU3fv1+sU0", "startInde:%d, totalCount:%d", arrayOfObject1);
        String str1 = this.dwE;
        URL localURL = new URL("https://www.google.com/m8/feeds/contacts/default/property-email?alt=" + "json" + "&max-results=100&start-index=" + j + "&access_token=" + str1);
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localURL.toString();
        com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLnMThevO0q+0UFTAwVDdIpvmU3fv1+sU0", "requestURL:%s", arrayOfObject2);
        HttpURLConnection localHttpURLConnection = (HttpURLConnection)localURL.openConnection();
        localHttpURLConnection.setRequestMethod("GET");
        localHttpURLConnection.setConnectTimeout(20000);
        int k = localHttpURLConnection.getResponseCode();
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(k);
        com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLnMThevO0q+0UFTAwVDdIpvmU3fv1+sU0", "responseCode:%d", arrayOfObject3);
        String str2;
        if (k == 200)
        {
          InputStream localInputStream = localHttpURLConnection.getInputStream();
          str2 = f(localInputStream);
          localInputStream.close();
          m = new JSONObject(str2).getJSONObject("feed").getJSONObject("openSearch$totalResults").getInt("$t");
          if (m <= 0)
            break label387;
          Ca(str2);
          break label387;
          if ((n == 0) || (GoogleFriendUI.g(this.jiK)))
          {
            this.jiS = y.jiN;
            return null;
          }
        }
        else
        {
          if (k == 401)
          {
            com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLnMThevO0q+0UFTAwVDdIpvmU3fv1+sU0", "Server OAuth Error,Please Try Again.");
            localHttpURLConnection.disconnect();
            str2 = null;
            continue;
          }
          com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLnMThevO0q+0UFTAwVDdIpvmU3fv1+sU0", "Unknow Error.");
          continue;
        }
      }
      catch (IOException localIOException)
      {
        this.jiS = y.jiP;
        com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLnMThevO0q+0UFTAwVDdIpvmU3fv1+sU0", "IOException" + localIOException.getMessage());
        return null;
        n = 0;
        continue;
      }
      catch (JSONException localJSONException)
      {
        this.jiS = y.jiQ;
        com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLnMThevO0q+0UFTAwVDdIpvmU3fv1+sU0", "JSONException" + localJSONException.getMessage());
        return null;
      }
      i = m;
      continue;
      label387: if (m - j > 100)
      {
        j += 100;
        n = 1;
      }
    }
  }

  private static String f(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[20480];
    while (true)
    {
      int i = paramInputStream.read(arrayOfByte, 0, 20480);
      if (i == -1)
        break;
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    return new String(localByteArrayOutputStream.toByteArray(), "UTF-8");
  }

  protected final void onPreExecute()
  {
    super.onPreExecute();
    com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLnMThevO0q+0UFTAwVDdIpvmU3fv1+sU0", "onPreExecute");
    GoogleFriendUI.e(this.jiK).clear();
    GoogleFriendUI.f(this.jiK).clear();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindgooglecontact.z
 * JD-Core Version:    0.6.2
 */