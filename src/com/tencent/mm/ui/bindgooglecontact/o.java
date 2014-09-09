package com.tencent.mm.ui.bindgooglecontact;

import android.os.AsyncTask;
import com.tencent.mm.modelfriend.ac;
import com.tencent.mm.sdk.platformtools.z;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

final class o extends AsyncTask
{
  private String jis;
  private String jiv;
  private String jiw;
  private boolean jix;

  public o(BindGoogleContactUI paramBindGoogleContactUI, String paramString)
  {
    this.jiv = paramString;
  }

  private Void aTY()
  {
    try
    {
      String str1 = this.jiv;
      str2 = "";
      localHttpURLConnection = (HttpURLConnection)new URL("https://accounts.google.com/o/oauth2/token").openConnection();
      localHttpURLConnection.setRequestProperty("Charset", "UTF-8");
      localHttpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      localHttpURLConnection.setRequestMethod("POST");
      localHttpURLConnection.setConnectTimeout(20000);
      localHttpURLConnection.setReadTimeout(20000);
      localHttpURLConnection.setDoInput(true);
      localHttpURLConnection.setDoOutput(true);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(new BasicNameValuePair("code", str1));
      localArrayList.add(new BasicNameValuePair("client_id", "369820936870.apps.googleusercontent.com"));
      localArrayList.add(new BasicNameValuePair("client_secret", "wcFhvo-s7wNcmQ9Zjr00H06u"));
      localArrayList.add(new BasicNameValuePair("redirect_uri", "urn:ietf:wg:oauth:2.0:oob"));
      localArrayList.add(new BasicNameValuePair("grant_type", "authorization_code"));
      String str3 = ac.n(localArrayList);
      z.i("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "QueryString:%s", new Object[] { str3 });
      localHttpURLConnection.setRequestProperty("Content-length", String.valueOf(str3.getBytes().length));
      BufferedWriter localBufferedWriter = new BufferedWriter(new OutputStreamWriter(localHttpURLConnection.getOutputStream(), "UTF-8"));
      localBufferedWriter.write(str3);
      localBufferedWriter.flush();
      localBufferedWriter.close();
      int i = localHttpURLConnection.getResponseCode();
      z.e("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "responseCode:" + i);
      if (200 == i)
      {
        localStringBuffer = new StringBuffer();
        localBufferedReader = new BufferedReader(new InputStreamReader(localHttpURLConnection.getInputStream(), "UTF-8"));
        while (true)
        {
          String str4 = localBufferedReader.readLine();
          if (str4 == null)
            break;
          localStringBuffer.append(str4);
        }
      }
    }
    catch (MalformedURLException localMalformedURLException)
    {
      String str2;
      HttpURLConnection localHttpURLConnection;
      StringBuffer localStringBuffer;
      BufferedReader localBufferedReader;
      z.e("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "MalformedURLException:%s" + localMalformedURLException.getMessage());
      while (true)
      {
        return null;
        localBufferedReader.close();
        str2 = localStringBuffer.toString();
        z.i("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "exchange token respone:%s", new Object[] { str2 });
        localHttpURLConnection.disconnect();
        this.jis = new JSONObject(str2).optString("access_token");
        this.jiw = new JSONObject(str2).optString("refresh_token");
        z.i("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "response:%s", new Object[] { str2 });
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = this.jis;
        z.i("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "mAccessToken:%s", arrayOfObject1);
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = this.jiw;
        z.i("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "mRefreshToken:%s", arrayOfObject2);
        this.jix = true;
      }
    }
    catch (ProtocolException localProtocolException)
    {
      while (true)
        z.e("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "ProtocolException:%s" + localProtocolException.getMessage());
    }
    catch (IOException localIOException)
    {
      while (true)
        z.e("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "IOException:%s" + localIOException.getMessage());
    }
    catch (JSONException localJSONException)
    {
      while (true)
        z.e("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "JSONException:%s" + localJSONException.getMessage());
    }
  }

  protected final void onPreExecute()
  {
    super.onPreExecute();
    z.i("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "onPreExecute");
    this.jis = "";
    this.jiw = "";
    this.jix = false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindgooglecontact.o
 * JD-Core Version:    0.6.2
 */